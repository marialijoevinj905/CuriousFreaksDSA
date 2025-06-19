import java.util.*;
public class PrintDivisor{
    public static void Divisor(int n, int i){
        if(i>n) return;
        if(n%i==0) System.out.print(i+" ");
        Divisor(n,i+1);
    }
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  		Divisor(n,1);
  	}
}
