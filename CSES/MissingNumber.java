import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList<>(n);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n - 1; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        int numSum = 0;
        for (int i = 1; i <= n; i++) {
            numSum += i;
        }
        int sum = nums.stream().reduce(0, (element1, element2) -> element1 + element2);
        System.out.println(numSum - sum);

    }
}
