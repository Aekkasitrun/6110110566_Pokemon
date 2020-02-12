package pokemon;
import java.util.*;
public class Display extends pokemon{
    private static int checkcode = 99;
    private static int curcode = 99 ;
    private static int curHP = 0 ;
    private static int curSP = 0 ;
    private static int curDMG = 0 ;
    private static String curName ;

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
        System.out.println("|\t        Chose Your Pokemon    |");
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

    public static void displayPartSatus(){
        System.out.println("._____________________________________.");
        System.out.println("|\t     Your Status POKEMON              |");
        System.out.println("|\tYour Partner is "+ curName + "   |");
        System.out.println("|\tYour HP Partner is "+ curHP + "  |");
        System.out.println("|\tYour SP Partner is "+ curSP + "  |");
        System.out.println("|\tYour DMG Partner is "+ curDMG + "|");
        System.out.println("|_____________________________________|");
    }
    
    

}
