package P010_JDBC.E1_Callable_Statement;

public class Main {

}

/*
What is a Stored Procedure?

Normally, Java sends SQL queries directly.

Interview Definition
CallableStatement
CallableStatement is used to call Stored Procedures present in the database.

Example:

INSERT INTO KGF_TABLE VALUES (101,'Sathish');

or

UPDATE KGF_TABLE SET employeename='Arun' WHERE employeeid=101;

These queries are written in Java.

But...
Sometimes the database itself contains a program.
That program is called a Stored Procedure.


------------------------------------------------------------

Statement --> Normal SQL
PreparedStatement --> Parameterized SQL
CallableStatement --> Stored Procedure

--------------------------------------------------------------------------

Before Coding
We first need to create a Stored Procedure in MySQL.
Because Java cannot call something that doesn't exist.

So our order will be:
Step 1
Create Stored Procedure in MySQL
↓
Step 2
Call it using CallableStatement
↓
Step 3
Understand IN, OUT and INOUT Parameters

*/