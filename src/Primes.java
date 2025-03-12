public class Primes {
    public static void main(String[] args) {
        int [] data = {5, 8, 13, 30, 41, 56};
        for(int i=0; i<data.length; i++) {
            if(isPrime(data[i])) {
                System.out.println(data[i] + " is a prime number ");
            }
            else {
                System.out.println(data[i] + " is not a prime number ");
            }
        }
    }

    public static boolean isPrime(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
            {
                factors++;
            }
        }
        if(factors == 2) return true;
        else return false;
    }
}