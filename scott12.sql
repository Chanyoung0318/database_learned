-- 1) ���, �μ� ���̺��� ������ ����� ����.

desc emp;

desc dept;
-- 2) ��� �μ������� ����غ���.

select *
from dept;

-- 3) ��� ��������� ����غ���

select *
from emp;

-- 4) ��� ����� �̸��� ����غ���

select ename
from emp;

-- 5) ȸ���� �μ���ȣ�� ����� ����

select deptno
from dept;

-- 6) ����� ������, ����, Ŀ�̼��� ����� ����

select mgr, sal, comm
from emp;

-- 7) �μ��� �̸��� ������ ����� ����

select dname, loc
from dept;

-- 8) ������ް� ���� ������ ����� ����

select grade, losal
from salgrade;

-- 9) ȸ�翡 �����ϴ� ����� �۾� ���̵� ����غ���

select job
from emp;

-- 10) ����� �����ϴ� �μ� ��ȣ�� �ߺ����� ����غ���

select distinct deptno
from emp;

-- 11) �����ϴ� ����� �����ϴ� ������ ���̵� �ߺ����� ����غ���

select distinct mgr
from emp
where mgr is not null;

-- 12) ���� ����� 3�϶� ���� �� �ִ� �ִ� �ּ� ������ ����غ���

select losal, hisal
from salgrade
where grade = 3;

-- 13) ������ 2100�̻��� ����� ������ ����Ͻÿ�.

select *
from emp
where (sal * 12) >= 2100;

-- 14) �μ��� 20�� ������ ���ϴ� ������� ��� ������ ����� ����

select *
from emp
where deptno = 20;

-- 15) �����ڰ� ���� ����� ������ ����غ���.

select *
from emp
where mgr is null;

-- 16) Ŀ�̼��� ���� ����� ������ ����غ���.

select *
from emp
where comm is null;

-- 17) ����� ������ 50 ������ ���·� ����غ���

select sal+50
from emp;

-- 18) ����� �� ���޺��� 10%������ ���·� ����غ���

select sal *1.1
from emp;

-- 19) ����� ������ 50 ������ ���·� �÷����� upgradeSalary�� ����� ����

select sal+50 as upgradeSalary
from emp;

-- 20) ����� ���ް� Ŀ�̼��� ���� ���·� �÷����� upgradeSalary�� ����غ���

select sal+ nvl(comm, 0) as upgradeSalary
from emp;

-- 21) 'XXXx ����� ����� �����ڰ� xxx��� �Դϴ�.' �� ���·� ����� ����� ����

select empno || '����� ����� �����ڰ�' || mgr || '��� �Դϴ�.'
from emp;

-- 22) �����ڰ� ���� ����� �����̴�. ������ ������ ��ȣ�� 9999�� ��� �ǵ��� sql�� nvl, nvl2, decode �Լ��� �̿��ؼ� ���� �����غ���

select nvl(mgr, 9999)
from emp;

select nvl2(mgr, mgr, 9999)
from emp;

select decode(mgr, null, 9999, mgr)
from emp;

-- 23) �߰��� ���޵Ǵ� ��(comm)�� ������ 0���� ��� �ϵ��� ������ ����

select  nvl(comm, 0)
from emp;

-- 24) ������ 800���� ���ų� ���� 1000���� ���ų� ���� ����� ������ ����غ���

select *
from emp
where sal*12 between 800 and 1000;

-- 25) �μ� ��ȣ�� 20 �̸鼭 ������ MANAGER�� ��� ������ ����� ����

select *
from emp
where deptno = 20 and job = 'MANAGER';

-- 26) �μ���ȣ�� 20 �̰ų� ������ MANAGER�� ��� ������ ����غ���

select *
from emp
where deptno = 20 or job = 'MANAGER';

-- 27) ������ Manager�� �ƴ� ��� ������ ����� ����

select *
from emp
where job != 'MANAGER';

-- 28) Ŀ�̼��� 0, 500, 1400 �� ���� ��� ������ ����غ���

select *
from emp
where comm in (0, 500, 1400);

-- 29) ������ 8000���� ���ų� ���� 10000���� ���ų� ���� ��� ������ ����غ���

select *
from emp
where sal >= 800 and sal <= 1000;

-- 30) ������ 700���� �۰ų� 1000���� ū ��� ������ ����غ���.

select *
from emp
where (sal * 12) <= 700 or (sal * 12) >= 1000;

-- 31) ����� �̸��� SCOTT�� ��������� ����غ���

select *
from emp
where ename = 'SCOTT';

-- 32) ��� �̸��� 'A' �� �����ϴ� ��� ������ ����� ����

select *
from emp
where ename like 'A%';

-- 33) �̸��� S�� ���� ��� ������ ����غ���

select *
from emp
where ename like '%S%';

-- 34) �̸��� L�� ���� ���� ��� ������ ����غ���

select *
from emp
where ename not like '%L%';

-- 35) �̸��� ����° ���ڰ� I�� ��� ������ ����غ���

select *
from emp
where ename like '__I%';

select ename
from emp;

--36) ����� �̸��� E~G�� �����ϴ� ��� ������ ����غ���

select *
from emp
where ename between 'E' and 'H';

-- 37) ����� �Ի����� 2004�� 5�� 20�� ~ 2007�� 10�� 10�� ������ ��� ������ ����غ���

select *
from emp
where hiredate between '04/05/20' and '07/10/11';

-- 38) �Ի����� 83�� ���İų� job�� SALEMAN �� ��� ����� ����غ���

select *
from emp
where hiredate > '83/01/01' or JOB = 'SALESMAN';

-- 39) 20�� �μ��� �ƴ� ��� ��� ������ ����غ���

select *
from emp
where deptno != 20;

-- 40) �޿��� 600���� ���� 3000���̰� �ƴ� ����� ������ ����غ���.

select *
from emp
where sal not between 600 and 3000;

-- 41)��簡 ���� ����� ����غ���

select *
from emp
where mgr is null;

-- 42) �Ŵ����� 7762, 2902, 2698, 7566�� ��� ������ ����غ���

select *
from emp
where mgr in (7782, 2902, 2698, 7566);

-- 43) �μ���ȣ�� 40, 10, 20�� �ƴ� ��������� ����غ���

select *
from emp
where deptno not in (40, 10, 20);

-- 44) ��� �̸��� 5������ ��������� ����غ���

select *
from emp
where ename like '_____';

-- 45) ������ N���� ������ ��������� ����غ���

select *
from emp
where job like '%N';

-- 46) ��� �̸��� A�� �� ��������� ����غ���

select *
from emp
where ename like '%A%';

-- 47) �̸��� S�� �����ϴ� ��������� ����غ���

select *
from emp
where ename like 'S%';

-- 48) �����ڹ�ȣ�� ������ ������ �����Ͽ� ��� ������ ����غ���

select *
from emp
order by mgr desc;

-- 49) �޿��� ���� ������ ��� ������ �������� ����غ���

select *
from emp
order by sal desc;

-- 50) ���, �̸�, ������ ��ȣ, ���� ������ ��µǰ� ������ ��ȣ�� ��������, �μ���ȣ�� ������������ �����Ͽ� ��������� ��µǵ��� �����غ���

select empno, ename, mgr, sal
from emp
order by deptno, mgr;

-- 51) ��� ������ �μ��� ���ĺ������� �����ϰ� ���� �μ� ����� �����ȣ ������������ �����غ���

select *
from emp
order by deptno, empno;

-- 52) ������ 'SALESMAN' �̸� 15%, 'MANAGER'�� 10%, �̿��� ������ 5% �޿��� �λ��Ͽ� ��������� ����غ���

select case when job = 'SALESMAN' then sal + (15/sal)
            when job = 'MANAGER' then sal + (10/sal)
            else sal + (10/sal) end as upgradeSalary
from emp;

select case when job = 'SALESMAN' then sal*1.15
            when job = 'MANAGER' then sal *1.1
            else sal *1.05 end as upgradeSalary
from emp;