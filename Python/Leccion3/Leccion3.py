'''
# Ciclo while (Mientras o durante)
contador = 0
while contador < 3:
    print('Ejecutamos nuestro ciclo while', contador)
    contador += 1
else:
    print('Fin del ciclo while')

# Imprimir números del 0 al 5 con ciclo while
max = 5
cont = 0
while cont <= max:
    print(cont)
    cont += 1

min = 1
cont = 5
while cont >= min:
    print(cont)
    cont -= 1

# Ciclo for
chain = 'Hello'
for letter in chain:
    print(letter)
else:
    print('Fin del ciclo for')

# Break
for letter in 'Alemania':
    if letter == 'a':
        print(f'Letra encontrada: {letter}')
else:
        print('Fin del ciclo for')

# Continue
for i in range(6):
    if i % 2 == 0:
        print(f'Valor: {i}')

for i in range(6):
    if i % 2 != 0:
        continue #En este caso anula todos los números impares
    print(f'Valor: {i}')
'''

num = 0
i = 1
factorial = 1
while num <= 0:
    num = int(input('Ingrese un número válido: '))
    while i <= num:
        factorial *= num
        num -= 1
else:
    print(f'El factorial es: {factorial}')
