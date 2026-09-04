public class reverseWord {

    public static void main(String[] args) {

        String str = "my name is saifullah";
        StringBuilder bf = new StringBuilder(str);

        int n = bf.length();

        int i = 0;
        int j = 0;

        while (j <= n) {

           
            if (j == n || bf.charAt(j) == ' ') {

                int left = i;
                int right = j - 1;
                while (left < right) {

                    char temp = bf.charAt(left);

                    bf.setCharAt(left, bf.charAt(right));
                    bf.setCharAt(right, temp);

                    left++;
                    right--;
                }

                
                i = j + 1;
            }

            j++;
        }

        System.out.print(bf);
    }
}