import java.util.*;

class primeSeries{

    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        n = sc.nextInt();
		
       for(int i=2;i<=n;i++){
		boolean check = true;
		for(int j=2;j<i;j++){
			if(i%j == 0){
			check = false;
			}

		}
		if(check){
		System.out.print(i+" ");
		}
	
	}
	

    }
}