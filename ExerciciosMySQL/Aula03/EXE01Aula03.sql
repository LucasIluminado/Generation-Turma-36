create database db_games;

use db_games;

create table tb_classes(
	id bigint auto_increment,
    nome varchar(255),
    skill varchar(150),
    arma varchar(255),
    
    primary key (id)
);

insert into tb_classes(nome, skill, arma) values ("Mago","Bola de Fogo","Cajado");
insert into tb_classes(nome, skill, arma) values ("Ladrão","Roubo","38");
insert into tb_classes(nome, skill, arma) values ("Arqueiro","Mil Flechas","Arco");
insert into tb_classes(nome, skill, arma) values ("Velocista","Incansável","Pernas");
insert into tb_classes(nome, skill, arma) values ("Curandeiro","Ressurreição","Grimório");

create table tb_personagens(
	id bigint auto_increment,
    nome varchar(300) not null,
    nivel int,
    ataque int,
    defesa int,
    classe_id bigint,
    
    primary key (id),
    foreign key (classe_id) references tb_classes (id)
);

insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values ("Ladrão de Casadas", 1000, 2000,900, 2);
insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values ("Relâmpago MCQueen", 450, 1100,500, 4);
insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values ("Safira Clock", 5000, 8000, 15000, 5);
insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values ("Deusa da Àgua May May", 10000, 20000, 100, 5);
insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values ("Careca",10000, 1500, 3000, 2);
insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values ("O Ana", 50, 1500, 100, 3);
insert into tb_personagens(nome, nivel, ataque, defesa, classe_id) values ("Guardiâ", 20000, 5000, 4300, 1);

select * from tb_classes;

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;

select * from tb_personagens where defesa between 1000 and 20000;

select * from tb_personagens where nome like "%c%";

select * from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.classe_id;

select * from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.classe_id
where tb_classes.id = 2;











