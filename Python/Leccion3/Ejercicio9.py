# Ejercicio: calcular calificacion promedio y la más baja de 10 alumnos
suma = 0
baja = 999

for i in range(10):
    calif = float(input('Ingrese la calificaciones: '))
    suma = suma + calif
    prom = suma / 10
    if calif < baja:
        baja = calif

print(f'La calificación promedio es: {prom}')
print(f'La calificación más baja fue: {baja}')