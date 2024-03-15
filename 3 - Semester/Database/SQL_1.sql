-- Criar novo banco
CREATE DATABASE empresa
GO
USE empresa
GO

-- Criar tabela
CREATE TABLE pessoas (
	idPessoa INT PRIMARY KEY IDENTITY ( 1, 1 ),
	nome VARCHAR ( 50 ),
	rg VARCHAR ( 10 ),
	cpf VARCHAR ( 12 ) 
) 
GO

-- Selecionar de uma tabela de todos os registro da tabel pessoa
SELECT
	* 
FROM
	pessoas 
GO
		
-- Inserir registros na tabela pessoas
INSERT INTO pessoas
VALUES
	( 'Manuel', '2121212121', '120120120120' )
	
	
-- Inserir dados fora de ordem de acordo com a ordem passada
INSERT INTO pessoas ( cpf, rg, nome )
VALUES
	( '12121212', '45456545', 'Carla' )
	
-- Inserir somente um dado
INSERT INTO pessoas ( nome )
VALUES
	( 'Osvaldo' )
	
-- Varios em um único comando
INSERT INTO pessoas ( cpf, rg, nome )
VALUES
	( '12121212', '45456545', 'Carla' ),
	( '46564286', '4545546545', 'Felipe' ),
	( '65465664', '469713132', 'João' )
	
-- Selecionar coisas especificas
SELECT
	* 
FROM
	pessoas
	
-- Selecionar um dados especifico
SELECT
	nome 
FROM
	pessoas

-- Visualizar os seguintes dados da tabela pessoas
SELECT
	rg,
	cpf 
FROM
	pessoas

-- Ordenar em ordem alfabetica
SELECT
	* 
FROM
	pessoas 
ORDER BY
	nome
	
-- Selecionar e ordernar
SELECT
	* 
FROM
	pessoas 
ORDER BY
	nome DESC -- Decrecente... O padrão seria asc (crecente)
	
-- Ordenar por nome é depois rg
SELECT
	* 
FROM
	pessoas 
ORDER BY
	nome,
	rg
	
-- Selecionar Quando ("xxxx") e ordenar por
SELECT
	* 
FROM
	pessoas 
WHERE
	nome = 'João' 
ORDER BY
	rg
	
-- Mostrará somente o primeiro registro. Ao alterar o valor do top modificamos a quantidade de retornos	
SELECT TOP
	2 * 
FROM
	pessoas 
WHERE
	nome = 'Carla' 
ORDER BY
	rg
	
-- Pesquisar por trechos
SELECT
	* 
FROM
	pessoas 
WHERE
	nome LIKE '__n%' -- % é um coringa (começa ou termina 'C%' '%l') -- _ por caractere
	
SELECT
	* 
FROM
	pessoas 
WHERE
	nome LIKE 'Car%' 
	AND rg LIKE '45%'
	
SELECT
	id,
	rg 
FROM
	pessoas
	
-- Listar todos os dados em maiusculo
SELECT UPPER
	( nome ) 
FROM
	pessoas
	
-- Somente lista os nomes sem repetição, listando somente o primeiro
SELECT DISTINCT
	( nome ) 
FROM
	pessoas 
ORDER BY
	nome DESC
	
	
SELECT DISTINCT
	( UPPER ( nome ) ),
	rg,
	cpf 
FROM
	pessoas 

-- Deletar
DELETE 
FROM
	pessoas 
WHERE
	idPessoa = '4'
	
-- DROP apagar tudo...
DROP TABLE pessoas
