print("----- PEOPLE'S DATA -----")

name_people = input('Olá usuário! Como você se chama?\n>>> ')
age_people = float(input(f'{name_people} digite sua idade: '))

if(age_people >= 11 or age_people <= 18):
    result = 'adolecente'
elif(age_people < 11):
    result = 'criança'
elif(age_people > 18):
    result = 'adulto'

print(f'Olá, {name_people} você é um {result}.')