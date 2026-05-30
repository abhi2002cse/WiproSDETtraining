CREATE DATABASE EmployeeSalaryDB;

USE EmployeeSalaryDB;

CREATE TABLE employees(
emp_id INT PRIMARY KEY,
name VARCHAR(100),
department VARCHAR(100),
salary DECIMAL(10, 2)
);

INSERT INTO employees(emp_id, name, department, salary)
VALUES
(101, 'Rahul', 'IT', 90000),
(102, 'Abhi', 'Testing', 50000),
(103, 'Ravi', 'ECE', 75000),
(104, 'Ram', 'IT', 120000),
(105, 'Supriya', 'HR', 85000),
(106, 'Amit', 'Testing', 65000);

SELECT * FROM employees;

SELECT name, salary
FROM employees
WHERE salary > (SELECT AVG(salary)
				FROM employees)
ORDER BY salary DESC
LIMIT 3;
