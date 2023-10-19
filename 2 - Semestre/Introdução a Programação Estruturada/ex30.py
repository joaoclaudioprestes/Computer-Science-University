def maior_dois(n1, n2,n3):
    if n1 > n2:
        maior = n1
    elif n1 < n2:
        maior = n2

    maior_tres(maior, n3)
    
def maior_tres(maior,n3):
    if maior > n3:
        maior = maior
    elif maior < n3:
        maior = n3

    return print(f'O maior valor digitado é {maior}')


def number():
    n1 = float(input(f'Digite o 1º número: '))
    n2 = float(input(f'Digite o 2º número: '))
    n3 = float(input(f'Digite o 3º número: '))

    maior_dois(n1,n2,n3)

number()