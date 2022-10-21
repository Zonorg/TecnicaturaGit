# Ejercicio 5: convertidor de temperaturas
# Realizar dos funciones para convertir de grados Celsius a Fahrenheit y viceversa
# Investigar las fórmulas

# Función para convertir de celius a fahrenheit
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32  # Presedencia: multiplicación, división y suma

# Función para convertir de fahrenheit a celsius
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9  # Respetar la presedencia utilizando paréntesis

celsius = float(input('Digite el valor de Celsius: '))
resultado = celsius_fahrenheit(celsius)
print(f'{celsius} C a F -> {resultado:.2f}')

fahrenheit = float(input('Digite el valor de Fahrenheit: '))
resultado = fahrenheit_celsius(fahrenheit)
print(f'{fahrenheit} F a C -> {resultado:.2f}')