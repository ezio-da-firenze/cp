import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else if (n == 4) {
            System.out.println("2 4 1 3");
        } else {
            int[] arr = new int[n];
            int j = 1;
            for (int i = 0; i < n; i += 2) {
                arr[i] = j;
                j++;
            }

            for (int i = 1; i < n; i += 2) {
                arr[i] = j;
                j++;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            // for (int i = 1; i <= n; i += 2) {
            // System.out.print(i + " ");
            // }
            // for (int i = 2; i <= n; i += 2) {
            // System.out.print(i + " ");
            // }
        }
    }
}
