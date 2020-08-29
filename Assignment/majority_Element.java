class majority_Element {
    public int majorityElement(int[] nums) {
        int count = 0;
        int retval = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0 )
                retval = nums[i];
            
            if(retval == nums[i])
                count++;
            else
                count--;
                      
          
        }
        return retval;
        
    }
}