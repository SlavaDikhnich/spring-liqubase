CREATE TABLE users (
                     id int8 PRIMARY KEY NOT NULL,
                     first_name VARCHAR(100) NOT NULL,
                     last_name VARCHAR(100) NOT NULL,
                     created_at TIMESTAMP NOT NULL
);