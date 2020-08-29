class printIncrease{
    public static void main(String[] args) {
        printIncOrder(5);
    }

    public static void printIncOrder(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        printIncOrder(n-1);
    }
}