public class PokemonGame{
    public static void main(String[] args){
        System.out.println("Hello Pokemon Game");
        Trainer t = new Trainer("JC chang");
        MainGame mg = new MainGame(t);
        //t.play();
        System.out.println("End Pokemon Game"); 
    }


    
}