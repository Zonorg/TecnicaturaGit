class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, edad):  # Se lo llama método init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):  # **
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')

persona1= Persona('Renzo', 'Viscio', 25)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(f'Objeto 1 de la clase Persona: {persona1.nombre} {persona1.apellido}, Edad: {persona1.edad} años')

persona2 = Persona('Osvaldo', 'Giordanini', 45)
print(f'Objeto 2 de la clase Persona: {persona2.nombre} {persona2.apellido}, Edad: {persona2.edad} años')

# Modificar atributos de un objeto
persona1 = Persona('Liliana', 'Buccella', 40)
print(f'Objeto 1 de la clase Persona modificado: {persona1.nombre} {persona1.apellido}, Edad: {persona1.edad} años')

# Métodos de instancia: definimos un método **
persona1.mostrar_detalle()
persona2.mostrar_detalle()
