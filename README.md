#Assessment API

This is a note-taking REST API, created with Spring-Boot framework
and MySQL as the DBMS.

### Instructions:

Download MySQL from here if it's not already installed:\
[MySQL MacOS Download](https://dev.mysql.com/doc/mysql-osx-excerpt/5.7/en/osx-installation-pkg.html)

#### Set up the database:
1. Git clone project
2. cd into project
3. To connect to MySQL server \
$ `mysql -uroot -p`
4. Enter your MySQL password
5. This step will  create database from a txt file, run the following command:\
 mysql> `source sql_data.txt`
 
 #### Before running and compiling:
 The app will need your MySQL password to access the server and database created in previous steps.
 Go to file:
 > note_api/src/main/resources/application.properties
 
Add your MySQL password to line 3:
> spring.datasource.password=[YOUR MYSQL PASSWORD]