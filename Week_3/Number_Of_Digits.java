import java.util.*;
public class Number_Of_Digits{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while(n>0){
      count++;
      n=n/10;
    }
    System.out.println(count);
  }
}
