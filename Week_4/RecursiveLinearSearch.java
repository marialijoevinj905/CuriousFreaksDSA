import java.util.*;
public class RecursiveLinearSearch{
    public static int Search(int[] a, int n, int i, int target){
        if(a[i]==target) return i+1;
        if(i>=n) return -1;
        return Search(a,n,i+1,target);
    }
  	public static void main(String[] args) {
  		Scanner sc = new Scanner(System.in);
  		int n = sc.nextInt();
  		int[] arr = new int[n];
  		for(int i=0;i<n;i++){
  		    arr[i] = sc.nextInt();
  		}
  		int target = sc.nextInt();
  		int key = Search(arr,n,0,target);
  		if(index<0){
  		    System.out.println("Element not found");
  		}else{
  		    System.out.println("Element found at "+key+" index");
  		}
	  }
}
