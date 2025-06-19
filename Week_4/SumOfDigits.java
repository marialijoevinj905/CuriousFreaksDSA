import java.util.*;
public class SumOfDigits{
    public static int countZeros(int n){
        if(n==0) return 0;
        else return (n%10)+countZeros(n/10);
    }
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
	    int res = countZeros(n);
	    System.out.println(res);
	  }
}
