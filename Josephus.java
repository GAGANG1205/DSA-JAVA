
public class Josephus {
    static int josephus(int n , int k ){
if(n==1)return 1;
return (josephus(n-1,k)+k) %n;
    }

    public static void main(String[] args) {
        int ans = josephus(5,2);
        System.out.println(ans);
    }
}
