public class Vampir extends Monstera{
    private int healing;

    public Vampir(String name, int hp, int attack, int healing){
        super(name, hp, attack);
        this.healing = healing;
    }

    @Override
    public void attack(Monstera target){
        super.attack(target);
        setHP(healing+getHP());
    }
}
