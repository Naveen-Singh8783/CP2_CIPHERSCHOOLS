import java.util.*;
public class insertionsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long A[] = new long[size];
        for(int i=0;i<size;i++){
            A[i]  = sc.nextInt();
        }

        insertionsort(A);

        for(int i=0;i<size;i++){
            System.out.print(A[i]+" ");
        }

    }

    public static void insertionsort(long[] A){
        for(int counter=1;counter<=A.length-1;counter++){
            long val = A[counter];

            int j = counter-1;
            while(j>=0 && A[j]>val){
                A[j+1] = A[j];
                j--;
            }

            A[j+1] = val;
        }
    }
}