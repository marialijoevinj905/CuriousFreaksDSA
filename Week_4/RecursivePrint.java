import java.util.*;
public class RecursivePrint{
    public static void printArray(int[] a, int n, int i){
        if(i>=n) return;
        System.out.println(a[i]);
        printArray(a,n,i+1);
    }
	  public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  		int[] arr = new int[n];
  		for(int i=0;i<n;i++){
  		    arr[i] = sc.nextInt();
  		}
  		System.out.println("printing array elements recursively");
  		printArray(arr,n,0);
	}
}
