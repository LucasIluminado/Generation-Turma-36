create database db_farmacia;

use db_farmacia;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(255) not null,
    categoria varchar (255) not null,
    Receita varchar(255) not null,
    
    primary key(id)
);

insert into tb_categoria(nome, categoria, receita) values ("Vacinas","Injeções", "Não Necessário");
insert into tb_categoria(nome, categoria, receita) values ("Produtos","Itens", "Não Necessário");
insert into tb_categoria(nome, categoria, receita) values ("Medicamentos Leves","Medicação", "Não Necessário");
insert into tb_categoria(nome, categoria, receita) values ("Medicamentos Pesados","Medicação Pesada", "Necessário");
insert into tb_categoria(nome, categoria, receita) values ("Testes","Exames", "Não Necessário");

select * from tb_categoria;

create table tb_produto(
	id bigint auto_increment,
    nome varchar(255) not null,
    saude varchar(255) not null,
    entrega_disponivel boolean,
	preco decimal (10,2),
    catservico_id bigint,
    
    primary key(id),
    foreign key (catservico_id) references tb_categoria(id)
);

insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Escova de Dente","Saúde Bucal", true, 20.00,2);
insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Pasta de Dente","Saúde Bucal", true, 8.00,2);
insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Fio Dental","Saúde Bucal", true, 10.00,2);
insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Dipirona","Saúde", true, 13.00, 3);
insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Dramin","Saúde", true, 10.00,3);
insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Vacina Covid-19","Saúde Viral", true, 0.00,1);
insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Teste COvid-29","Saúde", true, 0.00,5);
insert into tb_produto(nome, saude, entrega_disponivel, preco, catservico_id) values("Paroxetina","Saúde Mental", true, 20.00,4);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%b%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.catservico_id;

select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.catservico_id
where tb_categoria.id = 2;










