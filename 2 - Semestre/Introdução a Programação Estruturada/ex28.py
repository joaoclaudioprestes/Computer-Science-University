def e_primo(number):
    if number <= 1:
        return print('n = não é primo!')
    
    for i in range(2, number):
        if number%i == 0:
            return print('n = não é primo!')
        
        return print('s = é primo!')
    
def number():
    number = int(input('Digite um número para saber se é primo: '))

    e_primo(number)

number()
