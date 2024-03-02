def imc(peso, altura, sexo):
    IMC = peso/(altura**2)
    
    if(sexo.upper() == 'F'):
        if(IMC < 19.1):
            result_imc = 'abaixo do peso ideal'
        elif(IMC > 19.1 or IMC < 25.8):
            result_imc = 'no peso ideal'
        elif(IMC > 25.8 or IMC < 27.3):
            result_imc = 'marginalmente acima do peso'
        elif(IMC > 27.3 or IMC < 32.3):
            result_imc = 'acima do peso ideal'
        elif(IMC > 32.3):
            result_imc = 'obeso'

    elif(sexo.upper() == 'M'):
        if(IMC < 20.7):
            result_imc = 'abaixo do peso ideal'
        elif(IMC > 20.7 or IMC < 26.4):
            result_imc = 'no peso ideal'
        elif(IMC > 26.4 or IMC < 27.8):
            result_imc = 'marginalmente acima do peso'
        elif(IMC > 27.8 or IMC < 31.1):
            result_imc = 'acima do peso ideal'
        elif(IMC > 31.1):
            result_imc = 'obeso'

    return result_imc
    
print('----- CALCULADORA - IMC -----')
print()
nome = input('Olá, usuário!\nDigite o seu nome: ')
print(f'Bem-vindo(a) {nome}! Precisarei de alguns dados para calcular o seu IMC...')
print('----- DADOS -----')
sexo = input('Digite o seu sexo [F | M]: ')
peso = float(input('Digite o seu peso em Kg: '))
altura = float(input('Digite a sua altura em cm: '))
print()
print('Resultados...')
print(f'Olá, {nome}! Sua condição atual é a seguinte...\nPeso = {peso}\nAltura = {altura}\n\nUtilizado da formula IMC = peso/(altura**2) sua situação é {imc(peso, altura, sexo)}.')