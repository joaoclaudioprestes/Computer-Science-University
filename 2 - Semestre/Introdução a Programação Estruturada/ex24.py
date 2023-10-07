lista = []

while True:
    for num in range(2000,5000):
        lista.append(num)

    desejado = int(input('Digite um número entre 2000 e 5000: '))

    if lista.count(desejado) == True:
        print(lista.index(desejado))
        break
    else:
        print(f'O número {desejado} é invalido')
