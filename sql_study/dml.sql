--DML
--INSERT
INSERT into dept2(dcode,dname,pdept,area) values(9001,'특판1팀','영업부','임시지역');
desc dept2; 
select * from dept2; --잘 들어갔는지 확인

INSERT INTO dept2(dcode,dname,pdept) values(9002,'특판3팀','영업부');

insert into professor(profno,name,id,position,pay,hiredate) values(5001,'김설희','Love_me','정교수','510',sysdate);
select * from professor;

--INSERT를 이용하여 여러 행 입력
CREATE TABLE professor2 AS SELECT * FROM professor;
INSERT INTO professor2 select * from professor;

select * from p_02;
INSERT ALL INTO p_01(no,name) VALUES(1,'AAA') INTO p_02(no,name) VALUES(2,'BBB') SELECT * FROM dual;

INSERT ALL WHEN profno between 100 and 1999 then 
    into p_01 values(profno,name) when profno between 2000 and 2999 then
    into p_02 values(profno,name) select profno,name from professor;
    
insert all into p_01 values(profno,name) 
    into p_02 values(profno,name)
    select profno,name from professor
    where profno between 3000 and 3999;
    
--UPDATE
UPDATE professor set bonus = 100 where position = '조교수';
update professor set pay = pay*1.15 where position = (select position from professor where name = '차범철') and pay < 250;

--DELETE
DELETE FROM dept2 where dcode between 9000 and 9100;

--MERGE
select * from p_total;
select * from total;

merge into p_total total using pt_101 p01 on (total.판매번호=p01.판매번호) when matched then 
    update set total.제품번호 = p01.제품번호 
    when not MATCHED then
    insert values(p01.판매번호,p01.제품번호,p01.수량,p01.금액);




