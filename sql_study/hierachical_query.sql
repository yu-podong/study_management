--계층형 쿼리 hierachical query
--prior : 해당 키워드가 설정 되어 있는 컬럼에서 바로 이전의 데이터의 값을 찾는데 사용
select lpad(dname,level*6,'*') 부서명 from dept2 connect by prior dcode = pdept start with dcode = 0001;
select lpad(dname,level*7,'*') 부서명 from dept2 connect by dcode = prior pdept start with dcode = 1011;