class Rectangulo:
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calc_area(self):
        return self.base * self.altura

base = int(input('Defina la base del rectángulo: '))
altura = int(input('Defina la altura del rectángulo: '))
rectangulo1 = Rectangulo(base, altura)
print(f'El área del rectángulo es: {rectangulo1.calc_area()}')