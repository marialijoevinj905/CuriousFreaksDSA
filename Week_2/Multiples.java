import java.util.Scanner;

public class Multiples{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i<=1000;i+=n){
            System.out.println(i);
        }
    }
}