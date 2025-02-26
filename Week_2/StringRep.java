import java.util.Scanner;
public class StringRep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        int n = sc.nextInt();
        String fullName = firstName + secondName;
        for(int i=0;i<n;i++){
            System.out.println(fullName);
        }   
    }
}
