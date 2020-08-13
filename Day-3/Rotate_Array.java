import java.util.*;

class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("rotate value:");
        int k = sc.nextInt();
        
        reverse(a, 0 , size-1);
        reverse(a,0, (size-1)-k);
        reverse(a,(size-1)-k+1, size-1);
        System.out.println("after rotate:");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void reverse(int[] nums,int from,int to){
        while(from < to){
            int temp = nums[from];
            nums[from] = nums[to];
            nums[to] = temp;
            from++;
            to--;
        }
    }
}