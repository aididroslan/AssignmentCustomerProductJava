-- INSERT SAMPLE DATA
INSERT INTO Customer (first_name, last_name, email_office, email_personal, family_members)
VALUES 
('John', 'Doe', 'john.doe@office.com', 'john.doe@gmail.com', 'Jane Doe, Jim Doe'),
('Alice', 'Smith', 'alice.smith@office.com', 'alice.smith@gmail.com', 'Bob Smith, Charlie Smith');

INSERT INTO Product (book_title, book_price, book_quantity)
VALUES 
('Spring Boot in Action', 29.99, 100),
('Java Concurrency in Practice', 39.99, 50),
('Effective Java', 45.99, 75);