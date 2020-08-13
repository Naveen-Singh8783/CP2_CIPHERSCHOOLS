import java.util.*;

class prime{

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
	boolean check= true;
       for(int i=2;i<n;i++){
		if(n%i == 0){
		check = false;
		}
	
	}
	if(check || n == 2){
		System.out.println("prime number");
	}else{
		System.out.println("Not Prime number");
	}

    }
}