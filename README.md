# openthesaurus-rest-api
A REST API for https://www.openthesaurus.de/ data with Spring Boot.

![Maven Build](https://github.com/quasiris/openthesaurus-rest-api/workflows/Java%20CI%20with%20Maven/badge.svg)
![last commit](https://img.shields.io/github/last-commit/quasiris/openthesaurus-rest-api)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


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
 - Download mysql dump from https://www.openthesaurus.de/export/openthesaurus_dump.tar.bz2
 - unzip and untar the file
 - gzip the sql dump file

```
gunzip < openthesaurus_dump.sql.gz | mysql openthesaurus

```

## Links
 - https://github.com/danielnaber/openthesaurus

## License

[MIT](LICENSE)

