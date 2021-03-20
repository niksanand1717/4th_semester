import java.util.Scanner;

/**
 * Merge&Arrange
 */
public class MergeandArrange {

    public static void main(String[] args) {
        int [] arr1 = new int [5];
        int [] arr3 = new int [5];
        int [] arr2 = new int [5];
        int [] final_arr = new int [15];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter elements of arr1: ");
        for(int i = 0; i < 5; i++)
            arr1[i] = input.nextInt();

        System.out.print("Enter elements of arr2: ");
        for(int i = 0; i < 5; i++)
            arr2[i] = input.nextInt();

        System.out.print("Enter elements of arr3: ");
        for(int i = 0; i < 5; i++)
            arr3[i] = input.nextInt();

         int j = 0;

        for(int i = 0; i < 15; i++, j++) {

            if (i % 5 == 0)
                j = 0;
            if (i < 5)
                final_arr[i] = arr1[j];
            else if (i >= 5 && i < 10)
                final_arr[i] = arr2[j];
            else
                final_arr[i] = arr3[j];
        }

        // System.out.println("New Array: ");
        // for(j = 0; j < 15; j++)
        //     System.out.print(final_arr[j]+"\t");
        // System.out.println(" ");

        for(int i = 0; i < 14; i++) {
            for(j = 0; j < 14 - i; j++) {
                if (final_arr[j] > final_arr[j+1]) {
                        int temp = final_arr[j];
                        final_arr[j] = final_arr[j+1];
                        final_arr[j+1] = temp;
                }
            }
        }

        System.out.println("New Array: ");
        for(j = 0; j < 15; j++)
            System.out.print(final_arr[j]+"\t");
        System.out.println(" ");

        if(input != null) input.close();
    }
}
