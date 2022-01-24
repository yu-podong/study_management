--sub query
select ename,sal from emp where sal > (select sal from emp where ename='SCOTT');

select * from student;
select * from department;
--단일 행 연습문제1(완성 X)
select s.name, d.dname from student s, department d where s.deptno1= (select s.name from student s where s.deptno1='컴퓨터공학과');
--다중 행 sub query
select empno,name,deptno from emp2 where deptno in(select dcode from dept2 where area='서울지사');
select * from dept2;

--다중 칼럼 sub query
select name, grade,height from student where (grade,height) in(select grade, max(height) from student group by grade) order by 1;