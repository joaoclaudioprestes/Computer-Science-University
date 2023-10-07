print("----- PEOPLE'S DATA -----")

name_people = input('Olá usuário! Como você se chama?\n>>> ')
age_people = float(input(f'{name_people} digite sua idade: '))

if(age_people >= 21):
    result = 'MAIOR IDADE'
else:
    result = 'MENOR IDADE'

print(f'Olá, {name_people} você tem {age_people} anoe, portanto é {result}.')