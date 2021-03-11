# camt.053
create and parse camt.053 xml files


## Usage
```shell
$ ./gradlew clean build
$ java -jar build/libs/camt053-1.0.jar

$ cat helloworld.xml
```

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<document xmlns="urn:iso:std:iso:20022:tech:xsd:camt.053.001.02">
    <BkToCstmrStmt>
        <GrpHdr>
            <MsgId>Message ID</MsgId>
            <CreDtTm>2021-02-09T12:00:00.000Z</CreDtTm>
        </GrpHdr>
        <Stmt>
            <Id>123456789</Id>
            <ElctrncSeqNb>201200237</ElctrncSeqNb>
            <CreDtTm>2021-02-09T12:00:00.000Z</CreDtTm>
            <TxsSummry>
                <TtlNtries>
                    <NbOfNtries>1</NbOfNtries>
                    <Sum>200</Sum>
                    <CdtDbtInd>CRDT</CdtDbtInd>
                </TtlNtries>
                <TtlCdtNtries>
                    <NbOfNtries>4</NbOfNtries>
                    <Sum>100</Sum>
                </TtlCdtNtries>
            </TxsSummry>
        </Stmt>
    </BkToCstmrStmt>
</document>
```
