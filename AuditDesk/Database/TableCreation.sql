create database PBL1;

use pbl1;

create table Program (
Program_ID varchar(10) primary key,
Program_name varchar(50),
Program_nature varchar(50)
);

create table Faculty (
Faculty_ID int primary key auto_increment,
Faculty_name varchar(50),
Faculty_Email varchar(50),
Program_ID varchar(10),  
Password varchar(20),
foreign key (Program_ID) references Program(Program_ID)
);

create table Department (
Dept_ID int primary key,
Dept_Name varchar(50)
);

create table Course (
Course_ID int primary key,
Program_ID varchar(10),
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

-- below table are for printing the form

create table Table_Form_1 (
	form_id int primary key,
    name_of_institute varchar(20),
    name_of_department varchar(20),
    name_of_programme varchar(20),
    nature_of_programme varchar(20),
    semester int,
    batch varchar(20),
    co_po_mapping bool,
    session_plan bool,
    evaluation_plan bool,
    attendance bool,
    action_planned_on_CO_attachment bool,
    co_attainment_of_previous_year bool,
    ca_result bool
);

create table Table_form_faculty (
	faculty_id int,
    foreign key(faculty_id) references faculty(faculty_id),
    name_of_faculty varchar(20),
    faculty_type varchar(20),
    form_id int, 
    foreign key(form_id) references table_form_1(form_id)
);
