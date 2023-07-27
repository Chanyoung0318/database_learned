create table CinStatus(
    Che_name NVARCHAR2(30),
    Kg number(10),
    m_Kg number(10),
    S_date date
    );
    
desc CinStatus;

insert into cinstatus values ('CH_3COOH', 500, 100, to_date('2023:03:15 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into cinstatus values ('CH_3COOH', 500, 100, to_date('2023:03:15 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into cinstatus values ('NaOH', 300, 50, to_date('2023:04:20 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into cinstatus values ('H2SO4', 200, 80, to_date('2023:05:10 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into cinstatus values ('CaCI2', 400, 120, to_date('2023:06:05 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into cinstatus values ('HCI', 600, 200, to_date('2023:07:08 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));

commit;

select *
from Cinstatus;


--���� 4) ���� �����͸� ������ �� �ִ� ���̺��� ����� CRUDE �۾� ������ sql�� ������.

create table Checkout (
    ������ nvarchar2(30),
    ���� nvarchar2(30),
    ������ date,
    �ݳ������� date,
    �����ݳ��� date,
    ��ü��_�� number(10)
    );
    
desc checkout;

insert into checkout values ('�˿�_��', '�罺����', to_date('2023:03:01', 'YYYY:MM:DD'), to_date('2023:03:15', 'YYYY:MM:DD'), to_date('2023:03:20', 'YYYY:MM:DD'), 500);
insert into checkout values ('�ظ����Ϳ�_��������_��', 'J.K.�Ѹ�', to_date('2023:04:10', 'YYYY:MM:DD'), to_date('2023:04:24', 'YYYY:MM:DD'), to_date('2023:04:23', 'YYYY:MM:DD'), 0);
insert into checkout values ('������_����', 'J.R.R.��Ų', to_date('2023:05:15', 'YYYY:MM:DD'), to_date('2023:05:29', 'YYYY:MM:DD'), to_date('2023:05:29', 'YYYY:MM:DD'), 0);
insert into checkout values ('����_�Ӹ�_��', 'L.M.������', to_date('2023:06:20', 'YYYY:MM:DD'), to_date('2023:07:04', 'YYYY:MM:DD'), NULL, NULL);
insert into checkout values ('���', '�ڿϼ�', to_date('2023:07:10', 'YYYY:MM:DD'), to_date('2023:07:24', 'YYYY:MM:DD'), NULL, NULL);

commit;

select *
from checkout;

--�˿� �� �� ������ ����� ���� �ݳ� �ߴ°�?
select �����ݳ���
from checkout
where ������ = '�˿�_��';

--���� �Ӹ� ���� ������ ����� 2023/07/04 �� �ݳ������� ��ü�� 0���� �Բ� ������Ʈ �Ͻÿ�.
update checkout
set �����ݳ��� = to_date('2023:07:04', 'YYYY:MM:DD'), ��ü��_�� = 0
where ������ = '����_�Ӹ�_��';

--���ڰ� '�ڿϼ�'�� å�� ������ ����� �δ� ��ü�Ǿ� �ݳ��ߴ�. �ݳ��ϰ� ��ü�� 5000���� ������Ʈ �Ͻÿ�.
update checkout
set �����ݳ��� = to_date('2023:09:04', 'YYYY:MM:DD'), ��ü��_�� = 5000
where ���� = '�ڿϼ�';

--DB�� �뷮�� ������, ���� �ݳ�����  2023/05/01 �� ��ϵ��� �����Ͻÿ�.
delete
from checkout
where �����ݳ��� < '2023/05/01';

select *
from checkout;


create table C_O_history(
    O_number number(10),
    C_name nchar(10),
    O_date date,
    P_name nvarchar2(20),
    quality number(20),
    P_price number(20),
    O_price number(20)
    );
    
desc C_O_history;

insert into c_o_history values (2023001, 'ȫ�浿', to_date('2023:03:05', 'YYYY:MM:DD'), '��Ʈ��', 1,1200000, 1200000);
insert into c_o_history values (2023002, '�迵��', to_date('2023:03:08', 'YYYY:MM:DD'), '����Ʈ��', 2,800000, 1600000);
insert into c_o_history values (2023003, '��ö��', to_date('2023:03:15', 'YYYY:MM:DD'), '�����', 3,1500000, 450000);
insert into c_o_history values (2023004, '������', to_date('2023:03:20', 'YYYY:MM:DD'), '���콺', 1,30000, 30000);
insert into c_o_history values (2023005, '�����', to_date('2023:03:25', 'YYYY:MM:DD'), '��Ʈ��', 1,50000, 50000);

commit;

select *
from c_o_history;





create table baseball(
    team nvarchar2(20),
    score number(10),
    win_or_lose nchar(10),
    match_date date,
    S_pitcher nvarchar2(10),
    home_ground nvarchar2(10),
    channel nvarchar2(20)
    );

desc baseball;

drop table baseball;

insert into baseball values ('LGƮ����', 3, '��', to_date('2023:07:26', 'YYYY:MM:DD'), '��켮', '����', 'KBS_N_SPORTS');
insert into baseball values ('KT����', 4, '��', to_date('2023:07:26', 'YYYY:MM:DD'), '�յ���', '����', '���̹�������');

select *
from baseball;

commit;



create table album(
    album_name nvarchar2(30),
    singer nvarchar2(20),
    r_date date,
    genre nvarchar2(20),
    publisher nvarchar2(20),
    agency nvarchar2(20),
    user_like number(10),
    user_scope number(2,1),
    scope_num number(10),
    comment_num number(10)
    );
    

desc album;

insert into album values ('NewJeans_2nd_EP_Get_Up', 'NewJeans', to_date('2023:07:21','YYYY:MM:DD'), '��', 'YG_PLUS','ADOR', 35253, 4.6, 5497, 8808);

select *
from album;

commit;