import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearLuckyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int count = 0;

        while (n != 0) {
            long dig = n % (long) 10;
            if (dig == 4 || dig == 7) {
                count++;
            }
            n = n / 10;
        }
        
        if ((count == 4) || (count == 7)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
