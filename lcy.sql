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


--문제 4) 다음 데이터를 저장할 수 있는 테이블을 만들고 CRUDE 작업 가능한 sql을 만들어보자.

create table Checkout (
    도서명 nvarchar2(30),
    저자 nvarchar2(30),
    대출일 date,
    반납예정일 date,
    실제반납일 date,
    연체료_원 number(10)
    );
    
desc checkout;

insert into checkout values ('죄와_벌', '톨스토이', to_date('2023:03:01', 'YYYY:MM:DD'), to_date('2023:03:15', 'YYYY:MM:DD'), to_date('2023:03:20', 'YYYY:MM:DD'), 500);
insert into checkout values ('해리포터와_마법사의_돌', 'J.K.롤링', to_date('2023:04:10', 'YYYY:MM:DD'), to_date('2023:04:24', 'YYYY:MM:DD'), to_date('2023:04:23', 'YYYY:MM:DD'), 0);
insert into checkout values ('반지의_제왕', 'J.R.R.톨킨', to_date('2023:05:15', 'YYYY:MM:DD'), to_date('2023:05:29', 'YYYY:MM:DD'), to_date('2023:05:29', 'YYYY:MM:DD'), 0);
insert into checkout values ('빨간_머리_앤', 'L.M.몽고베리', to_date('2023:06:20', 'YYYY:MM:DD'), to_date('2023:07:04', 'YYYY:MM:DD'), NULL, NULL);
insert into checkout values ('산삼', '박완서', to_date('2023:07:10', 'YYYY:MM:DD'), to_date('2023:07:24', 'YYYY:MM:DD'), NULL, NULL);

commit;

select *
from checkout;

--죄와 벌 을 빌려간 사람은 언제 반납 했는가?
select 실제반납일
from checkout
where 도서명 = '죄와_벌';

--빨간 머리 앤을 빌려간 사람이 2023/07/04 에 반납했으니 연체료 0원과 함께 업데이트 하시오.
update checkout
set 실제반납일 = to_date('2023:07:04', 'YYYY:MM:DD'), 연체료_원 = 0
where 도서명 = '빨간_머리_앤';

--저자가 '박완서'인 책을 빌려간 사람이 두달 연체되어 반납했다. 반납일과 연체료 5000원을 업데이트 하시오.
update checkout
set 실제반납일 = to_date('2023:09:04', 'YYYY:MM:DD'), 연체료_원 = 5000
where 저자 = '박완서';

--DB에 용량이 적으니, 실제 반납일이  2023/05/01 전 기록들을 삭제하시오.
delete
from checkout
where 실제반납일 < '2023/05/01';

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

insert into c_o_history values (2023001, '홍길동', to_date('2023:03:05', 'YYYY:MM:DD'), '노트북', 1,1200000, 1200000);
insert into c_o_history values (2023002, '김영희', to_date('2023:03:08', 'YYYY:MM:DD'), '스마트폰', 2,800000, 1600000);
insert into c_o_history values (2023003, '박철수', to_date('2023:03:15', 'YYYY:MM:DD'), '헤드폰', 3,1500000, 450000);
insert into c_o_history values (2023004, '이지훈', to_date('2023:03:20', 'YYYY:MM:DD'), '마우스', 1,30000, 30000);
insert into c_o_history values (2023005, '김민지', to_date('2023:03:25', 'YYYY:MM:DD'), '노트북', 1,50000, 50000);

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

insert into baseball values ('LG트원스', 3, '패', to_date('2023:07:26', 'YYYY:MM:DD'), '고우석', '서울', 'KBS_N_SPORTS');
insert into baseball values ('KT위즈', 4, '승', to_date('2023:07:26', 'YYYY:MM:DD'), '손동현', '수원', '네이버스포츠');

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

insert into album values ('NewJeans_2nd_EP_Get_Up', 'NewJeans', to_date('2023:07:21','YYYY:MM:DD'), '댄스', 'YG_PLUS','ADOR', 35253, 4.6, 5497, 8808);

select *
from album;

commit;