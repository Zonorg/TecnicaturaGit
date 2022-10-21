# Ejercicio 3: función recursiva
# Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
# Por ejemplo, si pasamos el valor de 5 debe imprimir:
# 5
# 4
# 3
# 2
# 1
# Si se ingresan números negativos no debe imprimir nada
def imprimir_num_recursivos(numero):
    if numero >= 1:  # Caso base
        print(numero)
        imprimir_num_recursivos(numero-1)  # Caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print('Valor ingresado incorrecto')

imprimir_num_recursivos(10)