#### Seminar Manager
Executed using `maven`.
```
mvn -Dmaven.test.skip=true package &&
java -Dspring.datasource.url="<your-database-url>" -Dspring.datasource.username="<your-database-username>" -Dspring.datasource.password="<your-database-user-password>" -Dserver.port="<port>" -jar <file>.jar
```