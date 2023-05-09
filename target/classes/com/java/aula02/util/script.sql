drop database aula;
create database aula;
use aula;

create table militar
(
    id int primary key auto_increment,
    nome varchar(50)not null,
    nome_guerra varchar(50) not null,
    posto varchar(30) not null
);

insert into militar values (null, 'Joao', 'lopes', 'CP');
insert into militar values (null, 'Maria', 'Joaquina', '1s');
insert into militar values (null, 'Fernando', 'Pereira', '1T');


create table produto
(
    id int primary key auto_increment,
    nome varchar(50)not null,
    preco_Compra varchar(50) not null,
    preco_Venda varchar(30) not null
);

insert into produto values (null, 'sabonete', 0.40, 1.50);
insert into produto values (null, 'atadura', 2.75, 6.50);
insert into produto values (null, 'algodão', 1.20, 3.00);

create table pessoa
(
    id int primary key auto_increment,
    nome varchar(50)not null,
    data_de_nascimento date not null ,
    rua varchar(40)not null,
    bairro varchar(30)not null,
    cidade varchar(30)not null,
    sigla_estado varchar(3)not null,
    telefone varchar(14)not null
);

insert into pessoa values (null,'Wandberg de Lima Faria', '1989/02/18', 'av. Irmãos Guinle nº 649', 'Centro', 'Queimados', 'RJ', '(21)99640-2376');
insert into pessoa values (null,'Jéssica Martins Rosa', '1991/12/05', 'Est. Posteação nº 125', 'São Francisco', 'Queimados', 'RJ', '(21)99321-2052');
insert into pessoa values (null,'Luiz Augusto de Oliveira', '1982/05/05', 'Rua Jacarei nº 402', 'Pindamonhangaba', 'São Paulo', 'SP', '(12)98110-2004');
