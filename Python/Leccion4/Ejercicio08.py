# Ejercicio 8: menú interactivo - Cajero automático
# Hacer un programa que simule un cajero automático con un saldo inicial de $1000 y tendrá el siguiente menú de opciones
# 1. Ingresar dinero en la cuenta
# 2. Retirar dinero de la cuenta
# 3. Mostrar dinero disponible
# 4. Salir

saldo = 1000
while True:
    print('\t.:MENU:.')
    print('1. Ingresar dinero en la cuenta')
    print('2. Retirar dinero de la cuenta')
    print('3. Mostrar dinero disponible')
    print('4. Salir')
    opcion = int(input('Digite una opción del menú: '))
    print()
    if opcion == 1:
        extra = float(input('¿Cuánto dinero desea ingresar?\n$ '))
        saldo += extra
        print(f'Dinero en la cuenta al momento: $ {saldo}\n')
    elif opcion == 2:
        retirar = float(input('¿Cuánto dinero desea retirar?\n$ '))
        if retirar > saldo:
            print('No tiene esa cantidad de dinero')
        else:
            saldo -= retirar
            print(f'Dinero en la cuenta al momento: $ {saldo}\n')
    elif opcion == 3:
        print(f'Dinero en la cuenta al momento: $ {saldo}\n')
    elif opcion == 4:
        print('Gracias por utilizar su cajero automático, hasta pronto')
        break
    else:
        print('Error, se equivoco de opción de menú')
        print()
