def gratificacao(salario_bruto):
    result_gratificacao = salario_bruto * 0.5

    return result_gratificacao

def imposto(salario_bruto):
    result_inposto = salario_bruto - (salario_bruto * 0.7)

    return result_inposto

def salario_liquido(salario_bruto, result_gratificacao, result_inposto):
    result_liquido = (salario_bruto - result_inposto) + result_gratificacao

    return result_liquido

print('----- Calculadora de Salário -----')
nome_funcionario = input('Digite o nome do funcionario: ')
salario_bruto = float(input('Digite o saláriodo funcionario: R$ '))

print('----- Resultado Sálario Líquido -----')
print(f'Salario Bruto: R$ {salario_bruto}\n-Desconto Imposto: R$ {imposto(salario_bruto)}\n+ Gratificaçã: R$ {gratificacao(salario_bruto)}\nsalário Líquido: R$ {salario_liquido(salario_bruto, gratificacao(salario_bruto), imposto(salario_bruto))}')

