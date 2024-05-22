import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WrongSubtraction {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        while (b-- != 0) {
            if(a % 10 == 0){
                a = a / 10;
            }
            else if(a % 10 != 0){
                a = a - 1;
            }
        }
        System.out.println(a);
    }
}
