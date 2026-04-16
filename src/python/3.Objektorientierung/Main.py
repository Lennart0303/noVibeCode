from Monster import Monster
import random

def main():
    print("Das ist Objektorientierung in Python")
    Drache = Monster("Drache", 200, 80)
    Maus = Monster("Maus", 10, 6000)
    gesammelt = []
    gesammelt.append(Drache)
    gesammelt.append(Maus)

    while Drache.hp >=0 and Maus.hp >=0: 
        starter = random.randint(1,2)
        if (starter == 1):
            print("Der Drache Greift zuerst an durch zufall")
            Drache.attack(Maus)
            if Drache.hp < 0 or Maus.hp < 0:
                break
            Maus.attack(Drache)
        else:
            print("Die Maus Greift zuerst an")
            Maus.attack(Drache)
            if Drache.hp < 0 or Maus.hp < 0:
                break
            Drache.attack(Maus)
            print("Die Monster haben noch foglendes Leben:")
            for monster in gesammelt:
                print(f"{monster.name} hat noch {monster.hp} leben")

    print("Die Monster haben noch foglendes Leben:")
    for monster in gesammelt:
        print(f"{monster.name} hat noch {monster.hp} leben")

if __name__=="__main__":
    main()