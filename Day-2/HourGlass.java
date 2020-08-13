import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n;
        int space =0;
        for(int i=1;i<=n+1;i++){
            int num = n1;
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            space++;

            while(num >= 0){
                System.out.print(num+" ");
                num--;
            }
            num=num + 2;
            while(num<=n1){
                System.out.print(num+" ");
                num++;
            }
            n1--;
            System.out.println();
            

        }


        space=space-2;
        n1=1;




        for(int i=1;i<=n;i++){
            int num = n1;
            int j=0;
            while(j<space){
                System.out.print("  ");
                j++;
            }
            space--;

            while(num >= 0){
                System.out.print(num+" ");
                num--;
            }
            num=num + 2;
            while(num<=n1){
                System.out.print(num+" ");
                num++;
            }
            n1++;
            System.out.println();
            

        }

    }
    
}