import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        System.out.println("Das ist Obejektorientierung 2 Mosnter kämpfen gegeneinander");
        Monster golem = new Monster("Golem", 100, 10);
        Monster goblin1 = new Monster("Goblin 1", 15, 4);
        Monster goblin2 = new Monster("Goblin 2", 20, 10);
        Monster goblin3 = new Monster("Goblin 3", 30, 5);
        ArrayList<Monster> goblins = new ArrayList<>();
        goblins.add(goblin1);
        goblins.add(goblin2);
        goblins.add(goblin3);

        while(golem.getHP()>=0 && goblin1.getHP()>=0 && goblin2.getHP()>=0 && goblin3.getHP()>=0){
            System.out.println("Eine neue Kampf Runde als erstes greift "+golem.getName()+" an");
            for (Monster monster : goblins) {
                golem.attack(monster);
                System.out.println("Leben von " + monster.getName()+ " liegt bei "+ monster.getHP());
                monster.attack(golem);
                System.out.println("Leben von " + golem.getName()+ " liegt bei "+ golem.getHP());
            }
            
        }
    }

}