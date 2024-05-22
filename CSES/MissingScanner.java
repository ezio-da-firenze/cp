import java.util.ArrayList;
import java.util.Scanner;

public class MissingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(n);
        for (int i = 1; i <= n - 1; i++) {
            nums.add(sc.nextInt());
        }
        int numSum = 0;
        for (int i = 1; i <= n; i++) {
            numSum += i;
        }
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println(numSum - sum);
        sc.close();
    }
}
