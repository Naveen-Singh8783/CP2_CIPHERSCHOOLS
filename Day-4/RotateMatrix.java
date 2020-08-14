class RotateMatrix{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        display(arr);
        transposeMatrix(arr);
       /*  System.out.println("after transpose:");
        display(arr); */
        System.out.println("after 90 degree rotation:");
        reverseMatrix(arr);
        display(arr);


    }

    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverseMatrix(int[][] arr){
        for(int z=0;z<arr.length;z++){
            int i=0;
            int j=arr.length-1;
            while(i<j){
                int temp = arr[z][i];
                arr[z][i] = arr[z][j];
                arr[z][j] = temp;
                i++;
                j--;
            }
        }
    }
}