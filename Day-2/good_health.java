/*
user will input a integer value u need to print the out in indian speaking way
i.e
 user input = 406
 output = 4 Hundred 6 
*/

import java.util.*;



public class good_health {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        if(str.length() <= 3){
            if(str.charAt(0) == "0"){
                System.out.println(str.substring(1));  
            }else{
                System.out.println(str.charAt(0)+" Hundred "+ str.substring(1));
            }
            
        }else if(str.length() <= 4){
            
            System.out.println(str.charAt(0)+" Thousands "+ str.charAt(1)+" Hundred "+str.substring(2));
        }else if(str.length() <= 5){
            System.out.println(str.substring(0,2)+" Thousands "+ str.charAt(2)+" Hundred "+str.substring(3));
        }else if(str.length() <= 6){
            System.out.println(str.charAt(0)+ " Lakh "+ str.substring(1,3) +" Thousands "+ str.charAt(3)+" Hundred "+str.substring(4));
        }else if(str.length() <= 7){
            System.out.println(str.substring(0,2)+" Lakh "+ str.substring(2,4)+" Thousands "+ str.charAt(4)+" Hundred "+str.substring(5));
        }
        else{
            int i = str.length() - 7;
            System.out.print(str.substring(0, i)+" crore "+str.substring(i,i+2) +" Lakh "+ str.substring(i+2,i+4)+" Thousand "
            + str.charAt(i+4)+" Hundred " + str.substring(i+5));
        }
    }    
}