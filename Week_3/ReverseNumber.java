public class ReverseNumber{
	public static void main(String[] args) {
	    int n=1234;
	    int rev=0,l;
	    while(n>0){
	        l=n%10;
	        rev=10*rev+l;
	        n/=10;
	    }
	    System.out.println(rev);
	}
}
