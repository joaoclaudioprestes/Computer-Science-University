contador = 1
result = 0

while contador <= 11:
    nota = int(input('Digite da nota nº {0}: '.format(contador)))
    result += nota
    contador += 1

    if contador == 11:
        media = result/10
        print('O valor total de suas notas é {0} e o valor de sua média é {1}'.format(result, media))
        break

