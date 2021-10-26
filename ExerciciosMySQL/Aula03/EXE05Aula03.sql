create database db_construcao;

use db_construcao;

create table tb_categoria(
	id bigint AUTO_INCREMENT,
    nome varchar(255),
    avaliacao varchar(255),
    servicos boolean,
    
    primary key(id)
);

insert into tb_categoria(nome, avaliacao, servicos) values ("Materias", "Boa", false);
insert into tb_categoria(nome, avaliacao, servicos) values ("Ferramentas", "Excelente", false);
insert into tb_categoria(nome, avaliacao, servicos) values ("Acessórios", "Ótimo", false);
insert into tb_categoria(nome, avaliacao, servicos) values ("Decoração", "Boa", true);
insert into tb_categoria(nome, avaliacao, servicos) values ("Mão de Obra", "Média", true);

create table tb_produto(
	id bigint AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    preco decimal(10,2),
    entrega boolean,
    aluguel boolean,
    categoria_id bigint,
    
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("Furradeira",69.99,true, true,2);
insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("Maquita",89.99,true, true,2);
insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("Serralheira",109.99,true, true,2);
insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("Cimento",59.99,false, true,1);
insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("tijolo",49.99,true, false,1);
insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("Quadros",29.99,true, false,4);
insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("Buchas",1.99,true, false,1);
insert into tb_produto(nome, preco, entrega, aluguel, categoria_id) values ("Parafuso",2.99,true, false,1);

select * from tb_produto;

select * from tb_produto where preco > 50;

select * from tb_produto where preco between 3 and 60;

select * from tb_produto where nome like "%c%";

select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id;

select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.id = 2;



