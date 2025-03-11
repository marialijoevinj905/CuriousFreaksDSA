/*
4 3 2 1
3 2 1
2 1
1
*/
public class Main{
  public static void main(String[] args){
    int n=4;
    for(int i=n;i>=1;i--){
      for(int j=i;j>0;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}
