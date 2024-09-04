
import java.lang.reflect.Array;
import java.util.Arrays;

public class CountPosNeg {
   static int [] countPosNeg(int[] arr){
    int positivecount=0;
    int negativecount=0;
    
    
    for(int num : arr){
        if(num<0){
        negativecount++;
    }
    else if (num>0)
        positivecount++;
    
   }
   int[]  result = {negativecount,positivecount};
   return result;

    
}
   

    public static void main(String[] args) {
        int arr[]={-3,5,9,-8,-6,-9};
        int[] result=countPosNeg(arr);
        System.out.println(Arrays.toString(result));



    }
}
