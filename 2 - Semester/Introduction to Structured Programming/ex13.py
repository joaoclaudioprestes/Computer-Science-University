cont = int(input('Digite o valor a ser calculado o fatorial: '))
fat = 1 

while cont > 1:
    fat *= cont
    cont -= 1

    print(fat)