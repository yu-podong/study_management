select * from HR.employees; 
set SERVEROUTPUT ON;

declare
vno NUMBER(4);
vname varchar2(10);

BEGIN
select empno,ename into vno,vname from emp where empno=7900;

DBMS_OUTPUT.PUT_LINE(vno||'   '||vname);

END;