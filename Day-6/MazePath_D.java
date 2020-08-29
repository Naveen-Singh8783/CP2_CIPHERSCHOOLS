import java.util.*;
public class MazePath_D {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        String ans = "";
        
        int count = countMazePath(0,0,N1,N2);
        System.out.println();
        System.out.println(count);
    }

    public static int countMazePath(int cr, int cc, int er, int ec){
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > er || cc > ec){
            return 0;
        }
        int r1 = countMazePath(cr+1,cc,er,ec);   
        int r2 =countMazePath(cr,cc+1,er,ec);
        int r3 =countMazePath(cr+1,cc+1,er,ec);

        int result = r1 + r2+ r3;
        return result;
        
    }
}
