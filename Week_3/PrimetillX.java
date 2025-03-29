public class PrimetillX{
    private static boolean findPrime(int num){
        for(int i=2;i<num;i++){
		    if(num%i==0)
		        return false;
		}    
		return true;
    }
	public static void main(String[] args) {
		int n=5;
		boolean res=findPrime(n);
		if(res){
		    System.out.println(n+" is Prime number");
		}else{
		    System.out.println(n+" is not a Prime number");
		}
	}
}
