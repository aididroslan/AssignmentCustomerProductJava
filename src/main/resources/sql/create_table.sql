CREATE TABLE Customer (
    id BIGINT PRIMARY KEY IDENTITY(1,1),
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email_office VARCHAR(100),
    email_personal VARCHAR(100),
    family_members VARCHAR(255)
);

CREATE TABLE Product (
    id BIGINT PRIMARY KEY IDENTITY(1,1),
    book_title VARCHAR(100) NOT NULL,
    book_price DECIMAL(10, 2) NOT NULL,
    book_quantity INT NOT NULL
);