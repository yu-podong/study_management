--sequence
create SEQUENCE seq_jumun_no INCREMENT BY 1 start with 1000 MAXVALUE 1010 
    MINVALUE 990 CYCLE CACHE 2;

CREATE TABLE JUMuN (J_NO NUMBER(4), J_NAME VARCHAR2(10));

INSERT INTO JUMuN VALUES(seq_jumun_no.NEXTVAL,'AAAA');
INSERT INTO JUMuN VALUES(seq_jumun_no.NEXTVAL,'BBBB');
select seq_jumun_no.CURRVAL from dual;

/*begin for i in 1..11 loop 
    insert into jumun VALUES(seq_jumun_no.NEXTVAL,DBMS_RANDOM.STRING('A',4));
    end loop;
commit;
end;*/

INSERT INTO jumun VALUES(seq_jumun_no.NEXTVAL,'DDDD') ;

select * from jumun;

create sequence s_rev INCREMENT by -1 MINVALUE 0 MAXVALUE 10 START WITH 5;
insert into s_test1 values (s_rev.nextval);

CREATE TABLE jumun2 ( j_no number(4) ,j_name varchar2(4) );
CREATE SEQUENCE seq_jumun2_no INCREMENT BY 1 START WITH 100 MAXVALUE 105 CACHE 2 ;

INSERT INTO jumun2 VALUES(seq_jumun2_no.NEXTVAL,'AAAA') ;
commit;
conn / as sysdba;

--sysnonym
create SYNONYM e2 for emp2;
CREATE PUBLIC SYNONYM D2 FOR DEPARTMENT; --모든 사용자들이 사용 가능

