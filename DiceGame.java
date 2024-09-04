public class DiceGame{
    static int countReach(int start , int end){
    if(start==end){
        return 1;

        
    }
    if(start>end){
        return 0;
    }
        int count=0;
        count=count + countReach(start+1, end);
        count=count + countReach(start+2, end);
        count=count + countReach(start+3, end);
        count=count + countReach(start+4, end);
        count=count + countReach(start+5, end);
        count=count + countReach(start+6, end);
        return count;
    }
    public static void main (String [] args){
int result=countReach(0,5);
System.out.println(result);

    }
}