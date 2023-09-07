def gasto_total(gasto_clientes):
    result_total_cliente = gasto_clientes + gorgeta(gasto_cliente)

    return result_total_cliente

def gorgeta(gasto_cliente):
    result_gosrgeta = gasto_cliente * 0.10

    return result_gosrgeta


print('----- RESTAURANTE COMABEM -----')
print()
gasto_cliente = float(input('Digite o valor gasto pelo cliente: R$ '))
print()
print('----- GORGETA -----')
print(f'A gosrgeta do garçon é de R${gorgeta(gasto_cliente)}')
print(f'Considerando o valor da gosrgeta o tatal a ser pago pelo cliente é de R$ {gasto_total(gasto_cliente)}')
