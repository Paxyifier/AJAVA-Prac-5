# AJAVA Practical 5
## Spring JDBC
Theory
<br>
**Q**: Explain Spring JDBC, DAO, RowMapper, PreparedStatement and ResultExtractor with small snippets
**A**:
<br>
#### Spring JDBC:
Spring JDBC is a module of the Spring framework that provides templates and APIs for simplifying the JDBC (Java Database Connectivity) operations. It reduces the amount of code needed for database operations and makes it easier to work with databases.

#### DAO (Data Access Object):
DAO is a design pattern that provides an abstract interface for accessing data from a database. It separates the data access logic from the business logic and makes it easier to test and maintain the code. In Spring, you can create DAO classes that implement the DAO interface and perform database operations.

#### RowMapper:
RowMapper is an interface in Spring JDBC that maps a single row of a result set to a Java object. It provides a way to map the result set to a custom object instead of using the result set directly. In Spring, you can create a custom implementation of the RowMapper interface to map result set rows to custom objects.

#### PreparedStatement:
A PreparedStatement is an interface in JDBC that represents a precompiled SQL statement. It provides a way to execute SQL statements with variables. PreparedStatements are faster and more secure than regular Statement objects. In Spring, you can use the JdbcTemplate's query methods that accept a PreparedStatementCreator or a CallableStatementCreator to execute a PreparedStatement.

#### ResultExtractor:
ResultExtractor is an interface in Spring JDBC that provides a way to extract the results of a query into a single value or a custom object. It can be used to extract the results of a query that returns a single row or multiple rows. In Spring, you can create a custom implementation of the ResultExtractor interface to extract the results of a query into a custom object.


Questions
create an employee table in mysql
id,name, salary


1. Write a program to insert, update and delete records from the given table.
2. Write a program to demonstrate RowMapper interface to fetch the records from the database.
3. Write a program to demonstrate PreparedStatement in Spring JdbcTemplate.
4. Write a program in Spring JDBC to demonstrate ResultSetExtractor Interface
