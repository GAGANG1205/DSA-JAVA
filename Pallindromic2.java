
// public class Pallindromic {
//     static void palindrome(int org, int rev, int aux) {
//     if (aux == 0){
//         if (org == rev){
//             System.out.println("pallindrome");
//         }
//         else{
//             System.out.println("not pallindrome");
//         }
//         return;
//     }

//         int singleDigit = aux % 10;
//         rev = singleDigit + rev * 10;
//         aux = aux / 10;
//         palindrome(org, rev, aux);
        
//     }

// //  }
//     public static void main(String[] args) {
    //         int num = 1122222211;
    //         palindrome(num, 0, num);
    //     }
    // }
    
    
    // //  static boolean  palindrome2(int org, int rev,int aux){
    
    public class Pallindromic2 {
    static boolean  palindrome(int org, int rev, int aux) {
    if (aux == 0){
        
        return org==rev;
        
    }

        int singleDigit = aux % 10;
        rev = singleDigit + rev * 10;
        aux = aux / 10;
        return palindrome(org, rev, aux);
        
    }


    public static void main(String[] args) {
        int num = 11222222;

        System.out.println("palidrome");
    }
}