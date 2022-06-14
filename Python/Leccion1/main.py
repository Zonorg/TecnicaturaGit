"""
miVariable = 3
print(miVariable)
miVariable = "Hola a todos los estudiantes de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(id(x))
print(id(y))
print(id(z))

#Tipos int, float, String, Bool
x = 10
print(x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "The Letter Black:"
caracteristicas= "The Best Rock Band"
print("Mi grupo favorito es: "+miGrupoFavorito+" "+caracteristicas)

numero1 = "7"
numero2 = "8"
print(int(numero1)+int(numero2))

#Tipos Booleanos (bool)
miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# función imput
resultado = input("Digite un numero: ") # regresa un dato tipo string
print(resultado)

# Conversión de la entrada de datos
numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)

# Operadores aritméticos
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("Resultado de la suma: ", suma)
print(f'El resultado de la suma es: {suma}')

resta = operandoB - operandoA
print(f"El resultado de la resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacón es: {multiplicacion}")

division = operandoA / operandoB
print(f"El resultado de la división es: {division}")
division = operandoA // operandoB
print(f"El resultado de la división (int) es: {division}") # Indica el resultado del entero
division = operandoA % operandoB
print(f"El resultado de la división del residuo (modulo) es: {division}")
exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}")

# Ejercicio rectángulo
alto = int(input('Proporciona el alto del rectángulo: '))
ancho = int(input('Proporciona el ancho del rectángulo: '))
area = alto * ancho
perimetro = (alto + ancho) * 2
print('Área: ', area)
print('Perímetro: ', perimetro)

miVariable3 = 10
print(miVariable3)

# Operadores de reasignación
miVariable3 = miVariable3 + 1
print(miVariable3)

miVariable3 += 1
print(miVariable3)

# miVariable3 = miVariable3 - 2
miVariable3 -= 2
print(miVariable3)

# miVariable3 = miVariable3 * 3
miVariable3 *= 3
print(miVariable3)

# miVariable3 = miVariable3 / 2
miVariable3 /= 2
print(miVariable3)

#Operadores de comparación
d = 4
b = 2

# Operador de igualdad
resultado = d == b
print(resultado)

# Operador de desigualdad
resultado = d != b
print(resultado)

#Operador Mayor que
resultado = d > b
print(resultado)

#Operador Menor que
resultado = d < b
print(resultado)

# Ejercicio 1: número par o impar
# 1. Solicitamos que el usiario ingrese un número
# 2. Este se asigna a una variable
# 3. Utilizamos la estructura 'if else'
# 4. La formula: <num>%2==0 Nos dice si un número es par
# 5. Si es True imprimimos que es par, si es False imprimimos que es impar

a = int(input("Digite un número: "))
print(f"El residuo de la división es: {a % 2}")
if a % 2 == 0:
    print(f"El valor de a es: {a}, es un número PAR")
else:
    print(f"El valor de a es: {a}, es un número IMPAR")

# Ejercicio 2: Determinar si es mayor de edad
# 1. Pedir un número al usuario
# 2. Almacenar el valor de una variable
# 3. Usar la estructura 'if else'
# 4. La formula es: <num> >= 18
# 5. Imprimir: si es true; mayor de edad, si es false; menor

edadAdulto = 18
edadPersona = int(input("Digite su edad: "))

if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona}, es mayor de edad")
else:
    print(f"Su edad es:{edadPersona}, es menor de edad")

# Operadores lógicos

# Operador and
a = False
b = True
resultado = a and b
print(resultado)

# Operador or
resultado = a or b
print(resultado)

# Operador not
resultado = not b # El operador not no es binario, solo compara un valor
print(resultado)

# Ejercicio valor dentro de un rango
# 1. Pedimos al usuario un valor numérico
# 2. Verificar si el valor ingresado se encuentra dentro del rango de 0 a 5
# 3. La fórmula es <num> >= 0 and <num> <= 5

valor = int(input('Digite un número: '))
valorMin = 0
valorMax = 5
dentroRango = valor >= valorMin and valor <= valorMax
if dentroRango:
    print(f'El valor {valor}, está dentro del rango')
else:
    print(f'El valor {valor}, está fuera del rango')

# Ejercicio con operador or
# La pregunta es si un padre puede asistir al juego de su hijo.
# 1. Verificamos si tiene vacaciones
# 2. Verificamos si tiene el día libre
# 3. Usar estructura 'if else' con el operador or
# 4. Imprimir

vacaciones = False
diaDescanso = True
if (vacaciones or diaDescanso):
    print('Puede asistir al juego')
else:
    print('Tiene trabajo que hacer')

# Ejercicio: rango décadas 20/30 años

edad = int(input('Digite su edad: '))
if (20 <= edad < 30) or (30 <= edad < 40):
    print('Estás dentro de la década entre 20 y 30 años')
else:
    print('No estás dentro de la década entre 20 y 30 años')

# Ejercicio: el mayor de dos números
# Solicitar al usuario dos valores, determinar cuál es el mayor

numero1 = int(input('Digite el valor para el numero 1: '))
numero2 = int(input('Digite el valor para el numero 2: '))

if numero1 > numero2:
    print('El número 1 es mayor')
elif numero1 < numero2:
    print('El número 2 es mayor')
else:
    print('Ambos números son iguales')
"""
# Ejercicio: tienda de libros
print('Digite los siguientes datos del libro')
nombre = input('Digite el nombre del libro: ')
id = int(input('Digite el ID del libro: '))
precio = float(input('Digite el precio del libro: '))
envioGratuito = input('Indicar si el libro es gratuito (True/False): ')
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = 'El valor es incorrecto, debe escribir True/False'
print(f'''
        Nombre: {nombre}
        Id: {id}
        Precio: {precio}
        ¿Envío gratuito?: {envioGratuito}
''')
# Fin Leccion1
