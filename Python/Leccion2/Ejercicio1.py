
# Ejercicio 1: clase 6
# Debemos plasmar la expresión algebraica en código

a = float(input('Digite el valor de a: '))
b = float(input('Digite el valor de b: '))
c = float(input('Digite el valor de c: '))

result = (a ** 3 * (b ** 2 - 2 * a * c)) / (2 * b)
print(f'el resultado es {result}')

# Ejercicio 2

a = float(input('Digite el valor de a: '))
b = float(input('Digite el valor de b: '))

result = (3 + 5 * 8) < 3 and ((-6 / (3 * 4)) + 2 < 2) or (a > b)

print(f' El resultado es: {result}')

'''
# Ejercicio 3: clase 6

a = 10
print(f'a: {a}')
b = 5
print(f'b: {b}')
aux = 0

aux = a
a = b
b = aux

print(f'a: {a}')
print(f'b: {b}')

# Ejercicio 4

import math

r = float(input('Digite el valor de r: '))
area = math.pi * r**2
print((f'area: {area}'))

perimetro = 2 * math.pi * r
print((f'perimetro{perimetro}'))
'''