public class Climbing{
    static int  climbingStairs(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        if(num==2) return 2;
        return climbingStairs(num-1)+ climbingStairs(num-2);
    }
    public static void main(String[] args) {
        System.out.println( climbingStairs(0));
        
    }
}