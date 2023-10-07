print("----- PEOPLE'S DATA -----")

name_people = input('Olá usuário! Como você se chama?\n>>> ')
print()
print(f'{name_people} precisarei de alguns dados. Responda as perguntas a seguir...')
age_people = float(input('Digite sua idade: '))
sex_people = input('Digite seu sexo [F | M]: ')

if(sex_people.upper() == 'F' and age_people < 25):
    result = 'ACEITA'
else:
    result = 'NÃO ACEITA'


print(f'Olá, {name_people} você {result}.')