
-- 1NF table structure ----------------------------
CREATE TABLE Orders_1NF (
    OrderID INT,
    CustomerName VARCHAR(100),
    ProductName VARCHAR(100)
);

-- inserting data in 1NF form
INSERT INTO Orders_1NF (OrderID, CustomerName, ProductName) VALUES
(1, 'Sheril Shaji', 'Watch'),
(1, 'Sheril Shaji', 'Laptop'),
(2, 'Ajmal', 'Monitor'),
(2, 'Ajmal', 'Mouse');

select * from orders_1nf;

-- --------TO APPLY 2NF in student table-----------------------
-- Students table
CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(100)
);

-- Courses table
CREATE TABLE Courses (
    CourseID INT PRIMARY KEY,
    CourseName VARCHAR(100),
    InstructorID INT
);

-- Instructors table
CREATE TABLE Instructors (
    InstructorID INT PRIMARY KEY,
    InstructorName VARCHAR(100)
);

-- Student_Courses associative table
CREATE TABLE Student_Course_Assignment (
    StudentID INT,
    CourseID INT,
    PRIMARY KEY (StudentID, CourseID),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);

-- Insert data into normalized tables
INSERT INTO Students (StudentID, StudentName) VALUES (1, 'Sheril Shaji'), (2, 'Ajmal');

INSERT INTO Courses (CourseID, CourseName, InstructorID) VALUES (101, 'Science', 201), (102, 'Math', 202);

INSERT INTO Instructors (InstructorID, InstructorName) VALUES (201, 'Prof. Steffin'), (202, 'Prof. Sarath');

INSERT INTO Student_Course_Assignment (StudentID, CourseID) VALUES (1, 101), (2, 102);


--  3NF table for Sales Table --------------------------------------------------------
-- Sales table
CREATE TABLE Sales (
    SalesID INT PRIMARY KEY,
    ProductID INT,
    SaleDate DATE,
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-- Products table
CREATE TABLE Products (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    CategoryID INT
);

-- Categories table
CREATE TABLE Categories (
    CategoryID INT PRIMARY KEY,
    CategoryName VARCHAR(100)
);

-- insertion 

INSERT INTO Products (ProductID, ProductName, CategoryID) VALUES (1001, 'Mobile', 301), (1002, 'Table', 403);
INSERT INTO Categories (CategoryID, CategoryName) VALUES (301, 'Electronics'), (403, 'Furniture');
INSERT INTO Sales (SalesID, ProductID, SaleDate) VALUES (1, 1001, '2024-05-7'), (2, 1002, '2024-01-10');




