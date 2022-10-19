# Ejercicio 01: crear una función para sumar los valores recibidos de tipo numéricos
# utilizando variables *args como parámetro de la función y agregar como resultado la suma
# de todos loa valores pasados como argumentos.

# Definimos una función
def sumar_valor(*args):  # Recibimos una cantidad de parámetros indefinidos
    resultado = 0
    # Iteramos cada elemento
    for valor in args:
        resultado += valor
    return resultado

# Llamamos a la función
print(sumar_valor(3, 5, 9, 2, 1))

