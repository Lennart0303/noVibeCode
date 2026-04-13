def main():
    print("Hallo und Herzilich Willkommen in der python hölle\n bitte gebe deinen Namen und dein Alter ein")
    name = input("Name: ")
    alter =int(input("Alter: "))
    neu = alter+5
    print(f"in 5 Jahren wirst du {name}: {neu} Jahre alt sein")

    aufgaben =[]
    while(True):
        job = int(input("1: Neue Aufgabe hinzufügen\n2: Alle Anzeigen\n3: programm beenden "))
        if job == 1:
            aufgaben.append(input("Neue Aufgabe:"))
        elif job == 2:
            for i, aufgabe in enumerate(aufgaben, 1):
                print(f"Aufgabe {i} ist {aufgabe}")
        elif job == 3:
            break
        else:
            print("flasche eingabe")

if __name__ == "__main__":
    main()