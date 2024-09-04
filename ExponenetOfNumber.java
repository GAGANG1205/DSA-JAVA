//head recursion
// public class ExponenetOfNumber {
//     static int  exponent(int base, int power){
//         if(power==0){
//             return 1;
//         }
// return base*exponent(base,power-1);
//     }
//     public static void main(String[] args) {
//         int n=9;
//         int power=4;
//         System.out.println(n+"^" +power+ "=" +exponent(n,power));
        
//     }
// }


//tail recursion
public class ExponenetOfNumber {
    // static int  exponent(int base, int power, int ans){
    //     if(power==0){
    //        System.out.println(ans);
    //     }
    static int  exponent( int base, int power){
        if(power==0){
            return 1;
        }
return base*exponent(base,power-1);
    }
    public static void main(String[] args) {
        int n=9;
        int power=4;
        System.out.println(n+"^" +power+ "=" +exponent(n,power));
        
    }
}
