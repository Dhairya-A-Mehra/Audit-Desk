create database PBL1;

use pbl1;

create table Program (
Program_ID int primary key,
Program_name varchar(50),
Program_nature varchar(50)
);

create table Faculty (
Faculty_ID int primary key,
Facutly_name varchar(50),
Faculty_Email varchar(50),
foreign key (Program_ID) references Program(Program_ID)
);