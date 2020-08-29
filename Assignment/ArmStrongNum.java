import java.util.*;
public class ArmStrongNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
	int sum=0;
        int n=N1;         
            int length = String.valueOf(N1).length();
            
            while(n>0){
                int rem = n%10;
                n=n/10;
                sum = sum +(int) (Math.pow(rem,length));
            }
            
           if(sum == N1){
                System.out.println("ArmStrong number");
                
            }else{
		System.out.println("Not a ArmStrong number");
	}	

       
     



    }
}