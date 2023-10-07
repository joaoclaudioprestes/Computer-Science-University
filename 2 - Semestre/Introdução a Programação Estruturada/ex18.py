maior = 0
notas = []

while True:
    num = int(input('Digite um número ou 0 para encontrar o maior: '))
    notas.append(num)
    if num > maior:
        maior = num
        continue
    if num == 0:
        print('x--- RESULT ---x')
        print('Você digitou zero!\nPortanto o maior número é {}'.format(maior))
        print('Os valores digitados em ordem são: {}'.format(notas))
        break
