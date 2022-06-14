# Sentencia if/else
condicion = True
if condicion == True:
    print('Condición Verdadera')
elif condicion == False:
    print('Condición Falsa')
else:
    print('Condición sin especificar')

# Conversión de número a texto
num = int(input('Digite un número en el rango del 1 al 3: '))
numText = ''
if num == 1:
    numText = 'Número uno'
elif num == 2:
    numText = 'Número dos'
else:
    numText = 'Has ingresado un número fuera del rango'

print(f'El número ingresado es: {num} - {numText}')

# Sintaxis simplificada

condicion = True
print('Condición verdadera') if condicion else print('Condición falsa')
