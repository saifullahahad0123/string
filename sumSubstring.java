public class sumSubstring {
 public static void main(String[] args) {
    String str = "1234";
    int n = Integer.parseInt(str);
    int sum = 0;
    int s = str.length();
    for (int i = 0 ; i < s ; i++ ){
        for(int j = i ; j<s; j++){
            String sub =  str.substring(i,j+1);
            sum  = sum + n;
            System.out.println(sub);
        }
    }
System.out.print(sum);
 }   
}
