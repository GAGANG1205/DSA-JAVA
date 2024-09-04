
import java.util.ArrayList;

 
 public class DemoArrayList {
   public static void main(String[] args) {
    int [] arr=new int[5]; 
    ArrayList<Integer> list = new ArrayList<>(5);
    // list.add(1);
    // list.add(2);
    // list.add(3);
    for(int i=1;i<=10;i++){
        list.add(i);
    }
    System.out.println(list);
    list.remove(5);
    System.out.println(list);
    System.out.println(list.get(3));
   } 
}
