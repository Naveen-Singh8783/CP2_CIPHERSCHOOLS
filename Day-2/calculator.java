class calculator{
    public static void main(String[] args){
        int[] result = calculate(4, 5);
        System.out.println("add = "+ result[0]);
        System.out.println("sub = "+ result[1]);
        System.out.println("mul = "+ result[2]);
        System.out.println("div = "+ result[3]);

    }

    public static int[] calculate(int a, int b){
        int[] result = new int[4];
        result[0] = a+b;
        result[1] = a-b;
        result[2] = a*b;
        result[3] = a/b;
        return result;
    }
}
