--제약조건
create table emp3(no number(4) CONSTRAINT emp3_no_pk primary key, 
    name VARCHAR2(10) CONSTRAINT emp3_name_nn NOT NULL,
    jumin VARCHAR2(13) CONSTRAINT emp3_jumin_nn NOT NULL CONSTRAINT emp3_jumin_uk UNIQUE,
    area NUMBER(1)CONSTRAINT emp3_area_ck CHECK ( area < 5 ),
    deptno VARCHAR2(6) CONSTRAINT emp3_deptno_fk REFERENCES dept2(dcode));
    
 CREATE TABLE emp4( no NUMBER(4) PRIMARY KEY ,
     name VARCHAR2(10) NOT NULL,
     jumin VARCHAR2(13) NOT NULL UNIQUE ,
     area NUMBER(1) CHECK ( area < 5 ),
     deptno VARCHAR2(6) REFERENCES dept2(dcode)) ;
alter table emp4 add constraint emp4_name_uk UNIQUE(name);
select * from emp4;
alter table emp4 modify(area CONSTRAINT emp4_area_nn NOT NULL);
alter table emp4 add constraint emp4_no_fk FOREIGN key(no) REFERENCES emp2(empno);

--제약조건 관리
--disable novalidate
alter table test_novalidate disable novalidate CONSTRAINT SYS_C0011077;
select * from test_novalidate;
desc test_novalidate;
insert into test_novalidate values(1,'DDD');

--disable validate
/*DISABLE의 기본 옵션은 NOVALIDATE이다.*/
alter table test_validate DISABLE validate CONSTRAINT tv_name_nn;
insert into test_validate values(4,null); --error

--제약조건 조회
SELECT  owner, constraint_name,constraint_type,status 
    from user_constraints 
    where table_name='EMP4';
--제약조건 삭제
alter table emp4 drop constraint emp4_name_uk;



