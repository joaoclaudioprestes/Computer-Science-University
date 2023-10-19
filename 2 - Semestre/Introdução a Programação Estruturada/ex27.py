def quadrado_soma(n1, n2, n3):
    quadrado = n1**2
    result = quadrado + (n2 + n3)

    return print(f'Os valores passados foram:\n1º [{n1}]\n2º [{n2}]\n3º [{n3}]\nÉ o resultado do quadrado de n1² é igual a {quadrado} é o resultado da soma do quadrado mais n1 e n2 é {result}')


def numbers():
    n1 = float(input('Digite o primeiro número: '))
    n2 = float(input('Digite o segundo número: '))
    n3 = float(input('Digite o terceiro número: '))

    quadrado_soma(n1, n2, n3)

numbers()


