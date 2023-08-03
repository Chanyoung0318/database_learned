
create table pk(
    cl1 number primary key,
    cl2 number,
    cl3 number
    );
    
    insert into pk values(1,2,3);
    insert into pk values(2,22,33);
    insert into pk values(3,2,1);
    
    alter table pk add primary key(cl1, cl2);
    
    
create table pk2(
    cll1 number,
    cll2 number,
    cll3 number,
    primary key(cll1, cll2)
    );
    
    insert into pk2 values(1,2,3);
    insert into pk2 values(2,1,33);
    insert into pk2 values(3,2,1);
    
    select *
    from pk2;
    

create table ctable(
    c_count number,
    c_comm nvarchar2(10)
    );
    
select *
from ctable;

create sequence ctable_seq;

select ctable_seq.nextval from dual;
select ctable_seq.currval from dual;

select *
from tab;

insert into ctable values (ctable_seq.nextval, null);
insert into ctable values (ctable_seq.nextval, null);
insert into ctable values (ctable_seq.nextval, null);

commit;

create table price (
    gno number,
    gprice number,
    primary key(gno)
    );
    
insert into price values (1, 30000);
insert into price values (2, 25000);
insert into price values (3, 20000);

commit;

select *
from price;

create table customer (
    bno number,
    bkind nvarchar2(30),
    bname nvarchar2(30),
    barea nvarchar2(30),
    gno number,
    primary key(bno),
    foreign key (gno) references price(gno)
    );
    
drop table customer;

commit;

desc customer;


insert into customer values (1, '������', '���õ', '����', 1);
insert into customer values (2, 'û����', '������', 'ȫ�ϵ�', 3);
insert into customer values (3, 'û����', '���¼�', '�ֹ���', 2);
insert into customer values (4, '������', '������', '��赿', 2);
insert into customer values (5, 'û����', '���õ', '��â��', 1);
insert into customer values (6, '������', '������', '������', 3);
insert into customer values (7, '������', '���¼�', '�븲��', 1);
insert into customer values (8, 'û����', '���¼�', 'û�㵿', 2);

commit;

select *
from customer;

create table test7(
a1 number, a2 number, a3 number, a4 number
);

create index idx_test7_a1a2 on test7(a1,a2);

create unique index idx_test7_a3 on test7(a3);

select * from user_indexes;

select * from test7; -- �ε����� ������� ����

select * from test7 where a1=1; -- �ε��� ���
select * from test7 where a1=1 and a2=1;-- �ε��� ���
select * from test7 where a2=1; -- �ε��� ������� ����
select * from test7 where a3=1; -- �ε��� ���
select * from test7 where a4=1; -- �ε����� ������� ����
select a3 from test7 where a3=1; -- �ε����� ����Ѵ�.