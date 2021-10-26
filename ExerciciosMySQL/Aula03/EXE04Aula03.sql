create database db_quitanda;

use db_quitanda;

create table tb_categoria(
	id bigint AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    avaliacao varchar(255) NOT NULL,
    fresco boolean,
    
    primary key(id)
);

insert into tb_categoria(nome, avaliacao, fresco) values ("Frutas", "Excelente", true);
insert into tb_categoria(nome, avaliacao, fresco) values ("Verduras", "Excelente", true);
insert into tb_categoria(nome, avaliacao, fresco) values ("Legumes", "Excelente", true);
insert into tb_categoria(nome, avaliacao, fresco) values ("Temperos", "Boa", false);
insert into tb_categoria(nome, avaliacao, fresco) values ("Variedades", "Boa", false);

select * from tb_categoria;

create table tb_produtos(
	id bigint AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    qtprodutos int,
    preco decimal(10,2),
    entrega boolean,
    categoriafruta_id bigint,
    
    primary key(id),
    foreign key(categoriafruta_id) references tb_categoria(id)
);

insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Banana", 55, 10.99, false,1);
insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Maça", 58, 8.99, true,1);
insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Melancia", 55, 15.99, false,1);
insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Repolho", 55, 13.99, true,2);
insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Alface", 45, 11.99, true,2);
insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Beteraba", 35, 12.99, true,3);
insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Pimenta", 75, 7.99, false,4);
insert into tb_produtos(nome,qtprodutos,preco,entrega,categoriafruta_id) values ("Carvão", 55, 10.99, true,5);

select* from tb_produtos;

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 3 and 60;

select * from tb_produtos where nome like "%c%";

select * from tb_produtos inner join tb_categoria
on tb_categoria.id = tb_produtos.categoriafruta_id;

select * from tb_produtos inner join tb_categoria
on tb_categoria.id = tb_produtos.categoriafruta_id
where tb_categoria.id = 2;













