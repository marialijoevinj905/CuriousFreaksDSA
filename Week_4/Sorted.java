import java.util.*;
public class Sorted{
    public static boolean isSorted(int[] a, int n, int i){
        if(i>=n-1) return true;
        if(a[i]>a[i+1]) return false;
        return isSorted(a,n,i+1);
    }
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  		int[] arr = new int[n];
  		for(int i=0;i<n;i++){
  		    arr[i] = sc.nextInt();
  		}
  		boolean sorted = isSorted(arr,n,0);
  		if(sorted) System.out.println("Array is Sorted");
  		else System.out.println("Array is not Sorted");
  	}
}
