DECLARE
v_profno professor.profno%type;
v_pay professor.pay%TYPE;

BEGIN
select profno,pay into v_profno,v_pay
from professor
where profno=1001;

DBMS_OUTPUT.PUT_LINE(v_profno||' 번 교수의 급여는'||v_pay||' 입니다.');

END;

DECLARE
v_empno emp2.empno%TYPE;
v_name emp2.name%TYPE;
v_birth emp2.birthday%TYPE;
BEGIN
select empno,name,birthday 
into v_empno,v_name,v_birth
from emp2
where empno='&empno'; --사용자에게 값을 입력 받아서 변수에 할당 할 때 사용하는 기호 '&'
DBMS_OUTPUT.PUT_LINE(v_empno||'  '||v_name||'  '||v_birth);
END;

DECLARE
v_profno professor.profno%type;
v_name professor.name%type;
v_deptno professor.deptno%type;
v_hdate professor.hiredate%type;
BEGIN
select profno,name,deptno,hiredate
into v_profno,v_name,v_deptno,v_hdate
from professor
where profno='&교수번호';
DBMS_OUTPUT.PUT_LINE(v_profno||'  '||v_name||'  '||v_deptno||'  '||v_hdate);
END;

create table pl_test
(no number, name varchar2(10));
create sequence pl_seq;
BEGIN
INSERT INTO pl_test
values(pl_seq.nextval,'AAA');
end;
commit;

create table pl_test2
(no number, name varchar2(10), addr varchar2(10));
set verify off
DECLARE
v_no_number:='&no';
v_name_varchar2(10):='&name';
v_addr_varchar2(10):='&addr';
BEGIN
insert into pl_test2
values(v_no,v_name,v_addr);
END;

BEGIN
UPDATE pl_test
SET name='BBB'
where no = 2;
END;

BEGIN
DELETE from pl_test
where no=1;
end;

































