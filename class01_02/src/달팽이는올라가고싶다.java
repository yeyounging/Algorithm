import java.io.*;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double up = Integer.parseInt(st.nextToken());
        double down = Integer.parseInt(st.nextToken());
        float goal = Integer.parseInt(st.nextToken());

        int answer = (int) (Math.ceil((goal-up)/ (up-down)) +1);
        System.out.println(answer);
    }
}

