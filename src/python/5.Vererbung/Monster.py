class Monster:

    def __init__(self, name, hp, power):
        self.name = name
        self.hp = hp
        self.power = power

    def attack(self, target):
        target.loseHp(self.power)

    def loseHp(self, ammount):
        self.hp = self.hp - ammount