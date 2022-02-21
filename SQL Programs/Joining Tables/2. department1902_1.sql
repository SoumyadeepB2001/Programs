create table department1902_1 (dno number, dname varchar2(10), dloc varchar2(10));
insert into department1902_1 values (1, 'IT', 'Mumbai');
insert into department1902_1 values (2, 'Finance', 'Delhi');

select * from student1902_1, department1902_1;
select * from student1902_1, department1902_1 where student1902_1.dno = department1902_1.dno;
select * from student1902_1, department1902_1 where student1902_1.dno = department1902_1.dno and student1902_1.ename = 'Bheem';
select dname from student1902_1, department1902_1 where student1902_1.dno = department1902_1.dno and student1902_1.ename = 'Bheem';
select ename from student1902_1, department1902_1 where student1902_1.dno = department1902_1.dno and department1902_1.dname = 'IT';
select ename from student1902_1, department1902_1 where student1902_1.dno = department1902_1.dno and department1902_1.dloc = 'Delhi';
select ename from student1902_1, department1902_1 where student1902_1.dno = department1902_1.dno and (department1902_1.dname = 'IT' or student1902_1.city = 'kol');

select dname from department1902_1 where dno = (select dno from student1902_1 where ename = 'Bheem');
select ename from student1902_1 where dno = (select dno from department1902_1 where dname = 'IT');
select ename from student1902_1 where dno = (select dno from department1902_1 where dloc = 'Delhi');
