DROP TABLE IF EXISTS books;

CREATE TABLE books(
id INT AUTO_INCREMENT PRIMARY KEY,
author_id VARCHAR(250) NOT NULL,
title VARCHAR(250) NOT NULL,
price_Old VARCHAR(250) DEFAULT NULL,
price VARCHAR(250) DEFAULT NULL
);
DROP TABLE IF EXISTS authors;
create table authors (
                         id INT,
                         first_name VARCHAR(50),
                         last_name VARCHAR(50)
);
