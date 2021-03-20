import java.util.Scanner;

/**
 * CarintheCity
 */
public class CarintheCity {

    public static void main(String[] args) {
        int [] delhi = new int[4];
        int [] kolkata = new int[4];
        int [] cheenai = new int[4];
        int [] mumbai = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("\tMaruti K10\tZen-Astelo\tWagnor\tMaruti-SX4");
        System.out.print("Delhi: ");
        for(int i = 0; i < 4; i++) {
            delhi[i] = input.nextInt();
            //System.out.print("\t");
        }

        System.out.print("Mumbai: ");
        for(int i = 0; i < 4; i++) {
            mumbai[i] = input.nextInt();
            //System.out.print("\t");
        }

        System.out.print("Kolkata: ");
        for(int i = 0; i < 4; i++) {
            kolkata[i] = input.nextInt();
            //System.out.print("\t");
        }

        System.out.print("Cheenai: ");
        for(int i = 0; i < 4; i++) {
            cheenai[i] = input.nextInt();
            //System.out.print("\t");
        }

        System.out.println("\tMaruti K10\tZen-Astelo\tWagnor\tMaruti-SX4");

        for(int i = 0 ; i < 4; i++) {
            if (i == 0)
                System.out.print("Delhi: \t");
            else if (i == 1)
                System.out.print("Mumbai: \t");
            else if (i == 2)
                System.out.print("Kolkata: \t");
            else
                System.out.print("Cheenai: \t");

            for(int j = 0 ; j < 4 ; j++) {
                if (i == 0)
                    System.out.print(delhi[j]+"\t\t");
                else if (i == 1)
                    System.out.print(mumbai[j]+"\t\t");
                else if (i == 2)
                    System.out.print(kolkata[j]+"\t\t");
                else
                    System.out.print(cheenai[j]+"\t\t");
                }
                System.out.println();
            }

        }


    }
