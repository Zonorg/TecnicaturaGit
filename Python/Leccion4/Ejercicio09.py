# Ejercicio 9: mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le devolverá la misma frase pero sin espacios
# en blanco, y un contador de cuántos caracteres tiene la frase
# Ejemplo:     frase = vivir por siempre en paz
#              frase final = vivirporsiempreenpaz
#              Nº de caracteres = 20
frase1 = input('Digite una frase: ')
frase2 = " "
for i in frase1:
    if i != " ":
        frase2 += i
frase1 = frase2
print(f'\nFrase final: {frase1}')
print(f'Nº de caracteres: {len(frase1)}')