# Ejercicio 3
mes = int(input('Digite un mes del año (1 - 12): '))
estacion = None
if mes == 12 or mes == 1 or mes == 2:
    estacion = 'Verano'
elif mes == 3 or mes == 4 or mes == 5:
    estacion = 'Otoñó'
elif mes == 6 or mes == 7 or mes == 8:
    estacion = 'Invierno'
elif mes == 9 or mes == 10 or mes == 11:
    estacion = 'Primavera'
else:
    estacion = 'Error, no hay un número para este mes'
print(f'Para el mes {mes}, la estación es: {estacion}')
