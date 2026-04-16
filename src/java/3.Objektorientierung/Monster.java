public class Monster{
    private String name;
    private int hp;
    private int attack;

    public Monster(String name, int hp, int attack){
        this.hp = hp;
        this.name = name;
        this.attack = attack;
    }

    public void attack(Monster target){
        target.loseHp(this.attack);
    }

    public void loseHp(int ammount){
        this.hp -= ammount;
    }
    
    public String getName(){
        return name;
    }

    public int getHP(){
        return hp;
    }

    public int getAttack(){
        return attack;
    }
}