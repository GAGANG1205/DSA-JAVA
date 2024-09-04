public class Reverse {
    static void revArray(int []arr , int start, int end,int index ){
        if(start>=end){
            return ;
        }
int temp = arr[start];
arr[start]= arr[end];
arr[end]=temp;
revArray(arr, start+1, end-1, index);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        revArray(arr, 0, arr.length-1, 0);
        
    }
}
