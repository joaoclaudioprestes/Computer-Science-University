print('----- AVALIADOR - VACINAÇÃO -----')
idade = float(input('Digite a idade da criança: '))

if(idade <= 5):
    result_vacina = 'deve ser vacinada!'
elif(idade > 5):
    result_vacina = 'não deve ser vacinada!'

print()
print(f'Considerando a que a criança tem {idade} anos. Portanto ela {result_vacina}')