print('----- CALCULADORA ------')

number_one = float(input('Digite o 1º numero: '))
number_two = float(input('Digite o 2º numero: '))
signal = input('Digite o sinal de...\n"+" -> Para realizar uma soma\n"-" -> Para realizar uma subtração\n"*" -> Para realizar uma multiplicação\n"/" -> Para realizar uma divisão\nDigite o sinal...: ')

if(signal == '+'):
    opereitor = '"Soma"'
    result_opereitor = number_one + number_two

    print()
    print('----- RESULT -----')
    print(f'O a operação selecionada foi [{opereitor}] e o resultado da operação é {result_opereitor}') 

elif(signal == '-'):
    opereitor = '"Subtração"'
    result_opereitor = number_one - number_two

    print()
    print('----- RESULT -----')
    print(f'O a operação selecionada foi [{opereitor}] e o resultado da operação é {result_opereitor}') 

elif(signal == '/'): 
    if(number_one or number_two == 0):
        print()
        print('----- RESULT -----')
        print("Valor inválido! Digite outro valor diferente de '0'")
    else:
        opereitor = '"Divisão"'
        result_opereitor = number_one / number_two

        print()
        print('----- RESULT -----')
        print(f'O a operação selecionada foi [{opereitor}] e o resultado da operação é {result_opereitor}') 

elif(signal == '*'):
    opereitor = '"Multiplicação"'
    result_opereitor = number_one * number_two

    print()
    print('----- RESULT -----')
    print(f'O a operação selecionada foi [{opereitor}] e o resultado da operação é {result_opereitor}') 

else: 
    print('Operador invalido!\nTente novamente...')
