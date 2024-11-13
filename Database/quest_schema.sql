CREATE TABLE Customer (
    CustomerID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    Phone VARCHAR(15),
    Address VARCHAR(255)
);
 
CREATE TABLE Product (
    ProductID INT PRIMARY KEY,
    ProductName VARCHAR(100),
    Price DECIMAL(10, 2),
    StockQuantity INT
);
 
CREATE TABLE Customer_Order (
    OrderID INT PRIMARY KEY,
    CustomerID INT,
    OrderDate DATE,
    TotalAmount DECIMAL(10, 2),
    FOREIGN KEY (CustomerID) REFERENCES Customer(CustomerID)
);
 
CREATE TABLE Order_Item (
    OrderItemID INT PRIMARY KEY,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    PriceAtPurchase DECIMAL(10, 2),
    FOREIGN KEY (OrderID) REFERENCES Customer_Order (OrderID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);
INSERT INTO Customer VALUES (1,"John","Doe","johndoe123@gmail.com","965127945","Mumbai");
SELECT * FROM Customer;
INSERT INTO Product VALUES (5,"Jeans",800,1);
INSERT INTO Customer_Order VALUES (1,1,'2024-11-11',800);
INSERT INTO Order_Item VALUES (1,1,5,1,800);
INSERT INTO Customer(CustomerId,FirstName,LastName,Email,Phone,Address) VALUES (2,"Alex","Parker","alexparker123@gmail.com","956412783","Kochi");
INSERT INTO Customer(CustomerId,FirstName,LastName,Email,Phone,Address) VALUES (3,"Ethan","Brooks","athanbrooks123@gmail.com","9567845653","Kochi"),(4,"Joy","B","joya478@gmail.com","965432785","Delhi");
INSERT INTO Product (ProductID, ProductName, Price, StockQuantity)
VALUES
    (1, 'Laptop', 750.00, 25),
    (2, 'Smartphone', 500.00, 50),
    (3, 'Tablet', 300.00, 30),
    (4, 'Smartwatch', 150.00, 40),
    (5, 'Headphones', 80.00, 100),
    (6, 'External Hard Drive', 120.00, 60),
    (7, 'Wireless Keyboard', 45.00, 80),
    (8, 'Monitor', 200.00, 35),
    (9, 'USB Flash Drive', 15.00, 200),
    (10, 'Mouse', 25.00, 150);
INSERT INTO Customer_Order (OrderID, CustomerID, OrderDate, TotalAmount)
VALUES
    (1, 2, '2024-10-01', 500.00),
    (2, 2, '2024-10-03', 1500.00),
    (3, 3, '2024-10-05', 750.00),
    (4, 4, '2024-10-07', 1200.00),
    (5, 3, '2024-10-10', 300.00),
    (6, 2, '2024-10-12', 450.00),
    (7, 2, '2024-10-15', 600.00),
    (8, 3, '2024-10-18', 700.00),
    (9, 4, '2024-10-20', 250.00),
    (10, 4, '2024-10-22', 850.00);

