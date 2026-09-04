 public class compression {

    public static void main(String[] args) {

        String s = "aaabbzztKKaa";

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;

        while (j < s.length()) {

            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }

            
            ans.append(s.charAt(i));

           
            ans.append(j - i);

            
            i = j;
        }

        System.out.println(ans);
    }
} 
    
