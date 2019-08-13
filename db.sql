--
-- File generated with SQLiteStudio v3.2.1 on Tue Aug 13 21:29:12 2019
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: person
DROP TABLE IF EXISTS person;

CREATE TABLE person (
    id     INTEGER      PRIMARY KEY
                        NOT NULL,
    name   VARCHAR (20),
    phone  VARCHAR (15),
    street VARCHAR (40),
    city   VARCHAR,
    pin    VARCHAR
);

INSERT INTO person (id, name, phone, street, city, pin) VALUES (1, 'John', '123456', 'Johns Street', 'Johns City', '001');
INSERT INTO person (id, name, phone, street, city, pin) VALUES (2, 'Mark', '234567', 'Marks Street', 'Marks City', '002');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
