class pow{
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        System.out.print(power(a,b));
    }

    public static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        a = a * power(a,b-1);
        return a;


    }
}