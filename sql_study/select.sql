select * from tab;

desc student;

select studno,name from student;

select studno "학번", name AS "이름", profno 지도교수번호 from student;

select empno "사원번호", ename "사원명", job "직업" from emp;

select distinct deptno1 from student;

select name, position from professor;
select name || position from professor;

select name || '님은' || position || '입니다' from professor;

select * from student;

select name || '의 키는 ' || height || 'cm,' || ' 몸무게는 '|| weight || 'kg 입니다' from student;

select ename, sal, sal+100 from emp;

select ename, sal, sal*110/100 from emp;

select sal, sal+100/2, (sal+100)/2 from emp;

select ename, sal, deptno from emp where sal > 4000;

select ename, empno, sal from emp where ename = 'scott';

select * from emp;

select ename, empno, sal from emp where ename = 'SCOTT'; --이름은 대소문자 구분해야함.

select name, pay, hiredate from professor where hiredate = '23-MAY-01';

select * from professor;

desc professor;

select name, height from student where height >= 180;

select name, weight from student where weight >= 60 and weight <=80;

select name, deptno1 from student where deptno1 = 101 or deptno1 = 201 or deptno1 = 301;

select name from student where name like '이%';

select name, bonus from professor where bonus is not null;

select name, grade, height from student where grade = 4 and height > 170;

select name, height, grade, weight from student where grade = 1 or weight >= 80;

select name, grade, height, weight from student where grade = 2 and height > 180 and weight > 70 ;

select name, grade, height, weight from student where grade = 2 and (height > 180 or weight > 70);

select name, height from student where grade = 1 order by height desc ; --오름차순은 asc 내림차순은 desc

select name, height, weight from student where grade = 1 order by weight desc, height asc;

select name, birthday, height, weight from student where grade =1 order by 2 desc;

select name "이름", height "키" from student where grade = 1 order by 키 ;

select studno , name, deptno1 from student where deptno1 = 101 union select profno, name, deptno from professor where deptno = 101 ;

select studno , name, deptno1 from student where deptno1 = 101 union all select profno, name, deptno from professor where deptno = 101 ; --union all: 중복된 것 모두 포함
-- 칼럼의 개수가 다르면 오류가 발생하므로 union 사용시 뒤에 select에 나오는 칼럼이 출력이 안되더라도 맞춰줘야함.

--intersect : 교집합
select name from student where deptno1 = 101 intersect select name from student where deptno2 = 201;

--minus 연산 : 큰 거에서 작은 거 뺴기
select name, position from professor minus select name, position from professor where position = '전임강사';

--sql 단일행함수
select initcap(id) from student where deptno1 = 201  ; 

select initcap('Pretty girl') from dual; --from dual이란 

select name 이름, id, lower(id) 소문자, upper(id) 대문자 from student where deptno1 = 201;

select name, id, length(id) 글자수 from student where length(id)>9; --length()

select name, length(name), lengthb(name) from student ; -- lengthb(): 바이트 수

select substr('ABCDE', 2,3) from dual; --substr('문자열' 또는 칼럼명, 시작 위치, 추출할 글자수)

select substr('ABCDE', -2,3) from dual; -- 역방향 인덱스

select name, substr(jumin,1,6) "생년월일" from student where deptno1 = 101;

desc student; --해본 결과 jumin 컬럼은 char 이다.

select name, substr(jumin, 1, 6) 생년월일 from student where substr(jumin, 3, 2) = '08';

select substr(name,1,2) from student where deptno1 = 101;

select instr('A*B*C*','*',3,2) from dual;

select name, tel, instr(tel,')',1,1) from student where deptno1=101;

select rpad(tel,5,'*') from student where deptno1 =101;

select id, lpad(id,10,'$') lapd from student where deptno1=101;

select ltrim(dname,'영') from dept2;

select rtrim(dname,'부') from dept2;

select replace(name, substr(name,1,1),'#') from student where deptno1=101;

-- SQL 문장에서 정규식 사용하기
select * from reg_test;

select * from reg_test where regexp_like(text, '[a-z]?[0-9]'); -- 공백이 여러 개일 경우 ?를 써준다

--시간함수
select sysdate from dual;

select months_between('2022-01-20', '2002-09-07') from dual;

select sysdate, next_day(sysdate, 'MON') from dual;

select sysdate, add_months(sysdate,3) from dual;

--형 변환 함수
select to_char(sysdate,'DD') DD , to_char(sysdate,'DAY') DAY , to_char(sysdate,'DDTH') DDTH from dual;

select name, to_char((pay*12)+bonus,'99,999') 연봉 from professor where deptno=101;

select name,pay,bonus,(pay*12+NVL(bonus,0)) 연봉 from professor where deptno = 101;

select name, pay, bonus, nvl2(bonus,pay*12+bonus,pay*0) 연봉 from professor where deptno=101;

-- decode 함수
select name,deptno, decode(deptno,101,'컴퓨터공학과',102, '멀티미디어공학과',103,'소프트웨어공학과','기타학과') 학과명 from professor;

select name, deptno,decode(deptno,101,decode(name,'조인형','석좌교수후보','후보아님')) "비  고" from professor;

--case 표현식
select name, tel, case(substr(tel,1,4)-1) when '02'  then '서울' else '기타' end 지역명 from student; --error

select name, substr(jumin,3,2) "출생월", case when (substr(jumin,3,2)) between '01' and '03' then '1/4분기' 
when (substr(jumin,3,2)) between '04' and '06' then '2/4분기'
when (substr(jumin,3,2)) between '07' and '09' then '3/4분기'
when (substr(jumin,3,2)) between '10' and '12' then '4/4분기' else '안태어남' end "분기별" from student;

select * from student;


--join

--카티션 곱
select * from emp;
select * from dept;
select e.ename, d.dname from emp e, dept d;

--등가 join
select s.name, s.deptno1, d.dname from student s , department d where s.deptno1= d.deptno;
select * from student;
select * from department;
select s.name, d.dname, p.name from student s, department d, professor p where s.deptno1 = d.deptno and s.profno=p.profno;

select * from emp2;
select * from p_grade;
select e.name, e.position, e.pay, p.s_pay, p.e_pay from emp2 e, p_grade p where e.position=p.position;

--비등가 join
select * from gogak;
select * from gift;
select go.gname, go.point, gi.gname from gogak go, gift gi where go.point between gi.g_start and gi.g_end;

select gi.gname, count(*) from gogak go, gift gi where go.point between gi.g_start and g_end group by gi.gname; --group by는 중복 방지 

select s.name, e.total, h.grade from student s, exam_01 e, hakjum h where s.studno=e.studno and e.total between h.min_point and h.max_point;

select go.gname, go.point, gi.gname from gogak go, gift gi where gi.g_start <= go.point and gi.gname='산악용자전거';

select e.name, trunc((sysdate-e.birthday)/365.0), e.position, g.position from emp2 e, p_grade g where trunc((sysdate-e.birthday)/365.0) between g.s_age and g.e_age;

--outer join
select s.name ,p.name from student s, professor p where s.profno(+)=p.profno order by 1;

--self join
select * from dept2;
select a.dname, b.dname from dept2 a, dept2 b where a.pdept = b.dcode;






