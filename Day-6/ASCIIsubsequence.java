import java.util.*;
public class ASCIIsubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        String result = "";
        printSS(str,result);
    }

    public static void printSS(String str, String result){
        if(str.length() == 0){
            if(result == ""){
                return;
            }
            System.out.print(result+", ");
            return;
        }

        char cc=str.charAt(0);
        String ros = str.substring(1);

        printSS(ros, result);
        printSS(ros, result+cc);
        printSS(ros, result+(int)cc);
    }
}