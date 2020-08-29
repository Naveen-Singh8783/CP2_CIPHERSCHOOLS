import java.util.*;

class pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total row");
        int n = sc.nextInt(); 
        display(n);
        System.out.println("After 180 degree rotation");
        display_180(n);
        System.out.println("triangle ");
        display_triangle(n);
    }

    public static void display(int n){
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }

    public static void display_180(int n){
        int space=n-1;
        for(int i=0;i<n;i++){

            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
       
    }


    public static void display_triangle(int n){
        int space=n/2;
        for(int i=0;i<n;i++){

            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
       
    }



}