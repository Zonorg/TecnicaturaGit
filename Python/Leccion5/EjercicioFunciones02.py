# Ejercicio 2: crear una función con *args para multiplicar los valores recibidos de tipo
# numérico, utilizando argumentos variables *args como parámetro de la función
# y regresar como resultado la mult de todos los valores pasados como argumentos

# Definimos la función para multiplicar
def multiplicar_valores(*args):
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado

# Llamamos a la función
print(multiplicar_valores(3, 5, 15))  # Le pasamos los argumentos