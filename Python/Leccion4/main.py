# Listas(conocidas también como arreglos o vectores)
# Colecciones en Python
'''
nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[2])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])
print(nombres[0:2])  # Muestra los datos desde el 0 hasta 1, sin incluir el 2
print(nombres[:3])  # Muestra los datos desde el inicio (0) hasta el 2, sin incluir el 3
print(nombres[1:])  # Muestra los datos desde el indice 1 hasta el fin de la lista

# Modificación de los valores
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

# Iterar una lista
for nombre in nombres:
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuántos elementos tiene
print(len(nombres))  # La función len nos indica la cantidad de elementos que tiene una lista

# Agregamos un elemento
nombres.append('Marcelo')  # Ingresa un elemento nuevo al final de la lista
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# Insertamos un elemento en un lugar especifico de la lista
nombres.insert(1, 'Alberto')  # Inserta un elemento en la posición 1 de la lista
print(nombres)
nombres.insert(3, 'Debora')  # Inserta elemento en la posición 3
print(nombres)

# Eliminar un elemento
nombres.remove('Alberto')
print(nombres)

# Eliminar el último elemento
nombres.pop() # En este caso elimina el último porque esta vacía la casilla
print(nombres)

# Eliminar un elemento en una posición específica
del nombres[2]
print(nombres)

# Eliminar toda la lista
nombres.clear() # Nos mostrará la casilla vacía
print(nombres)

# Eliminar lista de la consola
del nombres # Mostrará un error ya que al borrarla la lista no existe en el código
print(nombres)

# Definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento de la tupla, para esto utilizamos corchetes
print(cocina[0])
# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo
verduras = ('papa',) # una tupla necesita aunque sea de un elemento: la coma
# de lo contrario solo seria de tipo str cadena

# Recorremos los elementos de la tupla
for cocinar in cocina: # print está usando \n para saltos de líneas
    print(cocinar, end=' ') # Usamos end= para eliminar los saltos de línea

cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
plato = tuple(cocinaLista)
print('\n', cocina)

# Tipo set
planetas = {'Marte', 'Jupiter', 'Venus'}
print(len(planetas)) # Usamos la función len = length significa largo

# Revisar si un elemento existe dentro de set
print('Jupiter' in planetas)

# Agregar un elemento
planetas.add('Tierra') # add es una función
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Jupiter') # Esta función da error ante un mal ingreso
print(planetas)
planetas.discard('tierra') # Esta función no nos presenta ningún error
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
print(planetas) # al eliminar nos muestra fun error
'''
# 'Maradona':10 Un diccionario está compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    'IDE': 'Integrated Development Enviroment',
    'POO': 'Programación Orientada a Objetos',
    'SABD': 'Sistema de Administración de Base de Datos'
}
print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario:  # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys():  # Estamos usando una función
    print(termino)  # Muestra solo las llaves

for valor in diccionario.values():  # Usamos una función para acceder al valor
    print(valor)

# Comprobar la existencia de algún elemento
print('IDE' in diccionario)  # devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario  # El diccionario se borró

# Concatenamos listas
lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista3 = lista1 + lista2
print(lista3)

lista3.extend([7, 8, 9])  # Función para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5))  # Función para ubicar en que indice está el valor ingresado
# print(lista3.index(0)) # Esto daría un error por no ser el elemento parte de la lista

# Cómo saber cuántos valores repetidos hay dentro de una lista
print(lista3.count(1))  # Cuenta cuantos valores iguales hay dentro de una lista

# Para poner al revés una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Métodos de ordenamiento, en python es una función
lista3.sort()  # Ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True)  # Ordena los elementos descendentemente
print(lista3)

# Repaso de Tuplas
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola')  # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla)  # Acción booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista y de lista a tupla

# Repaso de set o conjunto
# Para definir un conjunto
conjunto2 = set()
conjunto1 = {'bye', }
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1)  # Preguntamos si el número 3 NO está en el conjunto1

# Cómo hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2)  # Nos devuelve como respuesta un booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2  # La línea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2  # Que elemento tienen en común
print(conjunto3)

conjunto3 = conjunto1 - conjunto2  # Asigna el valor que está en el conjunto1 y no en el conjunto2
print(conjunto3)
conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2  # Elementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3))  # Aquí preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1))  # Aquí preguntamos si los elementos del elemento 1 están dentro del 3
print(conjunto3.issuperset(conjunto2))
print(conjunto2.issuperset(conjunto3))

# Cómo saber si ambos conjuntos son disco nexos, esto es si no comparten elementos en común
print(conjunto1.isdisjoint(conjunto2))  # No hay cosas en común

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset
# No se puede agregar, modificar ni eliminar elementos del conjunto

# Repaso diccionarios
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ariel': {'Edad': 40, 'Altura': 1.83}, 'Osvaldo': [45, 1.85], 'Natalia': [35, 1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posición': 'Extremo derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones',
         'Posición': 'Extremo derecho'},
    21: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posición': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones',
         'Posición': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5', 'Posición': 'Portero'},
    27: {'Nombre': 'Julian Alvarez', 'Edad': 22, 'Altura': 1.73, 'Precio': '51 Millones', 'Posición': 'Delantero'},
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 30, 'Altura': 1.95, 'Precio': '28 Millones', 'Posición': 'Portero'},
    9: {'Nombre': 'Sergio Agüero', 'Edad': 34, 'Altura': 1.73, 'Precio': '35 Millones', 'Posición': 'Delantero'},
    7: {'Nombre': 'Rodrigo De Paul', 'Edad': 28, 'Altura': 1.80, 'Precio': '40 Millones', 'Posición': 'Centrocampista'}
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Como tarea agregar por lo menos 4 jugadores más al diccionario: seleccionArgentina
print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1, 2, 3]

# Agregamos elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop()  # Quita el último elemento y lo guarda en la variable
print(f'Sacamos el elemento: {elementoBorrado}')
print(f'La pila ahora quedó así: {pila}')

# Colas con listas
# Estructura de datos de tipo fifo(first input / first output)
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

# Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('José')
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

# Seguimos mostrando como recorrer un diccionario con el ciclo for
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')