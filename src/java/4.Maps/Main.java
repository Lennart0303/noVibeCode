import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hier geht es um Maps sie zu erstellen und damit zu arbeiten");
        HashMap<String, String> vokab = new HashMap<>();
        List<String> speicher = new ArrayList<>();
        Path path = Path.of("src/java/4.Maps/speicher.txt");
        try {
            speicher = Files.readAllLines(path);
            for (String s : speicher) {
                String[] teile = s.split(" ");
                vokab.put(teile[0], teile[1]);
                System.out.println(teile[0] + " " + teile[1]);
            }
        } catch (Exception e) {
            System.out.println("Datei existiert noch nicht");
        }

        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            String input = null;
            do {
                System.out.println("s für suchen und n für neue Vokab alles andere endet");
                input = scan.nextLine();
                if (input.equals("s")) {
                    System.out.println("nach welchen wort suchst du?");
                    String anfrage = scan.nextLine();
                    if (vokab.containsKey(anfrage)) {
                        System.out.println("Gedunden: " + anfrage + " " + vokab.get(anfrage));
                    } else if(vokab.containsValue(anfrage)){
                        System.out.println("gibt es versuche es auf der anderen Srpeche"); 
                    }else{
                        System.out.println("noch nicht vorhanden");
                    }
                }else if (input.equals("n")) {
                    System.out.println("Neue Vokabel bitte eingeben:");
                    String key = scan.next();
                    String value = scan.next();
                    vokab.put(key, value);
                    scan.nextLine();
                }
            } while (input.equals("s") || input.equals("n"));

            ArrayList<String> write = new ArrayList<>();
            for (String key : vokab.keySet()) {
                String eintrag = key + " " +vokab.get(key);    
                write.add(eintrag);
            }
            Files.write(path, write);
        } catch (Exception e) {
            System.err.println(e.getStackTrace());
        } finally {
            scan.close();
        }
    }
}
