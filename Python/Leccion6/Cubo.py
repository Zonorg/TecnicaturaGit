class Cubo:
    def __init__(self,  ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calc_volumen(self):
        return self.ancho * self.alto * self.profundidad

ancho = int(input('Ingrese el ancho del cubo: '))
alto = int(input('Ingrese la altura del cubo: '))
profundidad = int(input('Ingrese la profundidad del cubo: '))
cubo1 = Cubo(ancho, alto, profundidad)
print(f'El volúmen del cubo es: {cubo1.calc_volumen()}')