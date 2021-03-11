package tech.maslick.camt053

import net.tjeerd.camt053parser.model.*
import java.io.File
import java.math.BigDecimal
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import javax.xml.datatype.DatatypeFactory


fun main() {
    val groupHeader42 = GroupHeader42()
    groupHeader42.msgId = "Message ID"
    groupHeader42.creDtTm = DatatypeFactory.newInstance().newXMLGregorianCalendar(2021, 2, 9, 12, 0, 0, 0, 0)

    val statementV02 = BankToCustomerStatementV02()
    statementV02.grpHdr = groupHeader42

    val accStmt = AccountStatement2()
    accStmt.id = "123456789"
    accStmt.elctrncSeqNb = BigDecimal(201200237)
    accStmt.creDtTm = DatatypeFactory.newInstance().newXMLGregorianCalendar(2021, 2, 9, 12, 0, 0, 0, 0)

    val trans = NumberAndSumOfTransactions1()
    trans.sum = BigDecimal(100)
    trans.nbOfNtries = "4"

    val summary = TotalTransactions2()
    summary.ttlCdtNtries = trans

    val trans2 = NumberAndSumOfTransactions2()
    trans2.sum = BigDecimal(200)
    trans2.cdtDbtInd = CreditDebitCode.CRDT
    trans2.nbOfNtries = "1"

    summary.ttlNtries = trans2

    accStmt.txsSummry = summary
    statementV02.stmt = mutableListOf(accStmt)

    val document = Document()
    document.bkToCstmrStmt = statementV02

    val jaxbContext = JAXBContext.newInstance(Document::class.java)
    val jaxbMarshaller = jaxbContext.createMarshaller()
    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)

    jaxbMarshaller.marshal(document, File("helloworld.xml"));
    jaxbMarshaller.marshal(document, System.out);
}