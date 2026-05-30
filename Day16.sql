CREATE DATABASE ecommerce_db;



USE ecommerce_db;


CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    city VARCHAR(50),
    referred_by INT
);


CREATE TABLE products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    price INT
);



CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    order_date DATE,

    FOREIGN KEY (customer_id)
    REFERENCES customers(customer_id),

    FOREIGN KEY (product_id)
    REFERENCES products(product_id)
);



CREATE TABLE payments (
    payment_id INT PRIMARY KEY,
    order_id INT,
    amount INT,
    payment_method VARCHAR(30),

    FOREIGN KEY (order_id)
    REFERENCES orders(order_id)
);



INSERT INTO customers VALUES
(1, 'Rahul', 'Delhi', NULL),
(2, 'Abhi', 'Mumbai', 1),
(3, 'Ravi', 'Kolkata', 1),
(4, 'Ram', 'Chennai', NULL);


INSERT INTO products VALUES
(101, 'Laptop', 50000),
(102, 'Phone', 20000),
(103, 'Headphones', 3000),
(104, 'Keyboard', 1500);



INSERT INTO orders VALUES
(1001, 1, 101, '2025-01-10'),
(1002, 2, 102, '2025-01-12'),
(1003, 1, 103, '2025-01-15');



INSERT INTO payments VALUES
(1, 1001, 50000, 'UPI'),
(2, 1002, 20000, 'Card');



SELECT orders.order_id,
       payments.amount,
       payments.payment_method
FROM orders
LEFT JOIN payments
ON orders.order_id = payments.order_id;



SELECT customers.customer_name,
       payments.amount,
       payments.payment_method
FROM customers

RIGHT JOIN orders
ON customers.customer_id = orders.customer_id

RIGHT JOIN payments
ON orders.order_id = payments.order_id;
