import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elephant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int ans = x / 5;
        if(x % 5 != 0){
            ans++;
        }
        System.out.println(ans);

    }

}
