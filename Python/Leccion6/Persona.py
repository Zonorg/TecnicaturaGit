class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):  # Se lo llama método init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni  # Este atributo está encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):  # self es igual a this
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}, la dirección es: {self.args}, los datos son: {self.kwargs}')


persona1 = Persona('Renzo', 'Viscio', 40688873, 25)
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(f'Objeto 1 de la clase Persona: {persona1.nombre} {persona1.apellido}, Edad: {persona1.edad} años')

persona2 = Persona('Osvaldo', 'Giordanini', 30321456, 45)
print(f'Objeto 2 de la clase Persona: {persona2.nombre} {persona2.apellido}, Edad: {persona2.edad} años')

# Modificar atributos de un objeto
persona1 = Persona('Liliana', 'Buccella', 30434332, 40)
print(f'Objeto 1 de la clase Persona modificado: {persona1.nombre} {persona1.apellido}, Edad: {persona1.edad} años')

# Métodos de instancia: definimos un método **
persona1.mostrar_detalle()
persona2.mostrar_detalle()

# Crear atributos desde un objeto
persona1.telefono = '2604548756'
print(f'Este es el teléfono de {persona1.nombre}: {persona1.telefono}')

# Método init Dunder con argumentos variables
persona3 = Persona('Rogelio', 'Romero', 35345737, 22, 'Teléfono', '2604423345', 'Calle Lopez', 823, 'Casa', 18, Altura=1.83, Peso=105, CFavorito='Azul', Auto='Citroen')
persona3.mostrar_detalle()
# print(persona3._dni) Esto no se debe utilizar