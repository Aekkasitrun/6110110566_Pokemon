

public class Celebi extends Pokemon{
    public Celebi(String name){
        super(name, 600);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(70);
    }
}