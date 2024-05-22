import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDesktop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int s = 0, sy = 0, sx = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 0) {
                sx = 0;
            }
            if (y == 0) {
                sy = 0;
            } else if (y <= 2) {
                sy = 1;
            } else if (y > 2) {
                sy = 1 + (int) Math.ceil((y - 2) / 2.0);
            }
            int rem = (5 * 3 * sy) - 4 * y;
            if (x <= rem) {
                sx = 0;
            } else {
                int req = x - rem;
                sx += (int) Math.ceil((double) req / 15);

            }
            s = sx + sy;
            res.add(s);
        }
        sc.close();
        for (Integer num : res) {
            System.out.println(num);
        }
    }
}
