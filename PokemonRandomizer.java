import java.util.*;
public class PokemonRandomizer{
    
    public static ArrayList<Pokemon> getPokemons(int num){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if(num < 1){
            return pokemons;
        }
        
        int pokemonNumber = (int)(Math.random()*num) + 1;
        
        for(int i=0; i<pokemonNumber; ++i){
            int type = (int)(Math.random()*10);
            if(type == 0)
                pokemons.add(new Pikachu("Wild Pikachu"));
            else if(type == 1)
                pokemons.add(new Raichu("Wild Raichu"));
            else if(type == 2)
                pokemons.add(new Kabigon("Wild Kabigon"));
            else if(type == 3)
                pokemons.add(new Eevee("Wild Eevee"));
            else if(type == 4)
                pokemons.add(new Kabigon("Wild Snorlax"));
            else if(type == 5)
                pokemons.add(new Kabigon("Wild Charizard"));
            else if(type == 6)
                pokemons.add(new Kabigon("Wild Celebi"));
            else if(type == 7)
                pokemons.add(new Kabigon("Wild Ditto"));
            else if(type == 8)
                pokemons.add(new Kabigon("Wild Gardivoir"));
            else if(type == 9)
                pokemons.add(new Kabigon("Wild Gyarados"));
            
        }
        return pokemons;
    }
}