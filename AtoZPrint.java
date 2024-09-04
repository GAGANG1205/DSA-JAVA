public class AtoZPrint {
    static void printAllPos(int count,String result){
        if(count==27){
            System.out.println(result);
            return;
        }
        for(char start='A';start<='Z'; start++){
            printAllPos(count+1,result+start);
        }
    }
    public static void main(String[] args) {
        printAllPos(0, "");
        
    }
}
