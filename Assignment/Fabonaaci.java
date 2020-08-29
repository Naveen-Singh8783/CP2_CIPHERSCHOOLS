import java.util.*;

class Fabonaaci{

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till Fabonacci Want:");
        n = sc.nextInt();
        int first = 0;
        int second = 1;
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print(sum+" ");
            first=second;
            second=sum;
            sum=first+second;
        }


    }
}