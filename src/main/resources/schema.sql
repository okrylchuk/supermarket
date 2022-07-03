CREATE TABLE Category (
                          category_number INTEGER NOT NULL AUTO_INCREMENT,
                          category_name VARCHAR(50) NOT NULL,
                          PRIMARY KEY (category_number)
);

CREATE TABLE Product (
                          id_product INTEGER NOT NULL AUTO_INCREMENT,
                          product_name VARCHAR(50) NOT NULL,
                          producer VARCHAR(50) NOT NULL,
                          product_characteristics VARCHAR(100) NOT NULL,
                          category_number INTEGER,
                          PRIMARY KEY (id_product),
                          FOREIGN KEY (category_number) REFERENCES Category(category_number)
);

CREATE TABLE Store_Product (
                         upc VARCHAR(12) NOT NULL,
                         selling_price DECIMAL(13,4) NOT NULL,
                         products_number INTEGER NOT NULL,
                         id_product INTEGER,
                         upc_prom VARCHAR(12) NULL UNIQUE,
                         PRIMARY KEY (upc),
                         FOREIGN KEY (id_product) REFERENCES Product(id_product),
                         FOREIGN KEY (upc_prom) REFERENCES Store_Product(upc)
);

CREATE TABLE Customer_card (
                         card_number VARCHAR(13) NOT NULL,
                         cust_surname VARCHAR(50) NOT NULL,
                         cust_name VARCHAR(50) NOT NULL,
                         cust_patronymic VARCHAR(50),
                         phone_number VARCHAR(13) NOT NULL,
                         city VARCHAR(50),
                         street VARCHAR(50),
                         zip_code VARCHAR(9),
                         cust_percent INTEGER NOT NULL,
                         PRIMARY KEY (card_number)
);


