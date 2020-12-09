# openthesaurus-rest-api


## Database

Create
```
CREATE DATABASE `openthesaurus`;
CREATE USER 'openthesaurus' IDENTIFIED BY 'ztZC2nRxWKE4itV';
GRANT USAGE ON *.* TO 'openthesaurus'@'%' IDENTIFIED BY 'ztZC2nRxWKE4itV';
GRANT ALL privileges ON `openthesaurus`.* TO 'openthesaurus'@'%';
FLUSH PRIVILEGES;
```
Import

```
gunzip < openthesaurus_dump.sql.gz | mysql openthesaurus

```