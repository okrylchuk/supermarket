CREATE TABLE Category (
                          category_id INTEGER NOT NULL AUTO_INCREMENT,
                          category_name VARCHAR(50) NOT NULL,
                          PRIMARY KEY (category_id)
);

CREATE TABLE Product (
                          id_product INTEGER NOT NULL AUTO_INCREMENT,
                          product_name VARCHAR(50) NOT NULL,
                          producer VARCHAR(50) NOT NULL,
                          product_characteristics VARCHAR(100) NOT NULL,
                          category_id INTEGER,
                          PRIMARY KEY (id_product),
                          FOREIGN KEY (category_id) REFERENCES Category(category_id)
);

CREATE TABLE Store_Product (
                         upc VARCHAR(12) NOT NULL,
                         selling_price DECIMAL(13,4) NOT NULL,
                         products_number INTEGER NOT NULL,
                         id_product INTEGER,
                         PRIMARY KEY (upc),
                         FOREIGN KEY (id_product) REFERENCES Product(id_product)
);

CREATE TABLE Employee
(
    id_employee     VARCHAR(10) NOT NULL,
    email           VARCHAR(50) NOT NULL,
    password        VARCHAR(100) NOT NULL,
    empl_role       VARCHAR(10) NOT NULL,
    status          VARCHAR(10) NOT NULL,
    PRIMARY KEY (id_employee)
);