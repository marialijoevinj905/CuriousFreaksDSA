import java.util.*;
public class SumOfArray{
    public static int arraySum(int[] a, int n, int i){
        if(i>=n) return 0;
        return a[i]+arraySum(a,n,i+1);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int sum = arraySum(arr,n,0);
		System.out.println("Sum of Array is "+sum);
	}
}
