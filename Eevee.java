

public class Eevee extends Pokemon{
    public Eevee(String name){
        super(name, 500);
    }

    public void attack(Pokemon enemy){
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
        enemy.damage(10);
    }
}