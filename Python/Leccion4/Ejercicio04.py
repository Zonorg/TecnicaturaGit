# Ejercicio 4: sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de un rango
# Por ejemplo:
# Suma de números pares de 2 a 30
# Suma = 240
a = int(input('Digite donde va a comenzar la suma: '))
b = int(input('Digite hasta donde quiere llegar a sumar: '))
suma = 0
for i in range(a, b+1):
    if i % 2 == 0:
        suma += i
print(f'\nLa suma de números pares dentro del rango es: {suma}')
