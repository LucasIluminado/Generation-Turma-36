create database db_rh;

use db_rh;
create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(255) not null,
    cargo varchar(255) not null,
    cpf bigint,
    salario decimal (10,2),
    
    primary key (id)
);

select * from tb_funcionarios;

insert into tb_funcionarios(nome,cargo,cpf,salario) values ("Carlos","DevJnr",43832323838,2000.00);
insert into tb_funcionarios(nome,cargo,cpf,salario) values ("Amanda","DevSenior",46786544323,5600.00);
insert into tb_funcionarios(nome,cargo,cpf,salario) values ("Beatriz","DevJnr",43832323838,1900.00);
insert into tb_funcionarios(nome,cargo,cpf,salario) values ("Felipe","DevJnr",43832323838,1800.00);
insert into tb_funcionarios(nome,cargo,cpf,salario) values ("Pedro","Analista",566454545433,3500.00);

select * from tb_funcionarios;

-- Sálarios que são maiores que 2000

select nome,cargo,salario from tb_funcionarios where salario > 2000;

-- Sálarios que são menores que 2000

select nome,cargo,salario from tb_funcionarios where salario < 2000;

-- Atualizando um dado

update tb_funcionarios set salario = 6000 where nome = "Amanda";

select * from tb_funcionarios;






    
    
    