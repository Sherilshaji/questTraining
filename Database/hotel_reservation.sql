create table Customers(
customer_id int primary key auto_increment,
firstname varchar(50),
lastname varchar(50),
email varchar(100),
phone_number varchar(100),
address varchar(250)
);
create table Rooms(
room_id int primary key ,
room_type varchar(50),
price_per_night int,
status_ varchar(50),
floor_number int
);
create table Reservation(
reservation_id int primary key auto_increment,
customer_id int,
room_id int,
reservation_date Date,
checkin_date Date,
checkout_date Date,
status_ varchar(50),
foreign key (customer_id) references Customers(customer_id),
foreign key (room_id) references Rooms(room_id)
);
create table Payment(
payment_id int primary key auto_increment,
reservation_id int,
payment_date Date,
amount_paid int,
payment_method varchar(50),
foreign key (reservation_id) references Reservation(reservation_id)
);
create table Staff(
staff_id int primary key,
firstname varchar(50),
lastname varchar(50),
role_ varchar(50),
hire_date Date
);
create table Room_Assignments(
assignment_id int primary key auto_increment,
staff_id int,
room_id int,
assignment_date Date,
task_description varchar(50),
foreign key (staff_id) references Staff(staff_id),
foreign key (room_id) references Rooms(room_id)
);

insert into Customers (firstname, lastname, email, phone_number, address) VALUES
('John', 'Doe', 'johndoe@example.com', '123-456-7890', 'New York'),
('Jane', 'Smith', 'janesmith@example.com', '234-567-8901', 'Boston'),
('Alice', 'Johnson', 'alicej@example.com', '345-678-9012', 'Chicago'),
('Bob', 'Brown', 'bobb@example.com', '456-789-0123', 'Los Angeles'),
('Eve', 'Davis', 'eved@example.com', '567-890-1234', 'Seattle');
insert into Rooms (room_id, room_type, price_per_night, status_, floor_number) VALUES
(101, 'Single', 100, 'Available', 1),
(102, 'Double', 150, 'Occupied', 1),
(201, 'Suite', 300, 'Available', 2),
(202, 'Double', 150, 'Under Maintenance', 2),
(301, 'Penthouse', 500, 'Available', 3);
insert into Reservation (customer_id, room_id, reservation_date, checkin_date, checkout_date, status_) VALUES
(1, 102, '2024-11-10', '2024-11-10', '2024-11-20', 'Confirmed'),
(2, 202, '2024-11-12', '2024-11-17', '2024-11-22', 'Completed'),
(3, 201, '2024-11-14', '2024-11-19', '2024-11-24', 'Cancelled'),
(4, 301, '2024-11-15', '2024-11-20', '2024-11-25', 'Confirmed'),
(5, 101, '2024-11-16', '2024-11-21', '2024-11-26', 'Completed');
insert into Payment (reservation_id, payment_date, amount_paid, payment_method) VALUES
(1, '2024-11-11', 500, 'Credit Card'),
(2, '2024-11-12', 750, 'Cash'),
(3, '2024-11-14', 300, 'Debit Card'),
(4, '2024-11-16', 1000, 'Credit Card'),
(5, '2024-11-17', 100, 'Bank Transfer');
insert into Staff (staff_id, firstname, lastname, role_, hire_date) VALUES
(1, 'Sam', 'Taylor', 'Housekeeping', '2023-01-10'),
(2, 'Nina', 'Walker', 'Front Desk', '2022-03-15'),
(3, 'Luke', 'Smith', 'Manager', '2021-07-20'),
(4, 'Lily', 'Johnson', 'Maintenance', '2022-08-05'),
(5, 'Tom', 'Brown', 'Security', '2023-06-30');
insert into Room_Assignments (assignment_id, staff_id, room_id, assignment_date, task_description) VALUES
(1, 1, 101, '2024-11-10', 'Cleaned'),
(2, 2, 102, '2024-11-11', 'Checked-in'),
(3, 3, 201, '2024-11-12', 'Maintenance'),
(4, 4, 202, '2024-11-13', 'Repaired AC'),
(5, 5, 301, '2024-11-14', 'Security Check');

-- Retrieve all information about rooms available on a specific floor.
select * from Rooms join Reservation on Rooms.room_id=Reservation.room_id where Rooms.floor_number=1;

-- List all reservations with customer details (first name, last name, email) sorted by check-in date (earliest first)
select firstname,lastname,email from Customers join Reservation on Customers.customer_id=Reservation.customer_id order by checkin_date desc;

-- Find all customers who have reserved rooms for more than 5 nights.
select firstname,lastname,email from Customers join Reservation on Customers.customer_id=Reservation.customer_id where datediff(Reservation.checkout_date,Reservation.checkin_date)>5;

-- Get the total amount paid for each reservation.
select reservation_id,sum(amount_paid) from Payment group by reservation_id;

-- Find the average room price for each room type.
select room_type,avg(price_per_night) from Rooms group by room_type;

-- Display the total revenue generated from all reservations in the last month.
select sum(amount_paid) from Payment where payment_date >= date_sub(CURDATE(),INTERVAL 1 MONTH);

-- Find the staff members who have been assigned the most rooms for cleaning or maintenance in the last month.
select s.staff_id,s.firstname,s.lastname,count(ra.assignment_id) from Staff s join Room_Assignments ra on s.staff_id=ra.staff_id
where ra.assignment_date>= date_sub(CURDATE(),INTERVAL 1 MONTH) and ra.task_description in ('Cleaned','Maintenance') group by s.staff_id,s.firstname,s.lastname order by count(ra.assignment_id) desc;

-- Retrieve the most recent reservation for each customer.
select * from Customer c join Reservation r on c.customer_id=r.customer_id where r.reservation_date=(
select max(r2.reservation_date) from Reservation r2 where r2.customer_id=c.customer_id) order by c.customer_id;

-- Delete a reservation and all corresponding payment records.
alter table Payment drop foreign key fk_payment_reservation, add constraint fk_payment_reservation
foreign key (reservation_id) references Reservation(reservation_id) on delete cascade;
