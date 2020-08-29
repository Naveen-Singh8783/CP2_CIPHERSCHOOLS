class printDecthanInc{
    public static void main(String[] args) {
        printnum(7,7);
    }

    public static void printnum(int n,int n1){
        if(n == n1-1){
            return;
        }
        
        System.out.println(n);
        if(n  == 1){
            printnum(n-1,n1);
        }else if(n%2!=0){
            printnum(n-2,n1);
        }else{
            printnum(n+2,n1); 
        }
        
       
    }
}