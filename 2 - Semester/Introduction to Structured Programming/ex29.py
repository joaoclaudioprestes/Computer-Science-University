def maior_valor(n1, n2):
    maior = None

    if (n1 > n2):
        maior = n1
    elif(n2 < n1):
        maior = n2

    return print(f'O maior valor passado foi {maior}')


def number():
    n1 = float(input(f'Digite o 1º número: '))
    n2 = float(input(f'Digite o 2º número: '))

    maior_valor(n1,n2)

number()