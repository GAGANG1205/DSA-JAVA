public class IntegerToBinary {
    static void intToBinary(int num , string binary){
        if(num==0){
            binary=binary + String.valueOf(num);
            return;
            
        }
        binary=intToBinary(num/2, binary);
        int rem=num%2;
        binary=binary + String.valueOf(rem);
        return binary;

    }

  public static void main(String[] args) {
      System.out.println()
  }

}

