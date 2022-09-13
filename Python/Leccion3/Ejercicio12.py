#Calcular la sumatoria de 5 sueldos según la tarifa de los empleados
horas = int(input('Digite las horas trabajadas: '))
tarifa = int(input('Digite la tarifa por hora: '))
salario = horas * tarifa
salTotal = salario * 5
print(f'El salario de cada empleado es: {salario}')
print(f'La suma de los 5 salarios es: {salTotal}')
