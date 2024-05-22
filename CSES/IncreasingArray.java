import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> nums = new ArrayList<>(n);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        BigInteger inversions = BigInteger.ZERO;
        for (int j = 0; j < nums.size() - 1; j++) {
            if (nums.get(j) > nums.get(j + 1)) {
                BigInteger curr = BigInteger.valueOf(nums.get(j));
                BigInteger next = BigInteger.valueOf(nums.get(j + 1));

                inversions = inversions.add(curr.subtract(next));
                nums.set(j + 1, nums.get(j));
            }
        }
        System.out.println(inversions);
    }
}
