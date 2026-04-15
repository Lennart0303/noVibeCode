from pathlib import Path

def main():
    path =Path("src/python/2.Datei/tasks.txt")
    if path.exists():
        print("Inhalt der Datei:")
        print(path.read_text())
    else:
        "Datei exisitert nicht"

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
    
    with path.open(mode="w",encoding="utf8") as f:
        for s in aufgaben:
            f.write(f"{s}\n")

if __name__ == "__main__":
    main()