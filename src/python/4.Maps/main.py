from pathlib import Path

def main():
    print("Hier soll es jetzt um maps gehen in Python")
    path = Path("src/python/4.Maps/vokab.txt")
    vokab = {}
    speicher = []

    if path.exists():
        print("Datei gefunden inhalt bisher:")
        kompllett = path.read_text(encoding="utf8")
        speicher = kompllett.splitlines()
        counter = 1
        for zeile in speicher:
            teile = zeile.split(" ")
            vokab[teile[0]]=teile[1]
            print(f"{counter}. {teile[0]} {teile[1]}")
            counter = counter + 1
    else:
        print("Datei existiert noch nicht")

    while True:
        job = input("Was möchtest du tun?\n1. Etwas Suchen \"S\"\n2. Etwas Hinzufügen \"N\"\n3. Beenden alles andere ")
        if job.lower() == "s":
            such = input("Was möchtest du suchen? ")
            if such in vokab:
                print(f"Gefunden: {such} {vokab[such]}")
            elif such in vokab.values():
                print("Exsitiert aber Key ist andere Sprache")
            else:
                print("nicht vorhanden")
        elif job.lower() == "n":
            neu = input("Was möchtest du Hinzufügen? ")
            teile = neu.split()
            if len(teile) == 2:
                vokab[teile[0]] = teile[1]
            else:
                print("Falsche eingabe?!?!")
        else:
            break
    
    with path.open(mode="w",encoding="utf8") as f:
        for key in vokab.keys():
            f.write(f"{key} {vokab[key]}\n")

if __name__ == "__main__":
    main()