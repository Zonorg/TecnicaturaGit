# Ejercicio: calcular la suma de N primeros numeros

N = int(input('Digite la cantidad de números a sumarse: '))
suma = 0

for i in range(N):
    suma = suma + (i+1)
    print(suma)

print(f'La suma es: {suma}')
