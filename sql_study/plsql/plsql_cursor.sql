--PL/SQL Cursor

declare
wempno number(4);
vename varchar2(20);
vsal number(7);

cursor c1 is
select empno,ename,sal from emp where deptno=20;

begin
  open c1;
  dbms_output.put_line('번호   이름   급여');
  
  loop
    fetch c1 into vempno, vename, vsal;
    exit when c1%notfound;
    
    dbms_output.put_line(vempno||' '||vename||' '||vsal);
end loop;
close c1;
end;

select * from emp;

DECLARE
CURSOR emp_cur IS -- 커서 선언됩니다
SELECT empno ,ename
FROM emp;
BEGIN
FOR emp_rec IN emp_cur -- 커서의 데이터를 저장할 emp_rec 변수 선언됨
LOOP
DBMS_OUTPUT.PUT_LINE(emp_rec.empno||' '||emp_rec.ename);
END LOOP;
END;



