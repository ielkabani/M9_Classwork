import java.util.Random;
import java.util.Scanner;
public class Min_Max {
    public static void main(String[] args) {
        int[] data = new int[10];
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(10) + 1;
        }
        for(int i=0; i<data.length; i++) {
            System.out.print(data[i]+" ");
        }

        int min = data[0];
        int max = data[0];
        for(int i=0; i<data.length; i++) {
            if(data[i] < min)
            {
                min=data[i];
            }
            if(data[i] > max)
            {
                max=data[i];
            }
        }
        System.out.println("\nThe minimum element is "+min);
        System.out.println("The maximum element is "+max);
    }
}
