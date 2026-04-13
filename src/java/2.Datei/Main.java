import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Path path = Path.of("src/java/2.Datei/tasks.txt");
        ArrayList<String> aufgaben = new ArrayList<>();
        Scanner in = null;

        if (Files.exists(path)) {
            try {
                String inhalt = Files.readString(path);
                System.out.println(inhalt);
            } catch (IOException e) {
                System.err.println("FEHLER");
            }
        }


        try {
            in = new Scanner(System.in);
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
            if(aufgaben.size()>0){
                Files.write(path, aufgaben);
            }
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            in.close();
        }
    }
}
