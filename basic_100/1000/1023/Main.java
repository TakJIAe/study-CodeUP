import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String arr[] = num.split("\\.");
        System.out.printf("%s\n%s", arr[0], arr[1]);
    }
}
