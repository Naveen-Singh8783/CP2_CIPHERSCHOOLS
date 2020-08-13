import java.util.*;
public class selectionsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        long A[] = new long[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }

        selectionsort(A);

        for(int i=0;i<size;i++){
            System.out.println(A[i]);
        }

    }

    public static void selectionsort(long[] A){
        for(int counter=0;counter<A.length-1;counter++){
            int min = counter;

            for(int i=counter;i<A.length;i++){
                if(A[min]>A[i]){
                    min = i;
                }
            }
            long temp = A[min];
            A[min] = A[counter];
            A[counter] = temp;
        }
    }
}