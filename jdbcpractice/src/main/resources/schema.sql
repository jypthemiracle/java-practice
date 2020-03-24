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