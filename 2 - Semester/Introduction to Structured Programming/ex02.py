import os
print('----- Consumo médio de um Automóvel -----')
print()
automovel = input('Digite o modelo do carro: ')
litros_km = float(input('Digite a quantidade consumidada de litros por km: '))
km_rodados = float(input('Quantos km foram percorridos: '))

result_kml = km_rodados / litros_km
print()

print(f'O total consumido pelo veículo {automovel} ao percorrer a distância de {km_rodados} km foi de {result_kml} l/km...')
