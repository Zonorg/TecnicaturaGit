# Ejercicio clase 10
# Calcular el factorial de un número mayor o igual a 0
n = int(input('Digite un número: '))
fact = 1
if n != 0:
    for i in range(1, n+1):
        print (f'\nFactorial = {fact} * {i}')
        fact = fact * i
        print (fact)

print(f'\nEl factorial de {n} es: {fact}')