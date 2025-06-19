import java.util.*;
public class CountDigits{
    public static int countZeros(int n){
        if(n%10==n) return 1;
        else return 1+countZeros(n/10);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int res = countZeros(n);
	    System.out.println(res);
	}
}
