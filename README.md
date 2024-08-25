# MANAJEMEN PENGAJUAN KREDIT

Aplikasi untuk membantu proses approval pengajuan 
kredit yang melibatkan customer, penyedia kendaraan 
dan tim manajemen pembiayaan. 

## Spesifikasi
1. URL Frontend : https://github.com/devamahesa/pengajuan
2. Database : Postgresql

## Instalasi
1. Buat file ```application.properties``` pada directory ```src/main/resources/ ``` dengan konfigurasi seperti berikut
````env
spring.application.name=pengajuan
server.port={URL Pada Aplikasi Ini}

spring.datasource.url={URL Database}
spring.datasource.username={Username Database}
spring.datasource.password={Password Database}

#hibernate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.default_schema={Schema yang digunakan}
spring.jpa.hibernate.ddl-auto=update

logging.level.org.SQL=debug
logging.level.org.hibernate.type=TRACE

server.fe.url={URL Frontend yang sedang dijalankan}
````
2. Setup database untuk proses migrasi data pada file ```gradle.properties```. Jika tidak ada,
maka buat filenya terlebih dahulu pada directory utama

````env
flyway.url = {URL Database}
flyway.user = {Username Database}
flyway.password = {Password Database}
flyway.schemas = {Schema yang digunakan}
flyway.table = flyway_schema_history
flyway.tablespace = pg_default
flyway.outOfOrder = false
````

## Migrasi data
```bash
flyway -i clean
flyway -i baseline
flyway -i migrate
```