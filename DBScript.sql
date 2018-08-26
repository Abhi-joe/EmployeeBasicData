create database EmployeeBasicData;

use EmployeeBasicData;

create table EmployeeData (
employeeID int auto_increment primary key,
firstname varchar(20),
middlename varchar(20),
lastname varchar(20),
fathersname varchar(50),
mothersname varchar(50),
ismarried bool,
age int,
bloodgroup varchar(5)
);

insert into employeedata (firstname, middlename, lastname, fathersname, mothersname, ismarried, age, bloodgroup) values("Omkar", "Rajeev", "Nilakhe", "Rajeev Nilakhe", "abc def", false, 25, "b+ve");