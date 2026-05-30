Create database Employee_db;
Use Employee_db;
Select database();

CREATE table Employees(
emp_id INT primary KEY, 
emp_name varchar (80),
department varchar(100),
salary decimal(10, 2),
email varchar(150),
joining_date DATE
);

select * from Employees;

INSERT INTO Employees(emp_id, emp_name, department, salary,
								email,joining_date)
values
(101, 'Rahul', 'IT', 250000, 'rahul22@gmail.com', '2026-06-21'),
(102, 'abhi' , 'Mech', 65000, 'abhi123@gmail.com', '2026-07-1'),
(103, 'Ravi' , 'ECE', 51000, 'Ravi23@gmail.com', '2026-06-12'),
(104, 'Ram' , 'IT', 40000, 'Ram@gmail.com', '2026-07-14'),
(105, 'Supriya' , 'Mech', 75000, 'Supriya3@gmail.com', '2026-07-1');


SELECT * 
FROM Employees
WHERE department = 'IT';

INSERT INTO Employees
value
(106, 'Raj', 'Testing', 550000, 'raj22@gmail.com', '2026-06-11');

UPDATE Employees
SET salary = salary + 5444
WHERE emp_id = 106;


DELETE FROM Employees
WHERE emp_id = 103;

SELECT * 
FROM Employees
ORDER BY salary DESC;

SELECT *
FROM EMployees
ORDER BY salary DESC
LIMIT 2;

SELECT COUNT(*) AS total_employees
FROM Employees;

SELECT AVG(salary) AS average_salary
FROM Employees;

SELECT MAX(salary) AS highest_salary,
       MIN(salary) AS lowest_salary
FROM Employees;

SELECT department, COUNT(*) AS total_employees
FROM Employees
GROUP BY department;

SELECT department, COUNT(*) AS total_employees
FROM Employees
GROUP BY department
HAVING COUNT(*) > 1;

SELECT *
FROM Employees
WHERE email is NULL;

SELECT * 
FROM Employees
WHERE emp_name LIKE 'R%';

SELECT * 
FROM Employees
WHERE salary BETWEEN 40000 AND 60000;

SELECT * 
FROM Employees
WHERE department IN ('HR', 'IT');

ALTER TABLE Employees
ADD mobile_number VARCHAR(10);

SELECT * FROM Employees;

ALTER TABLE Employee
RENAME COLUMN emp_name To employee_name;

ALTER TABLE Employees
DROP COLUMN mobile_
