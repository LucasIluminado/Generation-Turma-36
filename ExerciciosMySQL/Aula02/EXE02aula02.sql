create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    marca varchar(255) not null,
    preco decimal (10,2),
    disponivel boolean,
    primary key (id)
);

select * from tb_produtos;

insert into tb_produtos(nome,marca,preco,disponivel) values ("Camiseta","Nike",129.99,true);
insert into tb_produtos(nome,marca,preco,disponivel) values ("Tênis","Adidas",600.00,true);
insert into tb_produtos(nome,marca,preco,disponivel) values ("Boné","Lacoste",109.99,true);
insert into tb_produtos(nome,marca,preco,disponivel) values ("Jaqueta","Nike",399.99,true);
insert into tb_produtos(nome,marca,preco,disponivel) values ("Shorts","QuikSilver",129.99,false);
insert into tb_produtos(nome,marca,preco,disponivel) values ("Meias","HangLose",79.90,true);
insert into tb_produtos(nome,marca,preco,disponivel) values ("Cuecas","QuikSIlver",69.99,true);
insert into tb_produtos(nome,marca,preco,disponivel) values ("Carteira","Gucci",89.99,true);

select * from tb_produtos;
select nome,marca,preco from tb_produtos where preco > 500;
select nome,marca,preco from tb_produtos where preco < 500;

update tb_produtos set disponivel = true where id = 5 ;
select * from tb_produtos;


