create database PBL1;

use pbl1;

create table Program (
Program_ID int primary key,
Program_name varchar(50),
Program_nature varchar(50)
);

create table Faculty (
Faculty_ID int primary key auto_increment,
Faculty_name varchar(50),
Faculty_Email varchar(50),
Program_ID int,  
Password varchar(20),
foreign key (Program_ID) references Program(Program_ID)
);

create table Department (
Dept_ID int primary key,
Dept_Name varchar(50)
);

create table Course (
Course_ID int primary key,
Program_ID int,
foreign key(Program_ID) references Program(Program_ID),
Course_Nature varchar(20),
Credits int,
Course_Title varchar(25)
);

create table Include (
Include_id int primary key,
Dept_ID int,
foreign key(Dept_ID) references Department (Dept_ID),
Course_ID int,
foreign key(Course_ID) references Course(Course_ID)
);

create table Teaching_Scheme(
Course_ID int,
foreign key(Course_ID) references Course(Course_ID),
Lab_or_Tutorial int,
Lecture int
);

create table Internal_Assessment (
Assessment_ID int primary key,
Course_ID int,
foreign key(Course_ID) references Course(Course_ID),
Planned_Date DATE,
Conducted_Date DATE,
Result_Date DATE,
Types varchar(30),
Student_Signature BOOLEAN
);
