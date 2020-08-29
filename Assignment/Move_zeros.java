class Move_zeros {
    public void moveZeroes(int[] nums) {
        int begin = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[begin] = nums[i];
                begin++;
            }else{
                count++;
            }
        
        }
        
        while(count != 0){
            nums[begin] = 0;
            count--;
            begin++;
        }
        
    }
}