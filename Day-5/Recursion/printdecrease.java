class printdecrease{
    public static void main(String[] args) {
        printIncOrder(5);
    }

    public static void printIncOrder(int n){
        if(n == 0){
            return;
        }

        
        printIncOrder(n-1);
        System.out.println(n);
    }
}