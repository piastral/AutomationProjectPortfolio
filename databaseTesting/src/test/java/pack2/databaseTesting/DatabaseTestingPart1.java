package pack2.databaseTesting;

public class DatabaseTestingPart1 {
/*DATABASE TESTING USING SELENIUM  (INCLUDES DATABASE CONCEPT AND SQL )]
 * 1-)DATABASE TESTING : validating wheather the data displaying on the user interface is matching the data
 * that is stored in the database 
 * example:: adding a new user from ui ,should add a new record with the same user details nder the tables
 * lets say user_tables in db 
 * and one mere lets new user which becomes now existing user want to update its details ..we hould 
 * check the details is updated under the tables in database and also should be displayed the updated 
 * detailes to the user ...
 * 
 * -----------------------------------------------
 * WHAT IS DATABASE TESTING?::
 * ANS::database is collected of related data 
 * 
 * WHAT ARE DATA MODELS??
 * ans:: define how data is connected with each other and stored inside the system 
 * types of data models ::hierarchial models ,network model,entity-relationship model
 * and relational model- we are using this model in real time
 * 
 * ::RELATIONAL MODEL::
 * is popular and widely used by most of the dbms 
 * dbms uses relational data models known as rdbms 
 * data is stored in the form of tables (Tbales organize data n the form of coulumn and rows)
 * example::employee data 
 * 
 * what is sql ?
 * sql is structured query language for relation database 
 * following actions we can performe with sql 
 * 1-Retreiving the data from database 
 * 2-insertng data 
 * 3-deleting data 
 * 4- update existing data ...
 * etc
 * 
 * 
 * THE PURPOSE OF USING SQL 
 * -----------------------------------------------------------------------------------------------------------
 * SELECT STATMENT :: RETRIEVE THE DATA FROM RELATIONAL DATABASE TABLE 
 * Q-I HAVE TO RETRIEVE ALL DATA FROM TABLE WHAT IS THE COMMAND?
 * ANS: SELECT*FROM table_name; (it will give full details ) * means ALL 
 * q-2 --how to retrieve the particular column? 
 * ans:: Select ID ,city FROM customers ; (will select only less) column
 * q-3// NOW RETREIVE DATA(ROWS) FROM CUSTOMER TABLE (london) city name...
 * --------------------------------------------------------------------------------------------------------------------------
 * WHERE CLAUSE GIVES CONDITION TO THE STARTMENT FOR FILETRING THE DATA IN THE TABLES 
 * 
 * ANS:: we will use SELECT * from customers Where City ='London'; suurond with qutes because of string
 * same:: SELECT * FROM customers WHERE id=1;// no need tp sourround with string because its integer 
 * ------------------------------------------------------------------------------------------------------------------------------
 * q-4 next sql startement is order by 
 * ORDER BY -used tto sort the result in ascending or descind order all the data in table will be retrived 
 * and displayed in ascending or descing order ...
 * ans slecct a data or comman with order by 
 * SELECT * FROM CUSTOMERS orderBY country ASC;//(the name of the country will come in alphabetical order 
 * tarting from a to z
 * 
 * same ASELECT * FROM CUSTOMER ORDER BY COUTRY DESC // FROM REVERSE IT WILL COME 
 * -------------------------------------------------------------------------------------------------------------------------------
 * --------------------------------------------------------------------------------------------------------------------------
 * NEXT SQL STATEMENT INSERT STATEMENT 
 * --------------------------------------------------
 * INSERT INTO :: used to add new data into the data base using the table 
 * 1-INSERT INTO customers (ID,CustomerNAME   ContactName, Address, City, PostalCode, Country) VALUES 
 * ('92','MOHAMMED MASOOD', 'MASOOD', '85-43 167th', 'Newyork', '11432', 'USA');
 * i can all insert only few columns 
 * example INSERT INTO customers(City) Values ('Jamaica);
 * -----------------------------------------------------------------------------------------------------------------------------
 * UPDATE STATEMENT :: used to modify the existing records in database table;
 * update customers(table name ) Set Country='India',
 * CustomerName='Mohammed'
 * WHERE ID(WE HAVE TO PROVIDE WHICH ID NUMBER ) =501 //FOR EXAMPLE..

 * ------------------------------------------------------------------------------------------------------------------------
 * 
 * DELETE statement ::
 * DELETE used to delete the existing records in the database 
 * DELETE from customers Where id =1
 * to restore back the complete customer table by selecting 'restore database' option 
 * ---------------------------------------------------------------
 * 
 * ALL THESE COMMAND ARE GOOD FOR COVERING FOR SELENIUM 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 	
 */

}
