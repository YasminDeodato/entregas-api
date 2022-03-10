CREATE TABLE Cliente(
    id bigint NOT NULL AUTO_INCREMENT,
    nome varchar(100) NOT NULL,
    email varchar(255) NOT NULL,
    telefone varchar(20) NOT NULL,
    PRIMARY KEY (id)
);