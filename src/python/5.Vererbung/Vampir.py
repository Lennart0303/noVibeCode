from Monster import Monster

class Vampir(Monster):
    def __init__(self, name, hp, power, healing):
        super().__init__(name,hp,power)
        self.healing = healing

    def attack(self, target):
        super().attack(target)
        self.hp = self.hp + self.healing