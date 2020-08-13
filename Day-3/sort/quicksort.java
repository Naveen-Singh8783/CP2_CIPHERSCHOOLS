import java.util.*;


public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("Enter element in array:");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        display(arr);
        quickSort(arr, 0, size-1);
        System.out.println("After Quicksort:");
        display(arr);
    }

    // display array function
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("END");
    }
    
    public static void quickSort(int[] arr, int lo, int hi){
        //base case
        if(lo >= hi){
            return;
        }

        // partition
        int mid = (lo + hi)/2;
        int pivot = arr[mid];
        int left = lo;
        int right = hi;

        while(left <= right){

            while(arr[left] < pivot){
                left++;
            }

            while(arr[right] > pivot){
                right--;
            }

            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        } 

        //samller problems
        quickSort(arr, lo, right);
        quickSort(arr, left, hi);
    }
}