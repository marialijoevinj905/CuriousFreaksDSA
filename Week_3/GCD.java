public class GCD{
  public static void main(String[] args){
    while(b!=0){
      int temp = b;
      b = a%b;
      a = temp;
    }
    return a;
  }
}
