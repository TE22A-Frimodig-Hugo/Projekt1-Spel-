import java.util.Random;
import java.util.Scanner;

public class Spel{


    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Meny:");
        System.out.println("1. Start");
        System.out.println("2. Avsluta");


        int val = scanner.nextInt();

        //Nedan måste vara inne i någon form av loop så att man alltid kan starta och avsluta.
 
        switch (val) {
            case 1:
                System.out.println("Du valde att starta spelet");
                //här kan jag lägga till kod som ska användas för alternativ 1.
                break;
            case 2: 
                System.out.println("Du valde att avsluta spelet");
                break;

            default:
                System.out.println("Ogiltigt svar. Var vänlig och välja mellan 1 av alternativen.");


                System.out.println("första");




                Random random = new Random();

                int player1 = random.nextInt(10);
                int player2 = random.nextInt(10);
                
                


                
        }




    }


}