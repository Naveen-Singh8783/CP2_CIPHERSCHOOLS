import java.util.*;

class rhombus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int n = sc.nextInt();
        display(n);
        System.out.println("Hollow Rhombus:");
        display_hollow(n);
    }

    public static void display(int n){
        int space = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }

            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }


    public static void display_hollow(int n){
        int space = n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }

            for(int j=0;j<n;j++){
                if(i == 0 || i == n-1){
                    System.out.print("*");
                }else{
                    if(j==0 || j == n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                
            }
            space--;
            System.out.println();
        }
    }
}