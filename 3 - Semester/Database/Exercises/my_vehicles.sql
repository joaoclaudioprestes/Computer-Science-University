-- Criação do banco de dados "my_vehicles"
CREATE DATABASE my_vehicles
GO

-- Utiliza o banco de dados "my_vehicles"
USE my_vehicles

-- Criação da tabela "Stores" para armazenar informações sobre lojas
CREATE TABLE Stores (
	id_store INT IDENTITY(1,1) PRIMARY KEY,
	name_store VARCHAR(50),
	address VARCHAR(50),
	number VARCHAR(20)
)

-- Criação da tabela "Saller" para armazenar informações sobre vendedores
CREATE TABLE Saller (
	id_saller INT IDENTITY(1,1) PRIMARY KEY,
	name_saller VARCHAR(50),
	fk_saller_location INT FOREIGN KEY REFERENCES Stores(id_store)
)

-- Adiciona uma coluna "sales_made" na tabela "Saller" para armazenar o número de vendas realizadas
ALTER TABLE Saller ADD sales_made INT

-- Criação da tabela "Manufactures" para armazenar informações sobre fabricantes
CREATE TABLE Manufactures (
	id_manufacture INT IDENTITY(1,1) PRIMARY KEY
)

-- Criação da tabela "Products" para armazenar informações sobre produtos
CREATE TABLE Products (
	id_product INT IDENTITY(1,1) PRIMARY KEY,
	type_product VARCHAR(20),
	fk_id_manufacture INT FOREIGN KEY REFERENCES Manufactures(id_manufacture),
	model_product VARCHAR(50),
	year_manufacture INT,
	color_product VARCHAR(20),
	input_value INT,
	output_value INT,
	input_date DATE,
	output_date DATE,
	fk_store_location INT FOREIGN KEY REFERENCES Stores(id_store),
	fk_saller INT FOREIGN KEY REFERENCES Sallers(id_saller)
)

-- Renomeia a tabela "Saller" para "Sallers"
EXEC sp_rename 'Saller', 'Sallers'
