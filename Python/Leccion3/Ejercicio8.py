# Ejercicio: calcular cantidad de números positivos, negativos y neutros

n = int(input('Ingrese la cantidad de números a sumarse: '))

if n > 0:
    pos = 0
    neu = 0
    neg = 0

    for i in range(n):
        num = int(input('Ingrese un número: ')) #Dependiendo del valor ingresado de num se hará:
        if num > 0: #Condición: si el número ingresado es mayor a 0 entonces se suma +1 al conteo de positivos
            pos += 1

        elif num < 0: #Condición: si el número ingresado es menor a 0 entonces se suma +1 al conteo de negativos
            neg += 1

        else: # Si num es valor 0 entonces se suma +1 al conteo de neutros
            neu += 1

    print(f'La cantidad de números positivos fue: {pos}')
    print(f'La cantidad de números negativos fue: {neg}')
    print(f'La cantidad de números neutros fue: {neu}')
