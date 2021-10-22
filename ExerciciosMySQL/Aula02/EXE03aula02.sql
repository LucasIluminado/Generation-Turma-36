create database db_escola;

use db_escola;
create table tb_estudantes(
	id bigint auto_increment,
    nome varchar(255) not null,
    turma varchar(255) not null,
    nota decimal (5,2),
    aprovacao boolean,
    primary key (id)
);

select * from tb_estudantes;

insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Pedro","2-B",8.9,true);
insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Pablo","3-B",6.5,true);
insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Vitoria","2-I",8.0,true);
insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Maria","2-H",9.5,true);
insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Carlos","2-J",5.5,false);
insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Victor","2-C",4.0,false);
insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Beatriz","3-A",10,true);
insert into tb_estudantes(nome,turma,nota,aprovacao) values ("Carla","2-C",7.0,true);

select * from tb_estudantes;

select nome,turma,nota from tb_estudantes where nota > 7;
select nome,turma,nota from tb_estudantes where nota < 7;

update tb_estudantes set turma = "2-K" where id = 7;
select * from tb_estudantes;




