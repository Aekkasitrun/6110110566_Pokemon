package pokemon;
import java.util.*;
public class Display extends pokemon{
    private static int checkcode = 99;
    private static int curcode = 99 ;
    private static int curHP = 0 ;
    private static int curSP = 0 ;
    private static int curDMG = 0 ;
    private static String curName ;
    
    private static int curEmcode = 99 ;
    private static int curEmHP = 0 ;
    private static int curEmSP = 0 ;
    private static int curEmDMG = 0 ;
    private static String curEmName ;

    public static void MainMenu() {
        System.out.println("._____________________________________.");
        System.out.println("|\t        MAIN MENU             |");
        System.out.println("|\t1 :  Chose Your Pokemon       |");
        System.out.println("|\t2 :        Quit               |");
        System.out.println("|_____________________________________|");
    }

    public static void ChosePokemon() {
        int part = 0;
        int event = 0;
        
        Scanner eventtype = new Scanner(System.in);
        
    do{
        System.out.println("._____________________________________.");
        System.out.println("|\t     Chose Your Pokemon       |");
        System.out.println("|\t1 : Charmander                |");
        System.out.println("|\t2 : Pikachu                   |");
        System.out.println("|_____________________________________|");

        event = eventtype.nextInt();
        if (event == 1) {
            System.out.println("\n\tCharmander is your pokemon.");
            checkcode = 0;
            break;
        } 
        else if (event == 2) {
            System.out.println("\n\tPikachu is your pokemon.");
            checkcode = 1;
            break;
        }
    }while(event != 3);

}

public static int returnCode() {
    int code = checkcode;
    return code;
}
    
public static void Enime(){
    curEmHP = Enime.getHpEnime();
    curEmSP = Enime.getSpEnime();
    curEmDMG = Enime.getDmgEnime();
    curEmName = Enime.getNameEnime();
    curcode = checkcode;
}


public static void Status(){
        if(checkcode == 0){
            curHP = Charmander.getHpCharmander();
            curSP = Charmander.getSpCharmander();
            curDMG = Charmander.getDmgCharmander();
            curName = Charmander.getNameCharmander();
            curcode = checkcode;
        }
        else if (checkcode == 1){
             curHP = Pikachu.getHpPikachu();
            curSP = Pikachu.getSpPikachu();
            curDMG = Pikachu.getDmgPikachu();
            curName = Pikachu.getNamePikachu();
            curcode = checkcode ;
        }

    }

    public static int getStatusHpPartner(){
        return curHP ;
    }
    public static int getStatusSpPartner(){
        return curSP ;
    }
    public static int getStatusDmgPartner(){
        return curDMG ;
    }
    public static int getStatusCodePartner(){
        return curcode ;
    }

    public static void displayPokemonSatus(){
        System.out.println("._____________________________________.");
        System.out.println("|\t     Your Status POKEMON      |");
        System.out.println("|\tPokemon's name "+ curName + "     |");
        System.out.println("|\tPokemon's HP "+ curHP + "              |");
        System.out.println("|\tPokemon's SP "+ curSP + "              |");
        System.out.println("|\tPokemon's DMG "+ curDMG + "              |");
        System.out.println("|_____________________________________|");
    }
    
    
    public static void mainFight(){
        int ComYes = 0;
        int sum = 0;
        Scanner EventPersonAct = new Scanner(System.in);
        do{
            System.out.println("._____________________________________.");
            System.out.println("|\t  Do you want to fight?       |");
            System.out.println("|\t 1 : Yes                      |");
            System.out.println("|\t 2 : back                     |");
            System.out.println("|_____________________________________|");
            
            ComYes = EventPersonAct.nextInt();
            if(ComYes == 1){
                System.out.println("\t You are in FIGHT!!           ");
              Enime();
              displayEmSatus();
                //break;
                mainAtk();
                //MainMenu();
                break;
            }
            else{
                notFight(sum);
            }
            
        }while(ComYes != 2);
        
        
    }
    
    public static int notFight(int sum) {
		return sum;
	}
   
   
   
   
   
   
    public static void displayEmSatus(){
        System.out.println("._____________________________________.");
        System.out.println("|\t      Enime POKEMON           |");
        System.out.println("|\tEnime is "+ curEmName + "              |");
        System.out.println("|\tHP Enime is "+ curEmHP + "               |");
        System.out.println("|\tSP Enime is "+ curEmSP + "               |");
        System.out.println("|\tDMG Enime is "+ curEmDMG + "               |");
        System.out.println("|_____________________________________|");
    }
   
   
    public static void mainAtk(){
        int ComAck = 0;
        int PokemonHP = curHP ;
        int PokeDmg = curDMG ;
        int EmHP = curEmHP ;
        int EmDmg = curEmDMG ;
        
        
        Scanner AttackEnime = new Scanner(System.in);
        System.out.println("._____________________________________.");
        System.out.println("|\t  1 : Attack                  |");
        System.out.println("|\t  2 : RUN                     |");
        System.out.println("|_____________________________________|");
        ComAck = AttackEnime.nextInt();
        if(ComAck == 1){
            PokemonHP = hpWhileFight(EmDmg, PokemonHP);
            EmHP = hpWhileFight(PokeDmg, EmHP);
        
            System.out.println("._____________________________________.");
            System.out.println("|\t     Your Status POKEMON      |");
            System.out.println("|\tPokemon's name "+ curName + "     |");
            System.out.println("|\tPokemon's HP "+ PokemonHP + "              |");
            System.out.println("|\tPokemon's SP "+ curSP + "              |");
            System.out.println("|\tPokemon's DMG "+ curDMG + "              |");
            System.out.println("|_____________________________________|");

            System.out.println("._____________________________________.");
            System.out.println("|\t      Enime POKEMON           |");
            System.out.println("|\tEnime is "+ curEmName + "              |");
            System.out.println("|\tHP Enime is "+ EmHP + "               |");
            System.out.println("|\tSP Enime is "+ curEmSP + "               |");
            System.out.println("|\tDMG Enime is "+ curEmDMG + "               |");
            System.out.println("|_____________________________________|");

           // MainMenu();
    }
    else if(ComAck == 2){
        System.out.println("\n\t        RUN!!!  ");
        mainFight();

    }

}

    


	public static int hpWhileFight(int damage, int hp){
        return hp - damage;
    }

	

	

}
