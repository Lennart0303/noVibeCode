from Monster import Monster
from Vampir import Vampir
def main():
    golem = Monster("Golem", 1000,15)
    vampir = Vampir("Vampir", 150,10,10)
    zusammen =[]
    zusammen.append(golem)
    zusammen.append(vampir)
    while golem.hp>0 and vampir.hp>0:
        golem.attack(vampir)
        vampir.attack(golem)
        print(f"Beide haben noch Golem: {golem.hp} Vampir: {vampir.hp} leben")
    print("fertig")


if __name__=="__main__":
    main()