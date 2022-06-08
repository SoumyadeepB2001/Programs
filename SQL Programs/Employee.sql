CREATE TABLE Employee (e_id VARCHAR2(10) PRIMARY KEY, e_name VARCHAR2(30), salary NUMBER);
CREATE TABLE Works (e_id VARCHAR2(10) REFERENCES Employee, d_id VARCHAR2(10) REFERENCES Department);
CREATE TABLE Department (d_id VARCHAR2(10) PRIMARY KEY, d_name VARCHAR2(30), manager_id VARCHAR2(10) REFERENCES Employee(e_id), floor_num NUMBER);

INSERT INTO Employee VALUES ('E1001', 'Soumyadeep Banerjee', 150000);
INSERT INTO Employee VALUES ('E1002', 'Rahul Hore', 180000);
INSERT INTO Employee VALUES ('E1003', 'Anit Saha', 280000);
INSERT INTO Employee VALUES ('E1004', 'Saikat Ghosh', 300000);
INSERT INTO Employee VALUES ('E1005', 'Sagarika Pan', 290000);
INSERT INTO Employee VALUES ('E1006', 'Sourodeep Chakrabarty', 195000);
INSERT INTO Employee VALUES ('E1007', 'Abir Saha', 300000);
INSERT INTO Employee VALUES ('E1008', 'Indrani Banik', 190000);
INSERT INTO Employee VALUES ('E1009', 'Aritra Mukherjee', 195000);
INSERT INTO Employee VALUES ('E1010', 'Shrinjon Kabasi', 180000);
INSERT INTO Employee VALUES ('E1011', 'Robin', 280000);
INSERT INTO Employee VALUES ('E1012', 'Md Nehal', 350000);

INSERT INTO Department VALUES ('D1001', 'General Management', 'E1006', 1);
INSERT INTO Department VALUES ('D1002', 'Marketing Department', 'E1012', 1);
INSERT INTO Department VALUES ('D1003', 'Finance Department', 'E1008', 2);
INSERT INTO Department VALUES ('D1004', 'Operations Department', 'E1008', 2);
INSERT INTO Department VALUES ('D1005', 'Purchase Department', 'E1009', 3);
INSERT INTO Department VALUES ('D1006', 'HR Department', 'E1005', 3);
INSERT INTO Department VALUES ('D1007', 'Sales Department', 'E1009', 3);

INSERT INTO Works VALUES ('E1001','D1001');
INSERT INTO Works VALUES ('E1002','D1001');
INSERT INTO Works VALUES ('E1006','D1001');
INSERT INTO Works VALUES ('E1012','D1002');
INSERT INTO Works VALUES ('E1003','D1002');
INSERT INTO Works VALUES ('E1004','D1003');
INSERT INTO Works VALUES ('E1008','D1003');
INSERT INTO Works VALUES ('E1008','D1004');
INSERT INTO Works VALUES ('E1011','D1004');
INSERT INTO Works VALUES ('E1009','D1005');
INSERT INTO Works VALUES ('E1007','D1005');
INSERT INTO Works VALUES ('E1005','D1006');
INSERT INTO Works VALUES ('E1012','D1006');
INSERT INTO Works VALUES ('E1009','D1007');
INSERT INTO Works VALUES ('E1010','D1007');



/*1.Find the names of all managers whose salary is less than 200,000.*/

SELECT DISTINCT e_name FROM Employee, Department WHERE manager_id = e_id AND salary < 200000;

/*2.Find the names of all departments where Robin does not work.*/

SELECT DISTINCT d_name FROM Department MINUS SELECT DISTINCT d_name FROM Employee, Works, Department WHERE Employee.e_id = Works.e_id AND Department.d_id = Works.d_id AND Employee.e_name='Robin';

/*3.Find the names of all managers who manage multiple departments on the same floor.*/

SELECT DISTINCT e_name FROM Employee, Department WHERE Employee.e_id = Department.manager_id AND manager_id IN (SELECT manager_id FROM Department GROUP BY manager_id, floor_num HAVING COUNT(*)>1);












