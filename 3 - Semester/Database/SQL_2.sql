-- Seleciona todas as colunas da tabela "produtos"
SELECT
	* 
FROM
	produtos;
	
-- Seleciona as duas primeiras linhas da tabela "produtos" onde o valor de saída é menor que o valor de entrada
SELECT TOP
	2 * 
FROM
	produtos 
WHERE
	valor_saida < valor_ent;
	
-- Selecione os produtos onde o valor de entrada está entre 20.000 e 30.000
-- Correção: "adn" deve ser "AND"
SELECT
	* 
FROM
	produtos 
WHERE
	valor_ent BETWEEN 20000 
	AND 30000;
	
-- Seleciona valores únicos da coluna "fabricantes" em letras maiúsculas e ordena os resultados
-- Correção: "fabricantes" deve ser "fabricante" e a coluna fabricante precisa ser corretamente referenciada
-- Adicionado um alias "resposta" para a coluna resultante
SELECT DISTINCT
	( UPPER ( fabricante ) ) AS resposta 
FROM
	produtos 
ORDER BY
	resposta;
	
-- Seleciona valores únicos da coluna "vendedores" em letras maiúsculas e ordena os resultados
-- Correção: "vendedores" deve ser "vendedor" e a coluna vendedor precisa ser corretamente referenciada
-- Adicionado um alias "resposta" para a coluna resultante
SELECT DISTINCT
	( UPPER ( vendedor ) ) AS resposta 
FROM
	produtos 
ORDER BY
	resposta;
	
-- Calcula a média dos valores de entrada agrupados por tipo ou fabricante, ordenados por fabricante
-- Correção: "tipo ou fabricante" deve ser apenas "tipo" ou "fabricante"
-- A instrução GROUP BY deve referenciar as colunas corretamente
-- Corrigido o erro de ortografia na palavra "media"
SELECT
	tipo,
	AVG ( valor_ent ) AS media 
FROM
	produtos 
GROUP BY
	tipo 
ORDER BY
	fabricante;
	
-- Conta o número de produtos agrupados por tipo
-- Correção: "ou" é um operador lógico e não deve ser usado aqui
-- Corrigido o erro de sintaxe no WHERE clause, "tipo = 'moto' ou" foi removido
-- Adicionado um alias "total" para a coluna resultante COUNT(*)
SELECT COUNT
	( * ) AS total 
FROM
	produtos 
GROUP BY
	tipo;
	
-- Conta o número de produtos do tipo 'carro' que saíram entre 01/02/2012 e 29/03/2012
-- Correção: Corrigido o erro de ortografia na palavra "between" e adicionado o operador lógico "AND"
SELECT COUNT
	( * ) AS total 
FROM
	produtos 
WHERE
	tipo = 'carro' 
	AND data_saida BETWEEN '2012-02-01' 
	AND '2012-03-29';
	
-- Calcula o total dos valores de entrada para produtos do tipo 'carro'
SELECT SUM
	( valor_ent ) AS total 
FROM
	produtos 
WHERE
	tipo = 'carro';
-- Calcula o total do lucro (valor de saída - valor de entrada) para produtos onde a data de saída está entre 01/02/2012 e 29/03/2012, agrupado por tipo
SELECT
	tipo,
	SUM ( valor_saida - valor_ent ) AS total 
FROM
	produtos 
WHERE
	data_saida BETWEEN '2012-02-01' 
	AND '2012-03-29' 
GROUP BY
	tipo;
-- Atualiza o valor de entrada para 24.000 onde o modelo é 'ecosport'
-- Correção: Corrigido o erro de sintaxe no WHERE clause, "modelo = 'ecosport'" foi corrigido
UPDATE produtos 
SET valor_ent = 24000 
WHERE
	modelo = 'ecosport';
-- Calcula o total das entradas e saídas de produtos
SELECT SUM(valor_ent) AS entrada, SUM(valor_saida) AS saida FROM produtos;

-- Calcula o total do lucro (valor de saída - valor de entrada) para produtos vendidos por vendedores cujo nome começa com 'joa'
-- Correção: Corrigido o erro de sintaxe no WHERE clause, "vendedor LIKE 'joa%'" foi corrigido
SELECT SUM
	( valor_saida - valor_ent ) 
FROM
	produtos 
WHERE
	vendedor LIKE 'joa%';
-- Seleciona o vendedor e o total do lucro (valor de saída - valor de entrada) para produtos vendidos por vendedores cujo nome começa com 'joa'
-- Correção: Corrigido o erro de sintaxe no WHERE clause, "vendedor LIKE 'joa%'" foi corrigido
SELECT
	vendedor,
	SUM ( valor_saida - valor_ent ) AS total 
FROM
	produtos 
WHERE
	vendedor LIKE 'joa%' 
GROUP BY
	vendedor;

-- Seleciona o vendedor, o total do lucro (valor de saída - valor de entrada) e o salário (5% do total) para cada vendedor
-- Correção: Corrigido o erro de sintaxe na subconsulta, foi adicionado um alias "a" para a subconsulta
SELECT
	vendedor,
	total,
	( total * 0.05 ) AS salario 
FROM
	( SELECT vendedor, SUM ( valor_saida - valor_ent ) AS total FROM produtos GROUP BY vendedor ) AS a;
-- Seleciona o vendedor, o total do lucro (valor de saída - valor de entrada) e o salário (5% do total) para o vendedor com maior total de lucro
-- Correção: Corrigido o erro de sintaxe na subconsulta, foi adicionado um alias "a" para a subconsulta
SELECT TOP
	1 vendedor,
	total,
	( total * 0.05 ) AS salario 
FROM
	( SELECT vendedor, SUM ( valor_saida - valor_ent ) AS total FROM produtos GROUP BY vendedor ) AS a 
ORDER BY
	total DESC;
-- Calcula a diferença em dias entre as datas de entrada e saída de cada produto, ordenando os resultados por número de dias
SELECT
	datediff( DAY, data_ent, data_saida ) AS dias 
FROM
	produtos 
ORDER BY
	dias DESC;
-- Seleciona o modelo, loja, vendedor e a diferença em dias entre as datas de entrada e saída de cada produto, ordenando os resultados por número de dias
SELECT
	modelo,
	loja,
	vendedor,
	datediff( DAY, data_ent, data_saida ) AS dias 
FROM
	produtos 
ORDER BY
	dias DESC;