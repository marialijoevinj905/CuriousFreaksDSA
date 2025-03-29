public class Palindrome{
	public static void main(String[] args) {
	    int n=5223225;
	    int sum=0,l;
	    int copy=n;
	    while(n>0){
	        l=n%10;
	        sum=10*sum+l;
	        n/=10;
	    }
	    System.out.println(sum);
	    if(copy==sum)
	        System.out.println("Number is a Palindrome");
	    else 
	        System.out.println("Number is not a Palindrome");
	}
}
