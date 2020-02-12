package pokemon;
import java.util.*;
public class Display extends pokemon{
    private static int checkcode = 99;
    private static int curcode = 99 ;
    private static int curHP = 0 ;
    private static int curSP = 0 ;
    private static int curDMG = 0 ;

    public static void MainMenu() {
        System.out.println("._____________________________________.");
        System.out.println("|\t        MAIN MENU             |");
        System.out.println("|\t1 :  Chose Your Pokemon       |");
        System.out.println("|\t2 :        Quit               |");
        System.out.println("|_____________________________________|");
    }

    public static void ChosePokemon() {
        System.out.println("._____________________________________.");
        System.out.println("|\t        Chose Your Pokemon    |");
        System.out.println("|\t1 : Charmander                |");
        System.out.println("|\t2 : Pikachu                   |");
        System.out.println("|\t3 : back                      |");
        System.out.println("|_____________________________________|");
    }

	

}
