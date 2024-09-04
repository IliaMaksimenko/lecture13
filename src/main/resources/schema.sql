create table students
(
    id  integer,
    name    text,
    surname text,
    age integer,
    email text,
    classroom object,
    classroom_id integer,
    constraint students_pk
        primary key (id)
);

create table classroom
(
    id integer,
    name text,
    students object,
    constraint classroom_pk
        primary key (id)
);

create table userinfo
(
    id integer,
    login text,
    password text,
    role text,
    constraint userinfo_pk
        primary key (id)
);