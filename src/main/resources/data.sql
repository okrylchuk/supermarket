INSERT INTO Category(category_name) values ('diary');
INSERT INTO Category(category_name) values ('fruits');
INSERT INTO Category(category_name) values ('vegetables');

INSERT INTO Product(product_name, producer, product_characteristics, category_number) values ('milk','organic','cold',1);
INSERT INTO Product(product_name, producer, product_characteristics, category_number) values ('apple','organic','it is an apple',2);
INSERT INTO Product(product_name, producer, product_characteristics, category_number) values ('banana','organic','tasty',2);
INSERT INTO Product(product_name, producer, product_characteristics, category_number) values ('tomato','organic','red',3);

INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a1',2.99,15,1);
INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a4',2.99,15,2);
INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a3',2.99,15,3);
/*INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a2',2.99,15,2);
INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a5',2.99,15,1);*/


INSERT INTO Customer_card(card_number, cust_surname, cust_name, cust_patronymic, phone_number, city, street, zip_code, cust_percent)
values ('a1','Ivanov','John','Smith','0501234455','Kyiv','Banderu','03020',3);

INSERT INTO Employee (id_employee, empl_surname, empl_name, empl_patronymic, empl_role, salary, date_of_birth, date_of_start,
                      phone_number, city, street, zip_code, login, password, status)
VALUES (1, 'surname', 'name', 'patron', 'USER', 5000, '2002-01-01', '2020-01-01', '0672345566', 'Kyiv', 'street', '04020',
        'admin', '$2a$12$8Iym3DU0oQLVl9jd4MpAXObhe5WXfpRway1uQPERNNiowL.QAxZxO', 'ACTIVE');
INSERT INTO Employee (id_employee, empl_surname, empl_name, empl_patronymic, empl_role, salary, date_of_birth, date_of_start,
                      phone_number, city, street, zip_code, login, password, status)
VALUES (2, 'surname2', 'name2', 'patron2', 'USER', 5000, '2002-01-01', '2020-01-01', '0672345566', 'Kyiv', 'street', '04020',
        'user', '$2a$12$qTlzpZfcALHCYTbAfNU8Teqkb.3IfxpNyheTUcPbOeAkvA..9kQmW', 'ACTIVE');


-- INSERT INTO Checks(check_number, print_date, sum_total, vat) values ('a1',2.99,15,1);
insert into mychecks(check_number, sum_total) values ('1', 20.0);
insert into mychecks(check_number, sum_total) values ('2', 20.0);
-- insert into sale(product_number, selling_price, upc, check_number) values (2, 3, 'a2', '1');