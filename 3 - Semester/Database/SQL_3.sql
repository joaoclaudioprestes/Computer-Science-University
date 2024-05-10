CREATE TABLE Lojas (
	idLoja INT IDENTITY ( 1, 1 ) PRIMARY KEY,
	numLoja VARCHAR ( 2 ),
	endereco VARCHAR ( 30 ),
	numero VARCHAR ( 5 ) 
) 

GO

CREATE TABLE Vendedores ( idVendedor INT IDENTITY ( 1, 1 ) PRIMARY KEY, nome VARCHAR ( 50 ), fk_idLoja INT ) 

GO

CREATE TABLE Veiculos (
	idVeiculo INT IDENTITY ( 1, 1 ) PRIMARY KEY,
	tipo VARCHAR ( 20 ),
	fabricante VARCHAR ( 30 ),
	modelo VARCHAR ( 30 ),
	ano_fab INT,
	cor VARCHAR ( 20 ),
	valor_ent FLOAT,
	valor_saida FLOAT,
	data_ent DATE,
	date_saida DATE,
	fk_idLoja INT,
	fk_idVendedor INT 
) 

GO

ALTER TABLE Vendedores ADD CONSTRAINT idLoja_fk_idVendedores FOREIGN KEY ( fk_idLoja ) REFERENCES Lojas ( idLoja ) 

GO

ALTER TABLE Veiculos ADD CONSTRAINT idLoja_fk_idVeiculos FOREIGN KEY ( fk_idLoja ) REFERENCES Lojas ( idLoja ) 

GO

ALTER TABLE Veiculos ADD CONSTRAINT idVendedor_fk_idVeiculos FOREIGN KEY ( fk_idVendedor ) REFERENCES Vendedores ( idVendedor )

INSERT INTO Lojas
	SELECT DISTINCT(loja), endereco, numero FROM produtos
	
SELECT * FROM produtos

INSERT INTO Vendedores SELECT DISTINCT
( vendedor ),
idLoja 
FROM
	produtos SELECT
	* 
FROM
	produtos
	JOIN Lojas ON produtos.loja = Lojas.numLoja
	