-- 1) 사원, 부서 테이블의 구조를 출력해 보자.

desc emp;

desc dept;
-- 2) 모든 부서정보를 출력해보자.

select *
from dept;

-- 3) 모든 사원정보를 출력해보자

select *
from emp;

-- 4) 모든 사원의 이름을 출력해보자

select ename
from emp;

-- 5) 회사의 부서번호를 출력해 보자

select deptno
from dept;

-- 6) 사원의 관리자, 월급, 커미션을 출력해 보자

select mgr, sal, comm
from emp;

-- 7) 부서의 이름과 지역을 출력해 보자

select dname, loc
from dept;

-- 8) 연봉등급과 최저 연금을 출력해 보자

select grade, losal
from salgrade;

-- 9) 회사에 존재하는 사원의 작업 아이디를 출력해보자

select job
from emp;

-- 10) 사원이 존재하는 부서 번호를 중복없이 출력해보자

select distinct deptno
from emp;

-- 11) 관리하는 사원이 존재하는 관리자 아이디를 중복없이 출력해보자

select distinct mgr
from emp
where mgr is not null;

-- 12) 연봉 등급이 3일때 받을 수 있는 최대 최소 연봉을 출력해보자

select losal, hisal
from salgrade
where grade = 3;

-- 13) 연봉이 2100이상인 사원의 정보를 출력하시오.

select *
from emp
where (sal * 12) >= 2100;

-- 14) 부서가 20인 곳에서 일하는 사원들의 사원 정보를 출력해 보자

select *
from emp
where deptno = 20;

-- 15) 관리자가 없는 사원의 정보를 출력해보자.

select *
from emp
where mgr is null;

-- 16) 커미션이 없는 사원의 정보를 출력해보자.

select *
from emp
where comm is null;

-- 17) 사원의 봉급을 50 증가한 형태로 출력해보자

select sal+50
from emp;

-- 18) 사원의 현 봉급보다 10%증가한 형태로 출력해보자

select sal *1.1
from emp;

-- 19) 사원의 봉급을 50 증가한 형태로 컬럼명을 upgradeSalary로 출력해 보자

select sal+50 as upgradeSalary
from emp;

-- 20) 사원의 봉급과 커미션을 합한 형태로 컬럼명을 upgradeSalary로 출력해보자

select sal+ nvl(comm, 0) as upgradeSalary
from emp;

-- 21) 'XXXx 사번의 사원은 관리자가 xxx사번 입니다.' 의 형태로 결과를 출력해 보자

select empno || '사번의 사원은 관리자가' || mgr || '사번 입니다.'
from emp;

-- 22) 관리자가 없는 사원이 사장이다. 사장의 관리자 번호를 9999로 출력 되도록 sql를 nvl, nvl2, decode 함수를 이용해서 각각 구현해보자

select nvl(mgr, 9999)
from emp;

select nvl2(mgr, mgr, 9999)
from emp;

select decode(mgr, null, 9999, mgr)
from emp;

-- 23) 추가로 지급되는 돈(comm)이 없으면 0으로 출력 하도록 구현해 보자

select  nvl(comm, 0)
from emp;

-- 24) 연봉이 800보다 같거나 많고 1000보다 같거나 작은 사원의 정보를 출력해보자

select *
from emp
where sal*12 between 800 and 1000;

-- 25) 부서 번호가 20 이면서 직업이 MANAGER인 사원 정보를 출력해 보자

select *
from emp
where deptno = 20 and job = 'MANAGER';

-- 26) 부서번호가 20 이거나 직업이 MANAGER인 사원 정보를 출력해보자

select *
from emp
where deptno = 20 or job = 'MANAGER';

-- 27) 직업이 Manager가 아닌 사원 정보를 출력해 보자

select *
from emp
where job != 'MANAGER';

-- 28) 커미션이 0, 500, 1400 와 같은 사원 정보를 출력해보자

select *
from emp
where comm in (0, 500, 1400);

-- 29) 연봉이 8000보다 같거나 많고 10000보다 같거나 작은 사원 정보를 출력해보자

select *
from emp
where sal >= 800 and sal <= 1000;

-- 30) 연봉이 700보다 작거나 1000보다 큰 사원 정보를 출력해보자.

select *
from emp
where (sal * 12) <= 700 or (sal * 12) >= 1000;

-- 31) 사원의 이름이 SCOTT인 사원정보를 출력해보자

select *
from emp
where ename = 'SCOTT';

-- 32) 사원 이름이 'A' 로 시작하는 사원 정보를 출력해 보자

select *
from emp
where ename like 'A%';

-- 33) 이름에 S가 들어가는 사원 정보를 출력해보자

select *
from emp
where ename like '%S%';

-- 34) 이름에 L이 들어가지 않은 사원 정보를 출력해보자

select *
from emp
where ename not like '%L%';

-- 35) 이름에 세번째 문자가 I인 사원 정보를 출력해보자

select *
from emp
where ename like '__I%';

select ename
from emp;

--36) 사원의 이름이 E~G로 시작하는 사원 정보를 출력해보자

select *
from emp
where ename between 'E' and 'H';

-- 37) 사원의 입사일이 2004년 5월 20일 ~ 2007년 10월 10일 까지의 사원 정보를 출력해보자

select *
from emp
where hiredate between '04/05/20' and '07/10/11';

-- 38) 입사일이 83년 이후거나 job이 SALEMAN 인 모든 사원을 출력해보자

select *
from emp
where hiredate > '83/01/01' or JOB = 'SALESMAN';

-- 39) 20번 부서가 아닌 모든 사원 정보를 출력해보자

select *
from emp
where deptno != 20;

-- 40) 급여가 600에서 에서 3000사이가 아닌 사원의 정보를 출력해보자.

select *
from emp
where sal not between 600 and 3000;

-- 41)상사가 없는 사원을 출력해보자

select *
from emp
where mgr is null;

-- 42) 매니저가 7762, 2902, 2698, 7566인 사원 정보를 출력해보자

select *
from emp
where mgr in (7782, 2902, 2698, 7566);

-- 43) 부서번호가 40, 10, 20이 아닌 사원정보를 출력해보자

select *
from emp
where deptno not in (40, 10, 20);

-- 44) 사원 이름이 5글자인 사원정보를 출력해보자

select *
from emp
where ename like '_____';

-- 45) 직업이 N으로 끝나는 사원정보를 출력해보자

select *
from emp
where job like '%N';

-- 46) 사원 이름에 A가 들어간 사원정보를 출력해보자

select *
from emp
where ename like '%A%';

-- 47) 이름이 S로 시작하는 사원정보를 출력해보자

select *
from emp
where ename like 'S%';

-- 48) 관리자번호를 내림차 순으로 정렬하여 사원 정보를 출력해보자

select *
from emp
order by mgr desc;

-- 49) 급여가 많은 순으로 사원 정보를 내림차순 출력해보자

select *
from emp
order by sal desc;

-- 50) 사번, 이름, 관리자 번호, 봉급 정보가 출력되고 관리자 번호를 오름차순, 부서번호는 오름차순으로 정렬하여 사원정보가 출력되도록 구현해보자

select empno, ename, mgr, sal
from emp
order by deptno, mgr;

-- 51) 사원 정보를 부서는 알파벳순으로 정렬하고 같은 부서 사원은 사원번호 오름차순으로 정렬해보자

select *
from emp
order by deptno, empno;

-- 52) 직급이 'SALESMAN' 이면 15%, 'MANAGER'면 10%, 이외의 직종은 5% 급여를 인상하여 사원정보를 출력해보자

select case when job = 'SALESMAN' then sal + (15/sal)
            when job = 'MANAGER' then sal + (10/sal)
            else sal + (10/sal) end as upgradeSalary
from emp;

select case when job = 'SALESMAN' then sal*1.15
            when job = 'MANAGER' then sal *1.1
            else sal *1.05 end as upgradeSalary
from emp;