import java.util.Random;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] data = new int[10];
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10) + 1;
        }
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.print("\n Please enter a number between 1 and 10: ");
        int number = in.nextInt();
        boolean found = false;
         for (int i = 0; i < data.length; i++) {
            if (data[i] == number) {
                System.out.println("The number is found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The number is not found");
        }
    }
}
