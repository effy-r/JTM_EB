DROP TABLE IF EXISTS Teacher;
CREATE TABLE Teacher (
Id int PRIMARY KEY auto_increment ,
firstName varchar(100) NOT NULL,
lastName varchar(100) NOT NULL,
age int
);

SELECT Id, firstName, lastName, age FROM Teacher;

INSERT INTO Teacher (firstName, lastName, age)
VALUES ('John', 'Doe', 36);

INSERT INTO Teacher(firstName, lastName, age)
VALUES ('Jane', 'Doe', 32);

INSERT INTO Teacher(id, firstName, lastName, age)
VALUES (900, 'Mary', 'Boo', 67);

INSERT INTO Teacher(id, firstName, lastName, age)
VALUES (901, 'Steve', 'Wallace', 54);

UPDATE Teacher
SET lastName = 'Parker'
WHERE Id = 900;

UPDATE Teacher
SET lastName = 'Steven'
WHERE Id = 901;

ALTER TABLE Teacher
DROP age;
