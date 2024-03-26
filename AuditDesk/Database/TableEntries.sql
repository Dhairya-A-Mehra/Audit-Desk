-- For Program
INSERT INTO Program (Program_ID, Program_name, Program_nature)
VALUES
  (1, 'Bachelor of Science in Computer Science', 'Undergraduate'),
  (2, 'Master of Business Administration', 'Graduate'),
  (3, 'Bachelor of Arts in English Literature', 'Undergraduate'),
  (4, 'Bachelor of Science in Mathematics', 'Undergraduate'),
  (5, 'Master of Science in Data Science', 'Graduate'),
  (6, 'Associate of Applied Science in Nursing', 'Associate Degree'),
  (7, 'Bachelor of Arts in History', 'Undergraduate'),
  (8, 'Master of Public Administration', 'Graduate'),
  (9, 'Bachelor of Science in Biology', 'Undergraduate'),
  (10, 'Master of Education', 'Graduate');

-- Faculty 
INSERT INTO Faculty (Faculty_ID, Facutly_name, Faculty_Email, Program_ID)
VALUES
  (1, 'Dr. Alice Jones', '[email address removed]', 1),
  (2, 'Prof. Michael Smith', '[email address removed]', 2),
  (3, 'Ms. Emily Brown', '[email address removed]', 3),
  (4, 'Dr. David Lee', '[email address removed]', 4),
  (5, 'Prof. Sarah Garcia', '[email address removed]', 5),
  (6, 'Ms. Jane Williams', '[email address removed]', 6),
  (7, 'Dr. Charles Miller', '[email address removed]', 7),
  (8, 'Prof. Elizabeth Moore', '[email address removed]', 8),
  (9, 'Ms. Katherine Thomas', '[email address removed]', 9),
  (10, 'Dr. Daniel Johnson', 'd [email address removed]', 10);

-- Login
INSERT INTO Login (Email_id, Faculty_ID, Password)
SELECT Faculty_Email, Faculty_ID, 'password'  
FROM Faculty;

-- Department
INSERT INTO Department (Dept_ID, Dept_Name)
VALUES
  (1, 'Computer Science'),
  (2, 'Business Administration'),
  (3, 'English Literature'),
  (4, 'Mathematics'),
  (5, 'Data Science'),
  (6, 'Nursing'),
  (7, 'History'),
  (8, 'Public Administration'),
  (9, 'Biology'),
  (10, 'Education');

-- Course 
INSERT INTO Course (Program_ID, Course_Nature, Credits, Course_Title)
VALUES
  (1, 'Core', 3, 'Introduction to Programming'),
  (2, 'Elective', 3, 'Business Management'),
  (3, 'Core', 3, 'British Literature'),
  (4, 'Core', 4, 'Calculus I'),
  (5, 'Elective', 3, 'Data Structures and Algorithms');

-- Include 
INSERT INTO Include (Dept_ID, Course_ID)
VALUES
  (1, 1),  
  (2, 2), 
  (3, 3),  
  (4, 4), 
  (5, 5);  

-- pending for Internal Assessment and Teaching Scheme 
