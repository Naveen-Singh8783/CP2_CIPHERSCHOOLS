import java.util.*;

class sumofenternum{

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
	int sum = 0;
       for(int i=1;i<=n;i++){
		int num = sc.nextInt();
		sum = sum + num;
	
	}
	System.out.println(sum);

    }
}