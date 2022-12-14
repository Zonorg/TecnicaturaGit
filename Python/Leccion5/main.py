# Comenzamos con funciones
# Definimos una función
def mi_funcion():  # Para identificar a la función utilizamos paréntesis
    print('Saludos a todos los alumnos de la Tecnicatura')

mi_funcion()  # Estamos llamando a la función
mi_funcion()  # Se puede llamar a la función N cantidad de veces

# Desempaquetado de listas o list unpacking
def show(name, lastName):
    print(name+' '+lastName)
person = ["Renzo", "Viscio"]
show(person[0], person[1])  # Pasamos uno por uno los datos de la lista a la función
show(*person)  # Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ("Osvaldo", "Giordanini")  # Desempaquetamos a través de una tupla
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"}
show(**person3)

numbers = [1, 2, 3, 4, 5]  # Aún con la lista vacía se va a ejecutar el else
for n in numbers:
    print(n)
    if n == 3:
        break  # Esta es la única manera para que no se ejecute el else
else:
    print('Esto se termino')

#  List comprehension
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == 'P']  # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"name": "Corona", "country": "Mx"},
           {"name": "Sella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de argumentos(funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos los que ven desde el canal de YouTube")
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Jorge', 'Lucero')
mi_funcion2('Ariel', 'Betancud')
mi_funcion2('Analia', 'Pedrosa')

# La palabra return en funciones
# Creamos una función para sumar
def sumar(a, b):
    return a + b
# resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a = 0, b = 0):  # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

# Argumentos, variables en funciones
def listarNombres(*nombres):  # Normalmente se utiliza: *args
    for nombre in nombres:  # Se va a convertir en una tupla
        print(nombre)
listarNombres('Lucas', 'José', 'Claudia', 'Rosa', 'María')
listarNombres('Marcos', 'Daniel', 'Romina', 'Pepe', 'Marcela', 'Carlos')

def listarTerminos(**terminos):  # El término más utilizado para recibir los argumentos es **kwargs
    for llave, valor in terminos.items():
        print(f'{llave} : {valor}')

listarTerminos()  # No recibe nada, nada se va a mostrar
listarTerminos(IDE='Integrated Development Enviroment', PK='Primary Key')
listarTerminos(Nombre='Lionel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10, 11) # No es un objeto iterable
desplegarNombres((10, 11))  # La convertimos en una tupla, en un solo elemento
desplegarNombres([22, 55])  # La convertimos en una lista

# Funciones recursivas
def factorial(numero):
    if numero == 1:  # Caso base
        return 1
    else:
        return numero * factorial(numero-1)  # Caso recursivo
numeroFactorial = int(input('Digite el número para calcular el factorial: '))
resultado = factorial(10)  # Lo hacemos en código duro
print(f'El factorial del número {numeroFactorial} es: {resultado}')
