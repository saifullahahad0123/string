import java.util.*;

public class palindrome{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
int n = s.length();
       int i = 0, j = n-1;
boolean bo = false;
        while (i<j) {
           if(s.charAt(i) == s.charAt(j)){
       bo = true;
           } 
            i++;
             j--;

        } 

        System.out.println(bo);
    }
}