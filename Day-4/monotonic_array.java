class monotonic_array{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        boolean max_check = true;
        boolean check = isMonotonic(arr);
        if(check){
            System.out.println("Monotonic");
        }else{
            System.out.println("Non-Monotonic");
        }
    
    }

    public static boolean isMonotonic(int[] A) {
        boolean non_increasing = true;
        boolean non_decreasing = true;
        
        
        for(int i=0; i< A.length-1; i++){
            if(A[i] < A[i+1]){
                non_decreasing = false;
            }
            
             if(A[i] > A[i+1]){
                non_increasing = false;
            }
        }
        
        return (non_increasing || non_decreasing);
        
    }
}