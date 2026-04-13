import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "Hallo Nutzer Willkommen beim ersten Projekt einen Aufgaben Manager\n Bitte gib dein Alter und deinen Namen an");
        Scanner in = new Scanner(System.in);
        System.out.print("Name:");
        String name = in.nextLine();
        System.out.print("Alter:");
        int alter = in.nextInt();
        int neu = alter+ 5;
        System.out.println("In 5 jahren wirst du " +name +": " + neu + " Jahre alt sein!\n");

        ArrayList<String> aufgaben = new ArrayList<>();
        in.nextLine();
        while (true) {
            System.out.println("1: Aufgabe hinzufügen\n2: Alle Afugaben anzeigen\n3: Programm beenden");
            String job = in.nextLine();
            if (job.equals("1")) {
                System.out.println("Gebe die Aufgabe ein die Hinzugefügt werden soll:");
                aufgaben.add(in.nextLine());
            } else if (job.equals("2")) {
                int anzahl = 1;
                for (String s : aufgaben) {
                    System.out.println("Aufgabe " + anzahl + " ist " + s);
                    anzahl++;
                }

            } else if (job.equals("3")) {
                break;
            } else {
                System.out.println("Falsche Eingabe");
            }
        }
        in.close();
    }
}