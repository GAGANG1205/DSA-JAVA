public class PrimeCheck {

    public static void main(String[] args) {
       int number=7;

        // boolean isPrime = isPrime(number, 2);

        if (isPrime(number,2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

       
    }

    
    static boolean isPrime(int number, int mum) {
       
        if (number <= 2) {
            return number == 2; 
        }
        if (number % mum == 0) {
            return false; 
        }
        if (mum * mum > number) {
            return true; 
        }

        
        return isPrime(number ,mum+ 1);
    }
}
