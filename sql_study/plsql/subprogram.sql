--procedure

--부서번호가 20번인 사람들의 job을 'CLERK'으로 변경하는 프로시저
create or replace procedure update_20
is
begin
  update emp
  set job='CLERK'
  where deptno=20;
end;

execute update_20; 

select * from emp;

--사번을 입력 받아 급여를 인상하는 프로시저
create or replace procedure up_sal
(vempno in emp.empno%type)
is 
begin
  update emp set sal = 5000
  where empno=vempno;
end;
exec up_sal(7902);
select * from emp;

select * from user_source where name='info_prof';

--function 내장함수
CREATE OR REPLACE FUNCTION s_max_sal
(s_deptno emp.deptno%TYPE)
return number
IS
max_sal emp.sal%TYPE ;
BEGIN
SELECT max(sal) INTO max_sal
FROM emp
WHERE deptno=s_deptno;
RETURN max_sal ; -- 이 부분의 데이터 형이 위 3번 줄의 형과 같아야 합니다.
END;
select s_max_sal(10) from dual;

SELECT text
FROM user_source
WHERE type='FUNCTION'
AND name='S_MAX_SAL' ;

--oracle package
--package 선언부
CREATE OR REPLACE PACKAGE emp_total 
AS
PROCEDURE emp_sum;
PROCEDURE emp_avg;
END emp_total;

--package 몸체부
CREATE OR REPLACE PACKAGE BODY emp_total AS
PROCEDURE emp_sum
IS
CURSOR emp_total_sum IS
SELECT COUNT(*), SUM(NVL(sal,0))
FROM emp;
total_num NUMBER ;
total_sum NUMBER;
BEGIN
OPEN emp_total_sum ;
FETCH emp_total_sum INTO total_num , total_sum ;
DBMS_OUTPUT.PUT_LINE('총인원수: '||total_num||' , 급여합계: '||total_sum);
CLOSE emp_total_sum;
END emp_sum ; --emp_sum 프로시저 끝
PROCEDURE emp_avg -- emp_avg 프로시저 시작
IS
CURSOR emp_total_avg IS
SELECT COUNT(*), AVG(NVL(sal,0))
FROM emp;
total_num NUMBER ;
total_avg NUMBER ;
BEGIN
OPEN emp_total_avg ;
FETCH emp_total_avg INTO total_num , total_avg;
DBMS_OUTPUT.PUT_LINE('총인원수: '||total_num||' , 급여평균: '||total_avg);
CLOSE emp_total_avg ;
END emp_avg; -- 프로시저 끝
END emp_total; -- 패키지 끝

SET SERVEROUTPUT ON
EXEC emp_total.emp_sum; -- 패키지 이름.프로시저 이름 으로 실행합니다.
SELECT COUNT(*) , SUM(NVL(sal,0)) FROM emp;
EXEC emp_total.emp_avg;

--triger
CREATE TABLE t_order
(no NUMBER,ord_code VARCHAR2(10),ord_date DATE ) ;

CREATE OR REPLACE TRIGGER t_order
BEFORE INSERT ON t_order
BEGIN
IF (TO_CHAR(SYSDATE,'HH24:MI') NOT BETWEEN '15:20' AND '16:50') THEN
RAISE_APPLICATION_ERROR(-20100,'허용시간 아닙니다');
END IF ;
END ;

SELECT SYSDATE FROM DUAL;

INSERT INTO t_order VALUES(1,'C100',SYSDATE);


