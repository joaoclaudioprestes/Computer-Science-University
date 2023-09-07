print('----- Desconto de ISS -----')
print()
nome_funcionario = input('Nome do funcionario: ')
horas_trabalhadas = float(input('Digite a quantidade de horas trabalhadas: '))
valor_recebido_hr = float(input('Digite o valor recebido por hora: R$ '))
desconto_inss = float(input('Digite o percentual de deconto de INSS (Ex: 10): '))
salario_bruto_dia = valor_recebido_hr * horas_trabalhadas
salario_liquido_dia = salario_bruto_dia - (salario_bruto_dia * (desconto_inss/100))

print(f'O salário bruto do {nome_funcionario} é de R$ {salario_bruto_dia}. Já o salário liquído é de R$ {salario_liquido_dia}.')