--raise를 사용하여 예외 처리
DECLARE
v_empno emp.empno%TYPE; 
v_name emp.ename%TYPE;
no_empno EXCEPTION ;
BEGIN
DELETE FROM EMP
WHERE empno =&empno;
IF SQL%NOTFOUND THEN
RAISE no_empno ;
END IF;
EXCEPTION
WHEN no_empno THEN
DBMS_OUTPUT.PUT_LINE('사원이 없습니다');
END ;

select*from emp;