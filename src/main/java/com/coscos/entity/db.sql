insert into Cosmetic(product_no, product_name, product_price, file_name, category_code, product_stock, product_sales, reg_date, product_desc) 
values(1001, '비자 트러블 토너', 18000, 'bija trouble toner', 101, 10, 90, NOW(),'토너');

insert into Cosmetic(product_no, product_name, product_price, file_name, category_code, product_stock, product_sales, reg_date, product_desc) 
values(1002, '블랙티 유스 인핸싱 스킨', 25000, 'black tea youth enhancing skin', 101, 20, 80, NOW(), '토너');

insert into Cosmetic(product_no, product_name, product_price, file_name, category_code, product_stock, product_sales, reg_date, product_desc) 
values(1003, '블루벨리 리밸런싱 스킨', 18000, 'blueberry rebalancing skin', 101, 30, 70, NOW(), '토너');

insert into Cosmetic(product_no, product_name, product_price, file_name, category_code, product_stock, product_sales, reg_date, product_desc) 
values(1004, '그린티 히알루론산 스킨', 20000, 'green tea hyaluronic skin', 101, 40, 60, NOW(), '토너');


insert into Category(category_code, parent_category_code, category_name) 
values(100, null, '기초');

insert into Category(category_code, parent_category_code, category_name) 
values(101, 100, '토너');


insert into MEMBER(user_id, user_pwd, role, enabled) 
values("test", "12345", "MEMBER", true);

select * from Cosmetic;
select * from Category;
select * from MEMBER;