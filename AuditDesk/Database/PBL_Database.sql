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

create table Login (
Email_id varchar(50) primary key,
Faculty_ID int,
foreign key (Facluty_ID) references Faculty (Faculty_ID),
Password varchar(15)
);

create table Department (
Dept_ID int primary key,
Dept_Name varchar(50)
);

create table Include (
Include_id int primary key,
Dept_ID int,
foreign key(Dept_ID) references Department (Dept_ID),
-- course id pending as course table is pending
);
