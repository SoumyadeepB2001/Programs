create table student1902_2 (eid number primary key, ename varchar2(6), city varchar2(5), dno number references department1902_2);
insert into student1902_2 values (1, 'bheem', 'up', 1);
insert into student1902_2 values (2, 'jaggu', 'mp', 1);
insert into student1902_2 values (3, 'raju', 'kol', 2);
insert into student1902_2 values (4, 'kaliya', 'goa', 2);
insert into student1902_2 values (5, 'aa', 'aa', 3);
insert into student1902_2 values (6, 'ab', 'ab', 4);

delete from student1902_2;
delete from student1902_2 where dno = 1;
update student1902_2 set ename = 'Kaliya' where ename = 'kaliya';
update student1902_2 set city = 'Delhi';
update student1902_2 set city = 'kol' where ename = 'raju';
update student1902_2 set city = 'goa' where ename = 'Kaliya';
