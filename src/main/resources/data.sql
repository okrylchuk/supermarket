INSERT INTO Category(category_name) values ('diary');
INSERT INTO Category(category_name) values ('fruits');
INSERT INTO Category(category_name) values ('vegetables');

INSERT INTO Product(product_name, producer, product_characteristics, category_id) values ('milk','organic','cold',1);
INSERT INTO Product(product_name, producer, product_characteristics, category_id) values ('apple','organic','it is an apple',2);
INSERT INTO Product(product_name, producer, product_characteristics, category_id) values ('banana','organic','tasty',2);
INSERT INTO Product(product_name, producer, product_characteristics, category_id) values ('tomato','organic','red',3);

INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a1',2.99,15,1);
INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a2',2.99,15,2);
INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a3',2.99,15,1);
INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a4',2.99,15,3);
INSERT INTO Store_Product(upc, selling_price, products_number, id_product) values ('a5',2.99,15,2);

INSERT INTO Employee (id_employee, email, password, empl_role, status)
VALUES (1, 'admin', '$2a$12$8Iym3DU0oQLVl9jd4MpAXObhe5WXfpRway1uQPERNNiowL.QAxZxO', 'ADMIN', 'ACTIVE');
INSERT INTO Employee (id_employee, email, password, empl_role, status)
VALUES (2, 'user', '$2a$12$qTlzpZfcALHCYTbAfNU8Teqkb.3IfxpNyheTUcPbOeAkvA..9kQmW', 'USER', 'ACTIVE');

