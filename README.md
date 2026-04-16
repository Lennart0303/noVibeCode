# 📓 Programmier-Logbuch: NoVibeCode
Dieses Logbuch dokumentiert meine abgeschlossenen Projekte und die darin gelernten Konzepte.
---

## 🛠️ Projekt 01: Ground Zero Manager (Basics)
*Ziel: Ein interaktives Programm bauen, das Daten im Arbeitsspeicher verwaltet.*

### 📋 Anforderungen
- Nutzer nach **Name und Alter** fragen.
- Mit Variablen **rechnen** (Alter in 5 Jahren).
- Ein dauerhaftes **Menü** erstellen (Hinzufügen, Anzeigen, Beenden).
- Eine **Liste** nutzen, um Aufgaben während der Laufzeit zu speichern.

### 🧠 Lernerfolge
- **Input & Output:** Daten über die Tastatur einlesen und im Terminal ausgeben.
- **Typ-Konvertierung:** Text (String) in Zahlen (Integer) umwandeln, um damit rechnen zu können.
- **Listen-Handling:** Einträge dynamisch zu einer Liste hinzufügen und diese wieder auslesen.
- **Programm-Logik:** Den Ablauf mit Schleifen (`while`) und Bedingungen (`if/else`) steuern.

---

## 💾 Projekt 02: Das Gedächtnis (Dateien)
*Ziel: Daten dauerhaft auf der Festplatte speichern und wieder laden.*

### 📋 Anforderungen
- **Dateiprüfung:** Beim Start checken, ob eine Speicherdatei existiert.
- **Lade-Funktion:** Den Inhalt einer Textdatei einlesen und in die Programmliste übertragen.
- **Speicher-Funktion:** Die Liste beim Beenden des Programms in eine Datei schreiben.
- **Stabilität:** Fehler abfangen, falls Pfade falsch sind oder Dateien fehlen.

### 🧠 Lernerfolge
- **File I/O:** Dateien öffnen, lesen, beschreiben und sicher wieder schließen.
- **Pfade:** Arbeiten mit relativen Pfaden (`src/java/...`) innerhalb der Projektstruktur.
- **Fehlerbehandlung (Exceptions):** Das Programm mit `try-catch` (Java) oder `try-except` (Python) vor Abstürzen schützen.
- **Persistenz:** Den Unterschied zwischen flüchtigem Speicher (RAM) und dauerhaftem Speicher (Festplatte) verstehen.

---

## ⚔️ Projekt 03: Die Monster-Arena
*Ziel: Objektorientierte Programmierung (OOP) nutzen, um mehrere Instanzen einer Klasse in einem komplexeren Kampfsystem gegeneinander antreten zu lassen.*

### 📋 Anforderungen
- Eine `Monster`-Klasse mit Eigenschaften (Name, HP, Angriffskraft) und Methoden (Angreifen) erstellen.
- Ein Hauptprogramm schreiben, das ein Boss-Monster (Golem) und eine Gruppe kleinerer Gegner (Goblins) erstellt.
- Die Gegnergruppe in einer dynamischen Liste (`ArrayList`) verwalten.
- Ein rundenbasiertes Kampfsystem programmieren, in dem der Boss nacheinander jeden Gegner in der Liste angreift und diese zurückschlagen.

### 🧠 Lernerfolge
- **Objekt-Verwaltung:** Verstehen, wie man komplexe, selbstgebaute Datentypen (Objekte) in dynamischen Datenstrukturen (wie Listen) speichert und systematisch abruft.
- **Iteration:** Schleifen nutzen, um geordnet durch eine Sammlung von Objekten zu navigieren und Aktionen für jedes einzelne Element auszuführen.
- **Zustandsverwaltung (State Management):** Den Überblick behalten, wie sich die internen Daten (z.B. HP) einzelner Objekte während der Programmlaufzeit durch Interaktionen dynamisch verändern.
- **Ablaufsteuerung (Control Flow):** Rundenbasierte Logik sauber strukturieren und Grenzfälle abfangen (z.B. durch das vorzeitige Abbrechen von Schleifen, um Aktionen von bereits zerstörten Objekten zu verhindern).

## 🗂️ Projekt 04: Der Vokabel-Tresor (Key-Value Daten)
*Ziel: Weg von zeitraubenden Suchschleifen. Daten intelligent verknüpfen, um blitzschnell auf sie zugreifen zu können, und sie in einem simplen Format dauerhaft speichern.*

### 📋 Anforderungen
- Ein Programm zur Abfrage von englischen Vokabeln und ihren deutschen Übersetzungen bauen.
- Die Vokabeln nicht in simplen Listen, sondern in einer passenden Key-Value-Struktur (Dictionary / Map) verwalten.
- Eine Suchfunktion integrieren: Der Nutzer gibt ein Wort ein, und das Programm findet die Übersetzung sofort, ohne eine Schleife zu nutzen.
- **Speichern & Laden:** Die Vokabeln als simple Textdatei (z.B. im Format `apple=Apfel`) auf der Festplatte sichern und beim Neustart wieder in die Datenstruktur laden.

### 🧠 Lernerfolge
- **Key-Value Stores:** Das Konzept von "Wörterbüchern" im Code verstehen und den massiven Performance-Vorteil gegenüber iterativen Listen nutzen.
- **Datenabruf (Retrieval):** Gezieltes Suchen und Auslesen von Werten anhand eindeutiger Identifikatoren (Keys).
- **Einfache Serialisierung:** Interne Datenstrukturen in ein simples Textformat umwandeln, um sie abzuspeichern und beim nächsten Start fehlerfrei wiederherzustellen.

---

## 🧬 Projekt 05: Die Monster-Evolution (Vererbung & Polymorphismus)
*Ziel: Fortgeschrittene Objektorientierung. Vorhandenen Code durch Eltern- und Kindklassen clever wiederverwenden und spezialisieren, anstatt ihn neu zu schreiben.*

### 📋 Anforderungen
- Die bestehende `Monster`-Klasse aus Projekt 03 als "Elternklasse" (Superclass) nutzen.
- Eine "Kindklasse" (Subclass) wie z.B. `Vampir` erstellen, die automatisch alle Eigenschaften der Elternklasse erbt.
- Den Konstruktor des Vampirs so bauen, dass er den Eltern-Konstruktor (`super()`) aufruft, aber eigene, neue Eigenschaften (z.B. `heilungsFaktor`) hinzufügt.
- **Polymorphismus:** Die geerbte `attack()`-Methode beim Vampir überschreiben, sodass er nicht nur Schaden verursacht, sondern sich selbst um seinen Heilungsfaktor heilt.

### 🧠 Lernerfolge
- **Vererbung (Inheritance):** Die Prinzipien von Eltern- und Kindklassen nutzen, um doppelten Code (DRY-Prinzip) zu vermeiden und logische Hierarchien aufzubauen.
- **Konstruktoren-Logik (`super`):** Verstehen, wie Basis-Eigenschaften beim Erstellen eines Objekts sicher an die Logik der Elternklasse delegiert werden.
- **Polymorphismus (Vielgestaltigkeit):** Geerbte Methoden überschreiben oder erweitern, um spezialisiertes Verhalten in Unterklassen zu erzwingen, während das Hauptprogramm sie weiterhin wie normale Monster behandeln kann.