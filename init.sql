CREATE DATABASE ftm;
GRANT ALL PRIVILEGES ON DATABASE ftm TO postgres;

CREATE TABLE IF NOT EXISTS client
(
    id SERIAL NOT NULL,
    balance numeric(10,2),
    cpf varchar(255),
    name varchar(255) ,
    number_card varchar(255) ,
    password_card varchar(255) ,
    score integer,
    status varchar(255) ,
    version integer,
    PRIMARY KEY (id)
);

insert into client (balance, cpf, name, number_card, password_card, score, status, version) values 
(1000.55, '31984284835', 'Rafael Soares', '1234456785201319', 'b59c67bf196a4758191e42f76670ceba', 0, 'ATIVO', 0);
