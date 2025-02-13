CREATE DATABASE hello_java;

USE hello_java;

CREATE TABLE tb_person (
    id   INT PRIMARY KEY,
    name VARCHAR(200)
);

ALTER TABLE tb_person
#     DROP phones;
    ADD address VARCHAR(200);

CREATE TABLE tb_phone (
    id        INT PRIMARY KEY,
    phone     VARCHAR(200),
    person_id INT,
    FOREIGN KEY (person_id) REFERENCES tb_person (id)
);

# R - READ
SELECT name
FROM tb_person;
# where id = 1;
# where name like '%minh'; -- wildcard
# where name like 'Do Long _inh'; -- wildcard

SELECT *
FROM tb_phone;

SELECT p.id, name, tp.phone
FROM tb_person p
LEFT JOIN tb_phone tp ON p.id = tp.person_id;


# C - CREATE
INSERT INTO tb_person(id, name)
VALUES
    (1, 'Do Long Minh'),
    (2, 'Vu Hoang Minh'),
    (3, 'Le Minh Duc');

INSERT INTO tb_phone
VALUES
    (1, '1234', 1);

# U - UPDATE
UPDATE tb_person
SET name = 'Do Long Minh dep trai'
WHERE id = 1;

UPDATE tb_person
SET name = 'Vu Hoang Minh dep trai'
WHERE id = 2;

# D - DELETE
DELETE FROM tb_person
# WHERE id = 3;
WHERE name LIKE '%dep trai'
