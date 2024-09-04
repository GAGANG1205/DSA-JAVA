import java.util.Scanner;

public class Armstrong {

    // Recursive method to count the number of digits in a number
    static int countDigit(int num) {
        if (num == 0) {
            return 0;
        }
        int c = countDigit(num / 10); // num/10 is the smaller problem
        return c + 1;
    }

    // Recursive method to check if a number is an Armstrong number
    static boolean armstrong(int org, int sum, int aux, int count) {
        if (aux == 0) {
            return org == sum; // If sum equals the original number, it's an Armstrong number
        }
        int singleDigit = aux % 10;
        int power = (int) Math.pow(singleDigit, count);
        sum = sum + power;
        aux = aux / 10;
        return armstrong(org, sum, aux, count);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the lower bound of the range: ");
            int lowerBound = sc.nextInt();
            System.out.print("Enter the upper bound of the range: ");
            int upperBound = sc.nextInt();
            
            int armstrongCount = 0;
            
            for (int num = lowerBound; num <= upperBound; num++) {
                if (armstrong(num, 0, num, countDigit(num))) {
                    armstrongCount++;
                    System.out.println(num + " is an Armstrong number.");
                }
            }
            
            System.out.println("Total Armstrong numbers between " + lowerBound + " and " + upperBound + ": " + armstrongCount);
        }
    }
}
