CREATE DATABASE COMPANY2;
USE COMPANY2;

CREATE TABLE Employee (
	Eid VARCHAR(6) PRIMARY KEY, 
	Name VARCHAR(30), 
	Depid VARCHAR(6), 
	Qualification VARCHAR(10), 
	Age INT CHECK (Age > 18 AND Age < 60)
);


CREATE TABLE Salary (
    Eid VARCHAR(6) PRIMARY KEY,
    Basic DECIMAL(10, 2),
    DA DECIMAL(10, 2) AS (0.25 * Basic),
    HRA DECIMAL(10, 2) AS (0.08 * Basic),
    Bonus DECIMAL(10, 2) AS (0.05 * Basic),
    Total_Salary DECIMAL(10, 2) AS (Basic + DA + HRA + Bonus)
);



CREATE TABLE Department (
    Depid VARCHAR(6) PRIMARY KEY,
    Description VARCHAR(255),
    HoD VARCHAR(6),
    Location VARCHAR(255),
    FOREIGN KEY (HoD) REFERENCES Employee(Eid)
);


INSERT INTO Employee (Eid, Name, Depid, Qualification, Age) VALUES 
('EMP001', 'Arka Roy', 'DEP001', 'B.Tech', 28),
('EMP002', 'Subhajit Gorai', 'DEP002', 'MBA', 35),
('EMP003', 'Sanchita Maji', 'DEP001', 'B.Sc', 30),
('EMP004', 'Subham Chakraborty', 'DEP003', 'B.Com', 40),
('EMP005', 'Pubali Karan', 'DEP002', 'M.Tech', 45),
('EMP006', 'Sujan Mukherjee', 'DEP003', 'MCA', 32),
('EMP007', 'Sourin Saha', 'DEP004', 'B.Sc', 27);

INSERT INTO Department (Depid, Description, HoD, Location) VALUES
('DEP001', 'Finance Department', 'EMP001', 'Mumbai'),
('DEP002', 'Marketing Department', 'EMP002', 'Delhi'),
('DEP003', 'Human Resources Department', 'EMP003', 'Bangalore'),
('DEP004', 'Research and Development Department', 'EMP004', 'Hyderabad');

INSERT INTO Salary (Eid, Basic) VALUES
('E001', 5000),
('E002', 6000),
('E003', 7000),
('E004', 8000),
('E005', 9000),
('E006', 10000),
('E007', 11000);
