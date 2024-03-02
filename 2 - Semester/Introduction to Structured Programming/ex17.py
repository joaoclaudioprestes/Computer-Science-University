print('x--- Média - Muintas notas ---x')

cont = 1
sum_grades = 0
divider = 0

while True:
    cont_grades = int(input('Digite a nota nº {}: '.format(cont)))
    sum_grades += cont_grades
    divider += 1
    cont += 1

    go_grades = input('Deseja continuar [S | N]: ')

    if go_grades == 's' or go_grades == 'S':
        continue

    if go_grades == 'n' or  go_grades == 'N':
        medium = sum_grades/divider
        print('A média do valor de {} é {}.'.format(sum_grades, medium))
        break
