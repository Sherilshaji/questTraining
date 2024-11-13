CREATE TABLE STUDENT (
StudentId INT PRIMARY KEY,
FirstName VARCHAR(50) not null,
LastName VARCHAR(50),
Class INT,
DOB DATE,
Address VARCHAR(250)
);
INSERT INTO STUDENT VALUE (1,"John","Doe",10,"2008-10-6","York");
INSERT INTO STUDENT VALUE (2,"Alex","Parker",9,"2007-8-21","Canterbury");
INSERT INTO STUDENT VALUE (3,"Olivia","Bennett",10,"2007-11-2","Brighton");
INSERT INTO STUDENT VALUE (4,"Henry","Brooks",10,"2009-3-5","Newcastle");
INSERT INTO STUDENT VALUE (5,"Charlotte","Collins",9,"2009-8-29","Nottingham");
INSERT INTO STUDENT(StudentId,FirstName,LastName,Class,DOB,Address) VALUE (6,"James","Carter",10,"2008-1-14","Liverpool"),(7,"Ethan","Parker",10,"2007-9-13","York");
SELECT * FROM STUDENT;
DELETE FROM STUDENT WHERE StudentId=5;


start transaction;
update student set class=10 where StudentId=2;
update student set class=9 where StudentId=4;
commit;

INSERT INTO STUDENT VALUE (8,"Charl","Colli",9,"2009-8-29","Nottingham");
savepoint savepoint1;
INSERT INTO STUDENT VALUE (9,"Harry","Collins",10,"2010-8-09","Nottingham");
savepoint savepoint2;
INSERT INTO STUDENT VALUE (10,"Charlly","Cols",9,"2009-5-20","Nottingham");
savepoint savepoint3;
INSERT INTO STUDENT VALUE (5,"Charlotte","Collins",9,"2009-8-29","Nottingham");
rollback savepoint2;


create view student_detail as select FirstName,Lastname from STUDENT where StudentId=1;
update student_detail set FirstName="Henry";
select * from student_detail;