/*
 remove duplicate elements in a given sorted array 
 space complexity = O(1);
 Time complexity = O(n);
*/

class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,1,2,2,2,3,4,5,6,6,6,6};

        int size = removeDuplicates(nums);
        for(int i=0;i<=size;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(i == 0 || nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }
}