import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int maxLen = 1; // "AAAGGCTTGCAA"
        int newMax = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                newMax++;
                if (newMax > maxLen) {
                    maxLen = newMax;
                }
            } else {
                newMax = 1;
            }
        }
        System.out.println(maxLen);

    }
}