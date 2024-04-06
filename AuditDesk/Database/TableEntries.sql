insert into program
values 
	("UG-BTECH", "B.Tech.", "UG"),
  	("PG-MTECH", "M.Tech.", "PG");

insert into department
values 
	(121, "CE"),
    	(122, "CSE"),
    	(123, "ENTC"),
    	(125, "ME"),
    	(126, "AIML"),
    	(127, "RNA"),
	(146, "GST"),
   	(147, "ES"),
    	(148, "RNA"),
    	(149, "AIML"),
    	(150, "ED"),
    	(152, "AT");

insert into Faculty (Faculty_Name, Faculty_Email, Program_ID, password)
values 
	( "ABC", "abc@gmail.com", "UG-BTECH", "12345" ),
    	("QWERTY", "qwerty@gmail.com", "PG-MTECH", "09876"),
    	("ASDF", "asdf@fmail,com", "UG-BTECH", "635890"),
    	("POIU","poiu@gmail.com", "PG-MTECH", "161104");


INSERT INTO Course (Course_ID, Program_ID, Course_Nature, Credits, Course_Title)
SELECT c.Course_ID, c.Program_ID, c.Course_Nature, c.Credits, c.Course_Title
FROM (
    SELECT 0701220401 AS Course_ID, "UG-BTECH" AS Program_ID, "BS" AS Course_Nature, 3 AS Credits, "EM III" AS Course_Title UNION ALL
    SELECT 0701220402, "UG-BTECH", "PC", 4, "OOP with Java" UNION ALL
    SELECT 0701220403, "UG-BTECH", "PC", 3, "Operating System" UNION ALL
    SELECT 0701220404, "UG-BTECH", "PC", 1, "Operating System Lab" UNION ALL
    SELECT 0701220405, "UG-BTECH", "PC", 3, "DBMS" UNION ALL
    SELECT 0701220406, "UG-BTECH", "PC", 2, "DBMSL" UNION ALL
    SELECT 0701220407, "UG-BTECH", "PIS", 2, "PBL-1" UNION ALL
    SELECT 0701220408, "UG-BTECH", "NA", 0, "IDMP" UNION ALL
    SELECT 0701220409, "UG-BTECH", "GE", 2, "Basic German I" UNION ALL
    SELECT 0701220410, "UG-BTECH", "GE", 2, "Basic French I"
) AS c
JOIN Program p ON c.Program_ID = p.Program_ID;

INSERT INTO Include (Include_id, Dept_ID, Course_ID) VALUES
(1, 121, 0701220401),
(2, 122, 0701220402), 
(3, 123, 0701220403),
(4, 125, 0701220404),
(5, 126, 0701220405), 
(6, 127, 0701220406), 
(7, 146, 0701220407),
(8, 147, 0701220408), 
(9, 148, 0701220409),
(10, 149, 0701220410);

INSERT INTO Internal_Assessment (Assessment_ID, Course_ID, Planned_Date, Conducted_Date, Result_Date, Types, Student_Signature) VALUES
(01, 0701220401, '2024-04-10', '2024-04-15', '2024-04-20', 'Midterm Exam', TRUE),
(02, 0701220402, '2024-04-12', '2024-04-17', '2024-04-22', 'Quiz', TRUE),
(03, 0701220403, '2024-04-11', '2024-04-16', '2024-04-21', 'Assignment', FALSE),
(04, 0701220404, '2024-04-25', '2024-04-30', '2024-05-05', 'Final Exam', TRUE),
(05, 0701220405, '2024-04-28', '2024-05-03', '2024-05-08', 'Presentation', TRUE),
(06, 0701220406, '2024-04-30', '2024-05-05', '2024-05-10', 'Lab Report', FALSE);
