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

