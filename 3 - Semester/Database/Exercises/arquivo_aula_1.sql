create database aula
go


use aula

create table produtos
(
	id int identity(1,1) primary key,
	loja varchar(2),
	endereco varchar(30),
	numero varchar(5),
	tipo varchar(20),
	fabricante varchar(30),
	modelo varchar(30),
	ano_fab int,
	cor varchar(20),
	valor_ent float,
	valor_saida float,
	data_ent date,
	data_saida date,
	vendedor varchar(30),
)

insert into produtos values
('1', 'Rua sete', '234', 'carro', 'Renault', 'Sandero', 2005, 'Azul', 24600, 28200, '20120926', '20120929', 'Jose Manuel'),
('1', 'Rua sete', '234', 'moto', 'Yamaha', 'Fazer', 2008, 'Vermelha', 6000, 72000, '20120725', '20120812', 'Jose Manuel'),
('2', 'Rua 15 de Novembro', '915', 'carro', 'Renault', 'Clio', 2005, 'Branco', 12000, 12500, '20120626', '20121001', 'Joaquim Santos'),
('2', 'Rua 15 de Novembro', '915', 'carro', 'Honda', 'Civic', 2002, 'Azul', 19200, 23000, '20120815', '20120910', 'Otavio Augusto'),
('3', 'Rua Sao Bento', '4', 'carro', 'VW', 'Passat', 1999, 'azul', 15800, 23500, '20120926', '20120929', 'Juliano Tesla'),
('1', 'Rua sete', '234', 'moto', 'Harley Davidson', 'Fat Boy 1600', 2010, 'Preto', 32000, 39500, '20120526', '20120529', 'Jose Manuel'),
('1', 'Rua sete', '234', 'carro', 'Fiat', 'Siena', 2008, 'Preto', 17600, 20900, '20120209', '20120712', 'Jose Joaquim'),
('1', 'Rua sete', '234', 'moto', 'Honda', 'Hornet', 2009, 'Preto', 22300, 26900, '20120110', '20120205', 'Jose Manuel'),
('3', 'Rua Sao Bento', '4', 'carro', 'VW', 'Fox', 2006, 'Cinza',16500, 21500, '20120714', '20120905', 'Juliano Tesla'),
('4', 'Av. Nogueira Padilha', '100', 'carro', 'Ford', 'Ecosport', 2006, 'Prata', 244000, 27900, '20120326', '20120429', 'Josue Flox'),
('3', 'Rua Sao Bento', '4', 'carro', 'Renault', 'Sandero', 2009, 'Preto', 26000, 29500, '20120626', '20121005', 'Juliano Tesla'),
('1', 'Rua sete', '234', 'carro', 'Renault', 'Sandero', 2010, 'Verde', 24600, 32200, '20120426', '20120629', 'Jose Manuel'),
('3', 'Rua Sao Bento', '4', 'carro', 'Renault', 'Sandero', 2007, 'azul', 21400, 22200, '20120526', '20120829', 'Juliano Tesla'),
('1', 'Rua sete', '234', 'carro', 'Honda', 'Civic', 2008, 'Cinza', 32000, 39500, '20120226', '20120329', 'Jose Manuel'),
('3', 'Rua Sao Bento', '4', 'carro', 'Chevrolet', 'Meriva Joy', 2005, 'Prata', 21600, 25900, '20120326', '20120929', 'Juliano Tesla'),
('1', 'Rua sete', '234', 'carro', 'Mitsubishi', 'Pajero Dakar', 2010, 'Preto', 95000, 116000, '20120826', '20121007', 'Jose Manuel'),
('1', 'Rua sete', '234', 'carro', 'Mitsubishi', 'Outlander', 2009, 'Prata', 52000, 69900, '20120726', '20120729', 'Jose Manuel'),
('2', 'Rua 15 de Novembro', '915', 'carro', 'Chevrolet', 'Corsa sedan', 2001, 'Prata', 8700, 13500, '20120426', '20120529', 'Joaquim Santos'),
('2', 'Rua 15 de Novembro', '915', 'moto', 'Yamaha', 'Xt1200z', 2012, 'Branco', 55000, 59800, '20120626', '20120629', 'Joaquim Santos'),
('2', 'Rua 15 de Novembro', '915', 'moto', 'Suzuki', 'Burgman', 2013, 'Branca', 3000, 4800, '20120826', '20120829', 'Joaquim Santos'),
('1', 'Rua sete', '234', 'moto', 'Honda', 'CB300', 2010, 'Vermelha', 10000, 13800, '20120126', '20120329', 'Jose Manuel'),
('4', 'Av. Nogueira Padilha', '100', 'carro', 'Renault', 'Sandero', 2009, 'Vermelho', 24600, 28200, '20120626', '20120929', 'Josue Flox'),
('1', 'Rua sete', '234', 'carro', 'Ford', 'Ka', 2012, 'Vermelho', 17000, 19000, '20120926', '20120929', 'Jose Manuel'),
('4', 'Av. Nogueira Padilha', '100', 'carro', 'Fiat', 'Uno Mille', 2012, 'Preto', 15800, 19900, '20120626', '20120629', 'Josue Flox'),
('1', 'Rua sete', '234', 'carro', 'Fiat', 'Uno Mille', 2011, 'Branco', 12100, 14900, '20120226', '20120929', 'Jose Manuel'),
('1', 'Rua sete', '234', 'carro', 'Renault', 'Clio', 2011, 'Prata', 15400, 19900, '20120226', '20120329', 'Jose Manuel')
