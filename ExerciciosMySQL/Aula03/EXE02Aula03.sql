create database db_pizzaria;

use db_pizzaria;

create table tb_categorias(
	id bigint auto_increment,
    nome varchar (255) not null,
	categoria varchar(255) not null,
    tempo varchar(255) not null,
    
    primary key(id)
);

insert into tb_categorias(nome, categoria, tempo) values ("Lanches","Combo","30 min");
insert into tb_categorias(nome, categoria, tempo) values ("Pizza","Doce","30 min");
insert into tb_categorias(nome, categoria, tempo) values ("Pizza","Vegana","25 min");
insert into tb_categorias(nome, categoria, tempo) values ("Pizza","Mista","35 min");
insert into tb_categorias(nome, categoria, tempo) values ("Sobremesas","Doce","15 min");

select * from tb_categorias;

create table tb_pizza(
	id bigint auto_increment,
    nome varchar(255) not null,
    sabor varchar(255) not null,
    preco decimal(10,2),
    disponibilidade boolean,
    categoria_id bigint,
   
	primary key(id),
    foreign key(categoria_id) references tb_categorias (id)
);

select * from tb_pizza;

insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Pizza Romeu e Julieta","Queijo e Goibada",34.99,true,2);
insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Pizza Caipira","Frango e Catupiry",28.99,true,4);
insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Pizza Tradicional","Calabresa",27.99,true,4);
insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Pizza Green","Brocolis",27.99,true,3);
insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Pizza Fazenda","Batata",32.99,true,3);
insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Pizza Aniversario","Brigadeiro",64.99,true,2);
insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Lanche Familia","X-Tudo",20.00,true,1);
insert into tb_pizza(nome, sabor, preco, disponibilidade, categoria_id) values ("Copo da Felicidade","KitKat",12.00,true,5);

select * from tb_pizza;

select * from tb_pizza where preco > 45;

select * from tb_pizza where preco between 29 and 60;

select * from tb_pizza where nome like "%c%";

select * from tb_pizza inner join tb_categorias
on tb_categorias.id = tb_pizza.categoria_id;

select * from tb_pizza inner join tb_categorias
on tb_categorias.id = tb_pizza.categoria_id
where tb_categorias.id = 2;













