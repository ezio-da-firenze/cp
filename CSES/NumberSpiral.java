import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<Long> results = new ArrayList<>();
        while (t-- != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            results.add(solve(x, y));
        }
        for (Long num : results) {
            System.out.println(num);
        }
    }

    public static long solve(int x, int y) {
        long innerArea = 0;
        if (y > x) {
            innerArea = (y - 1) * (y - 1);
            if (y % 2 == 0) {
                innerArea += 2 * y - x;
            } else {
                innerArea += x;
            }
        } else {
            innerArea = (x - 1) * (x - 1);
            if (x % 2 != 0) {
                innerArea += 2 * x - y;
            } else {
                innerArea += y;
            }
        }

        return innerArea;
    }
}