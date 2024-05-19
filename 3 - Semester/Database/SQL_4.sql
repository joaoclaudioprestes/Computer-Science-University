INSERT INTO veiculos
SELECT tipo, fabricante, modelo, ano_fab, cor, valor_ent, valor_saida, data_ent, data_saida, idLoja, idVendedor 
FROM 
(
	SELECT * FROM produtos
	JOIN vendedores 
	ON produtos.vendedor = vendedores.nome
) as selectVeiculoVendedor
JOIN
(SELECT numloja, idloja FROM lojas) as selectNumLojaIdLoja 
ON selectVeiculoVendedor.loja = selectNumLojaIdLoja.numloja