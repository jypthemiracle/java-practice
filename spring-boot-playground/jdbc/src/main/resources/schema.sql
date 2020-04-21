DROP TABLE IF EXISTS GAME;
DROP TABLE IF EXISTS USER;

CREATE TABLE author (
    id integer identity primary key,
    name varchar(100),
    birth_date date
);

create table book (
    id integer identity primary key,
    title varchar(255),
    ISBN varchar(255)
);

create table book_author (
    author integer,
    book integer,
    name varchar(100),
    primary key (author, book)
);

CREATE TABLE USER (
    id int primary key auto_increment,
    email varchar(64)
);

CREATE TABLE GAME (
    id int primary key auto_increment,
    title varchar(64),
    user int references user(id),
    user_key clob
);