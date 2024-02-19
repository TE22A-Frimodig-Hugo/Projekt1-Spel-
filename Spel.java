import java.util.Random;
import java.util.Scanner;

public class Spel {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int val = 1;

        while (val != 2) {

            System.out.println("Meny:");
            System.out.println("1. Start");
            System.out.println("2. Avsluta");
            System.out.println("3. Regler");

            val = scanner.nextInt();
            scanner.nextLine(); // Läs in det återstående radbytet

            switch (val) {
                case 1:
                    System.out.println("Du valde att starta spelet");
                    System.out.println("Namnge Spelare: ");
                    String spelar_namn = scanner.nextLine();
                    System.out.println("Spelare: " + spelar_namn);

                    int spelare_hp = 100;
                    int dator_hp = 100;

                    Random random = new Random();

                    while (spelare_hp > 0 && dator_hp > 0) {
                        int spelare_attack = random.nextInt(20) + 1;
                        int dator_attack = random.nextInt(20) + 1;

                        dator_hp -= spelare_attack;
                        spelare_hp -= dator_attack;

                        

                        System.out.println("Spelarens hälsa: " + spelare_hp);
                        System.out.println("Datorns hälsa: " + dator_hp);
                        System.out.println("\n Nästa runda \n");

                        if (spelare_hp <= 0) {
                            System.out.println("Du är nockad! Spelet är över.");
                        } else if (dator_hp <= 0) {
                            System.out.println("Datorn är nockad! Du vann!");
                        }
                        Thread.sleep(6000);
                    }
                    break;
                case 2:
                    System.out.println("Du valde att avsluta spelet.");
                    scanner.close();
                    break;
                case 3:
                    // Regelutskrift här
                    break;
                default:
                    System.out.println("Ogiltigt svar. Var vänlig och välja mellan 1 av alternativen.");
            }
        }
    }
}
