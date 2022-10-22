class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos a mostrar son: {self._nombre} {self._apellido} {self._edad}')

    @property  # Decorador
    def nombre(self):  # Método Getter
        print('Estamos utilizando el método Get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  #Método Setter
        self._nombre = nombre
        print('\nEstamos utilizando el método Set')

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

if __name__ == '__main__':
    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre)  # Llamamos al método Get
    persona1.nombre = 'Juan Pedro'
    print(persona1.nombre)
    print(persona1.apellido)
    print(persona1.edad)
    persona1.mostrar_detalles()

    persona2 = Persona2('Ren', 'Visci', 24)
    persona2.nombre = 'Renzo'
    persona2.apellido = 'Viscio'
    persona2.edad = 25
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.mostrar_detalles()

    persona3 = Persona2('Caro', 'Felisa', 21)
    persona3.nombre = 'Carolina'
    persona3.apellido = 'Felix'
    persona3.edad = 31
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.mostrar_detalles()

    persona4 = Persona2('Naty', 'Lucer', 25)
    persona4.nombre = 'Natalia'
    persona4.apellido = 'Lucero'
    persona4.edad = 35
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.mostrar_detalles()

    print(__name__)