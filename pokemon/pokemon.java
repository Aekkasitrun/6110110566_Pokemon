package pokemon;
import java.util.*;
public class pokemon{
    public static void main(String[] args){
        Scanner InputPerson = new Scanner(System.in);
        Scanner Command = new Scanner(System.in);
    //set name player
        System.out.println("Enter Your Name:");
        String NamePerson = InputPerson.next();

        System.out.println("Hello " + NamePerson);
        
        int ChoseCommand = 0;
        int checkCode = 99;
        
    do{    
        Display.MainMenu ();
        ChoseCommand = Command.nextInt();
        if(ChoseCommand == 1){
            Display.ChosePokemon();
            Display.Status();
            Display.displayPartSatus();
            Display.mainFight();
            //Display.displayEmSatus();
            Display.mainAtk();
        
        }
    }while(ChoseCommand != 2);
             
       

    }



}
