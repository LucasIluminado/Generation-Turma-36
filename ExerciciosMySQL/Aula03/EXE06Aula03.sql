create database db_cursos;

use db_cursos;

create table tb_categoria(
	id bigint AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    certificado boolean,
    
    primary key(id)
);

insert into tb_categoria(nome, certificado) values ("Front-End",true);
insert into tb_categoria(nome, certificado) values ("Back-End",true);
insert into tb_categoria(nome, certificado) values ("Full-Stack",true);
insert into tb_categoria(nome, certificado) values ("Bootcamp",true);
insert into tb_categoria(nome, certificado) values ("Banco de Dados",true);

select * from tb_categoria;

create table tb_curso(
	id bigint AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    periodo varchar(255),
    presencial boolean,
    precomes decimal(10,2),
    categoria_id bigint,
    
    primary key(id),
    foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("React","Manhã", false,69.99, 1);
insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("HTML","Manhã", true,99.99, 1);
insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("Java","Tarde", true, 129.99, 2);
insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("Pynthon","Tarde", true,149.99, 2);
insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("Dev Jnr JavaScript","Manhã-Tarde", true,200.00, 4);
insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("Dev jnr Java","Manhã-Tarde", true,200.00, 4);
insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("MySQL","Manhã", true,80.99, 5);
insert into tb_curso(nome,periodo,presencial,precomes,categoria_id) values ("JavaScript Front","Manhã", true,109.99, 1);

select * from tb_curso;

select * from tb_curso where precomes > 50;

select * from tb_curso where precomes between 3 and 60;

select * from tb_curso where nome like "%j%";

select * from tb_curso inner join tb_categoria
on tb_categoria.id = tb_curso.categoria_id;

select * from tb_curso inner join tb_categoria
on tb_categoria.id = tb_curso.categoria_id
where tb_categoria.id = 2;




