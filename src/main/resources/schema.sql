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
                         PRIMARY KEY (upc),
                         FOREIGN KEY (id_product) REFERENCES Product(id_product)
);

CREATE TABLE Customer_Card (
                         card_number        VARCHAR(13) NOT NULL,
                         cust_surname       VARCHAR(50) NOT NULL,
                         cust_name          VARCHAR(50) NOT NULL,
                         cust_patronymic    VARCHAR(50),
                         phone_number       VARCHAR(13) NOT NULL,
                         city               VARCHAR(50),
                         street             VARCHAR(50),
                         zip_code           VARCHAR(50),
                         cust_percent       INTEGER NOT NULL,
                         PRIMARY KEY (card_number)

);

CREATE TABLE Employee
(
    id_employee     VARCHAR(10) NOT NULL,
    empl_surname    VARCHAR(50) NOT NULL,
    empl_name       VARCHAR(50) NOT NULL,
    empl_patronymic VARCHAR(50),
    empl_role       VARCHAR(10) NOT NULL,
    salary          DECIMAL(13,4) NOT NULL,
    date_of_birth   DATE NOT NULL,
    date_of_start   DATE NOT NULL,
    phone_number    VARCHAR(13) NOT NULL,
    city            VARCHAR(50) NOT NULL,
    street          VARCHAR(50) NOT NULL,
    zip_code        VARCHAR(50) NOT NULL,
    login           VARCHAR(50) NOT NULL,
    password        VARCHAR(100) NOT NULL,
    status          VARCHAR(10) NOT NULL,
    PRIMARY KEY (id_employee)
);

CREATE TABLE MyChecks (
                               check_number       VARCHAR(10) NOT NULL,
--                                print_date         DATE NOT NULL,
                               sum_total          DECIMAL(13,4) NOT NULL,
--                                vat                DECIMAL(13,4) NOT NULL,
--                                id_employee        VARCHAR(10) NOT NULL ,
--                                card_number        VARCHAR(13),
                               PRIMARY KEY (check_number)
--                                FOREIGN KEY (id_employee) REFERENCES Employee(id_employee)
--                                FOREIGN KEY (card_number) REFERENCES Customer_Card(card_number)
);

/*CREATE TABLE Sale (
                        product_number     INTEGER NOT NULL,
                        selling_price      DECIMAL(13,4) NOT NULL,
                        upc                VARCHAR(12) NOT NULL,
                        check_number       VARCHAR(10) NOT NULL,
                        PRIMARY KEY (upc, check_number),
                        FOREIGN KEY (upc) REFERENCES Store_Product(upc),
                        FOREIGN KEY (check_number) REFERENCES Checks(check_number)
);*/


