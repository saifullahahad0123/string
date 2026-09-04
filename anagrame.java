import java.util.*;
public class anagrame {
    public static void main(String[] args) {
        String S1 = "last";
        String S2 = "salf";
        char[] arr1 = S1.toCharArray();
        char[] arr2 = S2.toCharArray();
        boolean bo = false;
        if (S1.length() != S2.length()){
            bo = false;
             
        }
        else{
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] == arr2[i]){
                bo = true;
               
            }
            else{
                bo = false;
               
            }
        }}
        System.out.print(bo);
    }
}
