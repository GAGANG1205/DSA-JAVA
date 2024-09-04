public class Reversestring {
    static String reverse(String str){
        if(str.length()==0){
            return "";
        }
        String smallString = str.substring(1);
        String smallresult = reverse(smallString);
        return smallresult + str.charAt(0);
        
    }
    static  void pallindrome(String org){
        String rev = reverse(org);
        System.out.println(reverse.equals(org)?"pallindromic":"not pallindromic ")
    }

    public static void main(String[] args) {
        System.out.println(reverse("racecar"));
    }
}
