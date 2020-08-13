import java.util.*;
public class Bubblesort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long A[] = new long[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }
        bubblesort(A);
        for(int i=0;i<size;i++){
            System.out.println(A[i]);
        }
    }

    public static void bubblesort(long[] A){
        for(int counter=0;counter<A.length-1;counter++){
            for(int i=0;i<A.length-1-counter;i++){
                if(A[i]>A[i+1]){
                    long temp = A[i];
                    A[i]=A[i+1];
                    A[i+1]=temp;
                }
            }
        }
    }
}