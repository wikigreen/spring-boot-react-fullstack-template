-- create a table
CREATE TABLE task
(
    id          INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    description TEXT NOT NULL
);

-- add test data
INSERT INTO task (description)
VALUES ('test row 1'),
       ('test row 2'),
       ('test row 3');
