
import java.util.Arrays;

public class SearchArray {
    static int [] findAll(int arr[], int index , int searchVal , int count){
        if(index==arr.length){
            return  new int [count];

        }
        if(arr[index]==searchVal){
            count++;
        }
        int ans[]=findAll(arr, index+1, searchVal, count);
        if(arr[index]== searchVal){
            ans[--count] = index;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {10,20,50,89,90,100,50};
        int result[]=findAll(arr, 0, 60, 0);
        System.out.println(Arrays.toString(result));
    }
}
