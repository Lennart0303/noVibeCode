public class Monstera{
    private String name;
    private int hp;
    private int attack;

    public Monstera(String name, int hp, int attack){
        this.hp = hp;
        this.name = name;
        this.attack = attack;
    }

    public void attack(Monstera target){
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

    public void setHP(int hp){
        this.hp=hp;
    }

    public int getAttack(){
        return attack;
    }
}