while True:
    escolhaMenu = input('Digite o numero da opção:\n1. Soma:\n2. Subtração:\n... ')

    if escolhaMenu == '1'  or 'soma':
        nun1 = float(input('Digite o valor do primeiro número: '))
        nun2 = float(input('Digite o valor para completar a expressão [{0} + ? = ?]: '.format(nun1)))
        result = nun1 + nun2
        print(' o resultado da soma de [{0} + {1} = {2}]'.format(nun1, nun2, result))

    elif escolhaMenu == '2'  or 'subtração':
        nun1 = float(input('Digite o valor do primeiro número: '))
        nun2 = float(input('Digite o valor para completar a expressão [{0}  ? = ?]: '.format(nun1)))
        result = nun1 - nun2
        print(' o resultado da soma de [{0} - {1} = {2}]'.format(nun1, nun2, result))

        
