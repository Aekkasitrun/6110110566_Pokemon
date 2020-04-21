

public class Ditto extends Pokemon{
    public Ditto(String name){
        super(name, 10);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(80);
    }
}