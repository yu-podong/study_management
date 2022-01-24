--DDL
CREATE table ddl_test1(no number(3), name VARCHAR2(10), birth date default sysdate);
select * from ddl_test1;
desc ddl_test1;

--테이블 복사하기: CTAS
create table dept3 as select * from dept2; --dept2와 같은 dept3 생성
create table dept5 as select * from dept2 where 1=2; --

--가상 칼럼 테이블 생성
create table vt001(no1 number, no2 number, no3 number generated always as (no1+no2)virtual);
insert into vt001(no1,no2) values (1,2) ;
update vt001 set no1 =10;
select * from vt001;
insert into vt001(no1,no2) values (3,4);
insert into vt001(no1,no2) values (6,6);
alter table vt001 add(no4 generated always as ((no1*12)+no2));
select column_name, data_type, data_default from user_tab_columns where table_name='VT001' order by column_id;

--ALTER
create table dept6 as select dcode,dname from dept2 where dcode in(1000,1001,1002);
alter table dept6 add(LOC VARCHAR2(10));
alter table dept6 add(LOC2 VARCHAR2(10) DEFAULT '서울'); -- 칼럼 추가
select * from dept6;
alter table dept6 rename column loc2 to area; -- 칼럼 이름 변경
rename dept6 to dept7; -- 테이블 이름 변경
desc dept7;
alter table dept7 modify(dcode VARCHAR2(10)); -- 칼럼의 데이터 크기 변경
alter table dept7 drop column loc; -- 칼럼 삭제

--truncate
truncate table dept7; -- 테이블의 데이터 삭제 공간 반납 but 테이블 자체가 지워지는 건 아님
drop table dept7; -- 테이블 자체 삭제
