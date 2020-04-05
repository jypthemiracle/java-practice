DROP TABLE IF EXISTS GAME;
DROP TABLE IF EXISTS USER;

CREATE TABLE USER (
    id int primary key auto_increment,
    email varchar(64)
);

CREATE TABLE GAME (
    id int primary key auto_increment,
    title varchar(64),
    user int references user(id)
);