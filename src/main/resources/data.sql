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

