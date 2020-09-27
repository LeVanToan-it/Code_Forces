import java.util.*;
 
  class demo{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int a = 0;
    int b = 0;
 
    int T = sc.nextInt();
    int N;
 
    for(int i = 0; i<T; i++){
      N = sc.nextInt();
      while(N!=0){
        if(N%2!=0){
          a++;
          N--;
          b = b + N/2;
          N = N/2;
        }else{
          a = a + N/2;
          N = N/2;
          if(N%2==0){
            b = N/2;
            N = N/2;
          }else{
            b++;
            N--;
          }
        }
      };
      System.out.println(a);
      a = 0;
    }
  }
}