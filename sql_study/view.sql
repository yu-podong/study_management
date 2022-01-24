--simple view
create or replace view v_prof 
    as select profno,name,email,hpage from professor;

select*from v_prof;

--complex view
create or replace view v_prof_dept
    as select p.profno, p.name, d.dname from professor p, department d 
    where p.deptno = d.deptno;
    
--inline view (1È¸¿ë ºä)
select d.dname, s.max_height, s.max_weight from (select deptno1, max(height)max_height, max(weight)max_weight
    from student group by deptno1) s, department d 
    where s.deptno1 = d.deptno;
