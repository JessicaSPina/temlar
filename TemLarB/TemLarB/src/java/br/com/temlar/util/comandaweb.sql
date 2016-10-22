create table categoria(
id_categoria serial not null,
nome_categoria varchar(100) not null,
descricao_categoria varchar (1000),
constraint pk_categoria primary key (id_categoria));

create table produto(
id_produto serial not null,
nome_produto varchar(100) not null,
valor_compra_produto numeric(10,2),
valor_venda_produto numeric(10,2),
quantidade_estoque_produto int,
id_categoria integer not null,
constraint pk_produto primary key (id_produto),
constraint fk_produto_categoria foreign key (id_categoria) references categoria(id_categoria));

select * from categoria

select * from produto

select * from pessoa

select * from funcionario

select * from cliente

drop table pessoa

create table pessoa(
id_pessoa serial not null,
nome_pessoa varchar(100) not null,
login_pessoa varchar(100) not null,
senha_pessoa varchar(100) not null,
tipo_pessoa varchar(100) not null,
constraint pk_pessoa primary key (id_pessoa));

create table funcionario(
id_funcionario serial not null,
salario_funcionario numeric (10,2),
id_pessoa integer not null,
constraint pk_funcionario primary key (id_funcionario),
constraint fk_pessoa_funcionario foreign key (id_pessoa) references pessoa(id_pessoa));

create table cliente(
id_cliente serial not null,
data_nascimento_cliente date,
id_pessoa integer not null,
constraint pk_cliente primary key (id_cliente),
constraint fk_pessoa_cliente foreign key (id_pessoa) references pessoa(id_pessoa));
