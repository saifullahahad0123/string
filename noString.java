import java.util.*;

public class noString{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

       String n = "" + s;
        System.out.println("Number of words = " + n.length());
    }
}