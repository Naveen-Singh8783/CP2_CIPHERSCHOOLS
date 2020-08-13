import java.util.*;
class mergesort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        System.out.println("Enter element in array: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        printarray(arr);
        arr = mergeSort(arr,0,size-1);
        System.out.println();
        System.out.println("after sorting: ");
        printarray(arr);
    }

    public static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //mergesort alogrithium for sorting of array.


  public static int[] mergeSort(int[] arr,int low,int high){
        if(low == high){
            int[] br = new int[1];
            br[0] = arr[low];
            return br;
        }

        int mid = (low + high) / 2;
        int[] fh = mergeSort(arr, low, mid);
        int[] sh = mergeSort(arr,mid+1,high);
        int[] merged = mergertwoarray(fh,sh);
        return merged;
  }

  public static int[] mergertwoarray(int[] arr1, int[] arr2){
        int[] merge = new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                merge[k] = arr1[i];
                i++;
                k++;
            }else{
                merge[k] = arr2[j];
                j++;
                k++;
            }
        }

        if(i == arr1.length){
            while(j<arr2.length){
                merge[k] = arr2[j];
                j++;
                k++;
            }
        }

        if(j == arr2.length){
            while(i<arr1.length){
                merge[k] = arr1[i];
                i++;
                k++;
            }
        }

        return merge;
  }
}