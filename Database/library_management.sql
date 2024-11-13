CREATE TABLE Books (
book_id INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(50),
author_id INT,
publication_year YEAR,
price DECIMAL(10,2),
FOREIGN KEY (author_id) REFERENCES Authors(author_id)
);
CREATE TABLE Authors (
author_id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50)
);
CREATE TABLE Borrowers (
borrower_id INT AUTO_INCREMENT PRIMARY KEY,
first_name VARCHAR(50),
last_name VARCHAR(50),
email VARCHAR(100) UNIQUE,
dob DATE
);
CREATE TABLE Loans (
loan_id INT AUTO_INCREMENT PRIMARY KEY,
borrower_id INT,
book_id INT,
loan_date DATE,
return_date DATE,
FOREIGN KEY (borrower_id) REFERENCES Borrowers(borrower_id),
FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

INSERT INTO Authors(first_name,last_name) VALUES ('F. Scott', 'Fitzgerald'),('Harper', 'Lee'),('George', 'Orwell'),('Jane', 'Austen'),('Herman', 'Melville');
SELECT * FROM Authors;
INSERT INTO Books(title,author_id,publication_year,price) VALUES ('The Great Gatsby', 1, 1925, 50),('To Kill a Mockingbird', 2, 1960, 20),('1984', 3, 1949, 30),('Pride and Prejudice', 4, 1913, 19),('Moby Dick', 5, 1951, 40);
SELECT * FROM Books;
INSERT INTO Borrowers(first_name,last_name,email,dob) VALUES ('John', 'Doe', 'johndoe@gmail.com', '1990-05-14'),
('Jane', 'Smith', 'janesmith@gmail.com', '1985-11-22'),
('Sarah', 'Jones', 'sarahjones@gmail.com', '1992-12-19'),
('Emily', 'Brown', 'emilybrown@gmail.com', '1996-02-17'),
('Michael', 'Johnson', 'michaeljohnson@gmail.com', '1993-08-30');
SELECT * FROM Borrowers;
INSERT INTO Loans(borrower_id,book_id,loan_date,return_date) VALUES (1,6,'2024-10-29','2024-11-1'),
(2,7,'2024-10-15','2024-11-5'),
(3,8,'2024-10-8','2024-11-1'),
(4,9,'2024-10-2','2024-10-15'),
(5,10,'2024-11-1','2024-11-11');
SELECT * FROM Loans;


SELECT * FROM Books;
SELECT title,price,publication_year FROM Books WHERE price>20;
SELECT first_name,last_name,email FROM Borrowers WHERE borrower_id IN (SELECT borrower_id from Loans where loan_date>'2024-10-15');

UPDATE Books SET price=25 where title='The Great Gatsby';

DELETE FROM Loans WHERE book_id = (SELECT book_id FROM Books WHERE title = "moby dick");
DELETE FROM Books WHERE title='Moby Dick';

ALTER TABLE Books ADD COLUMN genre VARCHAR(50);

SELECT count(borrower_id) AS totalNoOfBorrowers FROM Borrowers;
SELECT sum(price) AS SumOfPrice FROM Books;
SELECT avg(price) AS AvgOfPrice FROM Books;

SELECT * FROM Books WHERE book_id IN (SELECT book_id FROM Loans WHERE borrower_id IN (SELECT borrower_id FROM Borrowers WHERE TIMESTAMPDIFF(YEAR,dob,CURDATE())>30));
