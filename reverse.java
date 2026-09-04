public class reverse {
    public static void main(String[] args) {

        String s = "saifullah";
        StringBuilder bf = new StringBuilder(s);

        int n = bf.length();
        int i = 0, j = n - 1;

        while (i <= j) {

            char temp = bf.charAt(i);

            bf.setCharAt(i, bf.charAt(j));
            bf.setCharAt(j, temp);

            i++;
            j--;
        }

        System.out.print(bf);
    }
}