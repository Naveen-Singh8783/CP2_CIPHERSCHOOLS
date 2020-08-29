import java.util.*;

class swastika{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col:");
        int n = sc.nextInt();
        display(n);
    }

    public static void display(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<n/2){

                    if(j<n/2){
                        if(j == 0){
                            System.out.print("*");
                        }else{
                            System.out.print(" "+" ");
                        }

                    }else if(j == n/2){
                        System.out.print(" *");
                    }else{
                        if(i == 0){
                            System.out.print(" *");
                        }
                    }
                  
                 
                }else if(i == n/2){
                    System.out.print("* ");
                }else{

                    if(j==n/2 || j==n-1){
                        System.out.print("* ");
                    }else if(i == n-1){
                        if(j<=n/2 || j == n-1){
                            System.out.print("* ");
                        }else{
                            System.out.print(" "+" ");
                        }
                    }else{
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}