import java.util.*;
public class InsertionSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int key,j;
		for (int i=1;i<n;i++) {
            key = arr[i];    
            j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
		for(int num:arr){
		    System.out.print(num+" ");
		}
	}
}
