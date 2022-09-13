# Ingresar "N" enteros, visualizar la suma de los números pares de la lista
# Calcular cuántos números pares existen y cuál es el promedio de los números impares

cantidad = int(input('Digite la cantidad de elementos a ingresar: '))
suma = 0
par = 0
conteoPar = 0
impar = 0
conteoImpar = 0
promImpar = 0

for i in range(cantidad):

    num = int(input('Digite un número: '))
    suma = suma + num
    if num > 0:
        if num % 2 == 0:
            par = par + num
            conteoPar += 1
        else:
            impar = impar + num
            conteoImpar += 1
            promImpar = impar / cantidad

print(f'\nLa suma de todos los números es: {suma}')
print(f'\nLa suma de los números pares es: {par}')
print(f'El conteo de los pares es: {conteoPar}')
print(f'\nLa suma de los números impares es: {impar}')
print(f'El promedio de los impares es: {promImpar}')
print(f'El conteo de los impares es: {conteoImpar}')

if conteoPar == 0:
    print('\nNo se han digitado números pares')
if conteoImpar == 0:
    print('\nNo se han digitado números impares')
