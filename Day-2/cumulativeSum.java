import java.util.*;

class cumulativeSum {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a[] = new int[n];
      int b[] = new int[n];
      
      for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
      }

      b[0] = a[0];
      for(int i=1;i<n;i++){
          b[i] = b[i-1] + a[i];
      }

      for(int i=0;i<n;i++){
          System.out.print(b[i]+" ");
      }
    }
}