

public class Gyarados extends Pokemon{
    public Gyarados(String name){
        super(name, 900);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(300);
    }
}