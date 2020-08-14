class Largest_cont_sum{
    public static void main(String[] args) {
        int[] a = {-2,-3,-5,-2,3,-4};
        int cs = 0;
        int ms = 0;
        for(int i=0;i<a.length;i++){
           cs += a[i];
           if(cs < 0){
                cs=0;
           }

           if(ms<cs){
               ms = cs;
           }
        } 

        System.out.println(ms);
    }
   
}  