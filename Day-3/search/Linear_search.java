import java.util.*;

class Linear_search{
    public static int search(int[] arr, int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
          System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter element in array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        display(arr);
        System.out.println("Enter iteam to search");
        int item = sc.nextInt();
        int index = search(arr,item);
        System.out.println("item present at " + index);

    }
}