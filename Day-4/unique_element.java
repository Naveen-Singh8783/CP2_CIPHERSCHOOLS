import java.util.*;

class unique_element{
    public static void main(String[] args) {
        int[] a = {0,0,0,1,1,1,1,2,2,2,3,4,5,6,6,6,6};
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(a[0]);
        for(int i=1;i<a.length;i++){
            if(a[i] != a[i-1]){
                al.add(a[i]);
            }
        }

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}