
// public class PatternsUsingRecursion {
//     static void patterns(int n) {
//         if (n == 0) {
//             return;
//         }
//         printRowss(n);
//         System.out.println();
//         patterns(n-1);
//     }
//     static void printRowss(int n) {
//         if (n == 0) {
//             return;
//         }
//         printRowss(n - 1);
//         System.out.print("*");
//     }
//     public static void main(String[] args) {
//         patterns(5 );
//     }
// }
public class PatternsUsingRecursion {

    static void spaces(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(" ");
        spaces(n - 1);
    }

    static void printStar(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        printStar(n - 1);

    }

    static void printtrinagle(int star, int space) {
        if (star == 0) {
            return;
        }
        printtrinagle(star+2, space -1);
        spaces(space);
        printStar(star);
        // printStar(star-1);
        // spaces(space);

        System.out.println();

    }

    public static void main(String[] args) {
        printtrinagle(5,0 );
    }
}
