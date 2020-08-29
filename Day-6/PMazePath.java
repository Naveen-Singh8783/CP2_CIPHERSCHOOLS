import java.util.*;
public class PMazePath {
    static int count = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        String ans = "";
        printMazePath(0,0,N1,N2,ans);
        System.out.println();
        System.out.println("With Diagonal move:");
        String ans2 = "";
        printMazePathwithD(0,0,N1,N2,ans2);
    }

    public static void printMazePath(int cr, int cc, int er, int ec, String ans){
        if(cr == er && cc == ec){
            System.out.print(ans+" ");
            return;
        }

        if(cr > er || cc > ec){
            return;
        }
        printMazePath(cr+1,cc,er,ec,ans+"V");
        printMazePath(cr,cc+1,er,ec,ans+"H");
       
    }

    public static void printMazePathwithD(int cr, int cc, int er, int ec, String ans){
        if(cr == er && cc == ec){
            System.out.print(ans+" ");
            return;
        }

        if(cr > er || cc > ec){
            return;
        }
        printMazePathwithD(cr+1,cc,er,ec,ans+"V");
        printMazePathwithD(cr,cc+1,er,ec,ans+"H");
        printMazePathwithD(cr+1,cc+1,er,ec,ans+"D");
       
    }

   
}
