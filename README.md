# camt053
create and parse camt053 xml files


## Usage
```shell
$ ./gradlew clean build
$ java -jar build/libs/camt053-1.0.jar

$ cat helloworld.xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<document xmlns="urn:iso:std:iso:20022:tech:xsd:camt.053.001.02">
    <BkToCstmrStmt>
        <GrpHdr/>
    </BkToCstmrStmt>
</document>
```
