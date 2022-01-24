--SQL 복수 행 함수
--count 함수
select count(*), count(hpage) from professor;
select * from professor;

--sum,avg 함수
set null (null);
select name,bonus from professor;
select count(bonus), sum(bonus) , avg(bonus) from professor;
select count(*), sum(bonus), avg(nvl(bonus,0)) from professor;

--max,min 함수
select * from emp;
select max(sal),min(sal) from emp;
select max(hiredate), min(hiredate) from emp;

--group by 절
select deptno, avg(nvl(pay,0)) from professor group by deptno;
--where 절은 그룹함수를 비교 조건으로 쓸 수 없음(having을 사용해야함)
select deptno, avg(nvl(pay,0)) from professor where avg(pay) >450 group by deptno; 
--having
select deptno, avg(nvl(pay,0)) from professor group by deptno having avg(pay) >450;  -- having은 group by절 앞 뒤 다 상관 없음

--rollup 함수
set pagesize 50;
select deptno,position,sum(pay) from professor group by position, rollup(deptno);

--cube 함수
select deptno,position, sum(pay) from professor group by deptno, cube(position);

--rank 함수
select rank('송도권') within group (order by name) "RANK" from professor;
select profno, name, pay, rank() over (order by pay) as rank, rank() over (order by pay desc) as rank_desc from professor; 
