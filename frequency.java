import java.util.Arrays;

public class frequency {

    public static void main(String[] args) {

        // String str = "ssaa";
        // char[] ch = str.toCharArray();

        // int maxFrequency = 0;
        // char answer = Character.MAX_VALUE;

        // for (int i = 0; i < ch.length; i++) {

        //     int frequency = 0;

        //     for (int j = 0; j < ch.length; j++) {

        //         if (ch[i] == ch[j]) {
        //             frequency++;
        //         }
        //     }

        //     if (frequency > maxFrequency) {
        //         maxFrequency = frequency;
        //         answer = ch[i];
        //     }

        //     if (frequency == maxFrequency && ch[i] < answer) {
        //         answer = ch[i];
        //     }
        // }

        // System.out.println(answer+ " " + maxFrequency);

        String s = " aabbcccd";

        int n = s.length();

        int maxFreq = 0;

        char ans = s.charAt(0);

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        int i = 0;
        int j = 0;

        while (j < n) {

            if (arr[i] == arr[j]) {
                j++;
            } 
            else {

                int freq = j - i;

                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                }

                i = j;
            }
        }

        // Process the last character group
        int freq = j - i;

        if (freq > maxFreq) {
            maxFreq = freq;
            ans = arr[i];
        }

        System.out.print(ans + " " + maxFreq);;
    }
}
