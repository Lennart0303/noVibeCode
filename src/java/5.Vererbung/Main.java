import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Monstera monster = new Monstera("Golem", 1000, 10);
        Vampir vampir = new Vampir("Vampir", 200, 10, 10);
        ArrayList<Monstera> monsters = new ArrayList<>();
        monsters.add(monster);
        monsters.add(vampir);

        while (monster.getHP() > 0 && vampir.getHP() > 0) {
            monster.attack(vampir);
            vampir.attack(monster);
            System.out.println("Es haben beide noch " + monster.getHP() + " " + vampir.getHP() + " Leben");
        }
        System.out.println("Fertig");
    }
}
