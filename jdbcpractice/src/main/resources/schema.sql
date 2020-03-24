drop table if exists movie;
drop table if exists rental;

create table movie (
    id serial primary key,
    title varchar(64),
    description varchar(64)
);

create table rental (
    id serial primary key,
    movie integer references movie(id),
    movie_key integer,
    duration varchar(64),
    price integer
);

create table author (
    id integer identity primary key,
    name varchar(100),
    birth_date date
);

create table book (
    id integer identity primary key,
    title varchar(255),
    isbn varchar(255)
);

create table book_author (
    author integer,
    book integer,
    name varchar(100),
    primary key (author, book)
);