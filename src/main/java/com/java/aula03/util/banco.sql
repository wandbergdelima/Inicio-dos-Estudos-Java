insert into pessoa values (null, null, now(), 'Wandberg');
insert into pessoa values (null, null, now(), 'Maria');


create table endereco
(
    id         bigint      not null auto_increment,
    logradouro varchar(50) not null,
    bairro     varchar(40) not null,
    cidade     varchar(30) not null,
    uf         varchar(3)  not null,
    primary key (id)
)

insert into endereco values (null, 'Av. Irmãos Guinle nº 649', 'Centro', 'Queimados', 'RJ');
insert into endereco values (null, 'Est. Posteação nº 125 casa 3', 'São Francisco', 'Queimados', 'RJ');
