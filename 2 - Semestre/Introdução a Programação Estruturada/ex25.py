import random

lista = []

while True:
    num = random.randint(1,10)
    if not(num in lista):
        lista.append(num)

    if (len(lista) == 10):
        break


print(lista)
lista.sort()

print(lista)
