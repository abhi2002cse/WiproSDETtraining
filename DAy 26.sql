CREATE DATABASE seleniumdb;
USE seleniumdb;

CREATE TABLE login_data (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO login_data(username, password)
VALUES
('standard_user', 'secret_sauce'),
('problem_user', 'secret_sauce'),
('performance_glitch_user', 'secret_sauce');

SELECT * FROM login_data;