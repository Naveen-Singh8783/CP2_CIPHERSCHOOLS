class Rotate_Array {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0, k-1);
        reverse(nums,k,nums.length-1);
        
        
    }
    public static void reverse(int[] nums,int lo,int hi){
        if(hi == 0)
            return;
        
        while(lo<hi){
            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;
            lo++;
            hi--;
        }
    }
}