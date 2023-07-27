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

