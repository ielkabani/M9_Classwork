import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        System.out.print("Please enter the number of days: ");
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        double [] temps = new double[days];
        double sum = 0;
        for(int i = 0; i < days; i++) {
            System.out.print("\n Please enter Day " + (i+1) + " Temperature:");
            temps[i] = in.nextDouble();
            sum = sum  + temps[i];
        }
        double average = sum/days;
        System.out.println("The average temperature is: " + average);
        int count=0;
        for(int i = 0; i < days; i++) {
            if(temps[i] > average) {
                count++;
            }
        }
        System.out.println("There are " + count + " days above the average temperature");
    }
    }

