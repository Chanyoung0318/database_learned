select *
from tab;


select job_id
from jobs;

select job_title
from jobs;

select distinct job_id
from jobs;

select distinct manager_id
from employees;

select *
from employees
where manager_id is null;

select employee_id, first_name, salary
FROM employees
where salary >= 10000;

select *
from employees
where department_id = 50;

select *
from jobs
where job_id = 'AC_MGR';

select *
from jobs
where job_id != 'FI_ACCOUNT';

select EMPLOYEE_ID, HIRE_DATE, PHONE_NUMBER
from EMPLOYEES
where HIRE_DATE >= '2003:09:17';

select *
from employees
where COMMISSION_PCT is not null;

select *
from employees
where department_id is null;

select *
from employees
where commission_pct is not null and salary >= 10000;

select first_name || last_name
from employees;

----------------------------------------------------------------



select *
from employees
where salary > 8000 and salary < 10000;

select *
from employees
where salary >= 7000 or salary <= 10000;

select *
from employees
where department_id != 80;

select *
from employees
where commission_pct is not null and hire_date < '2008:01:01';

select *
from regions
where region_id = 1 or region_id = 3 or region_id = 4;


select nvl(commission_pct, 0)
from employees;

select commission_pct
from employees;

select nvl2(commission_pct, 'not null', 'null')
from employees;

select decode(commission_pct, null, 0 ,commission_pct)
from employees;

select nvl2(commission_pct, 'yes', 'no')
from employees;


select employee_id as no, first_name as name, salary as salary, department_name as d_name, location_id as location
from departments, employees
where employees.salary <= 2000;



select *
from employees
where commission_pct in (0.1, 0.25, 0.2, 0.3);

select *
from employees
where commission_pct not in(0.1, 0.25, 0.2, 0.3) or commission_pct is null;

select *
from employees
where department_id in(50, 80);

select *
from employees
where phone_number like '011%';

select *
from employees
where email like '__E%';

select COMMISSION_PCT
from employees
order by COMMISSION_PCT asc;

select COMMISSION_PCT
from employees
order by COMMISSION_PCT desc;


create table c2 as select * from employees;

select *
from c2;

