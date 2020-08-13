import java.util.*;

class shuffle_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int n=4;
        shuffle(nums, n);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }

    public static void shuffle(int[] nums, int n) {
        int j=n;
        for(int i=1;i<nums.length;i=i+2){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++; 
        }  
    }

}