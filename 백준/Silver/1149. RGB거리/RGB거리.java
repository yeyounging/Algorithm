import java.io.*;
import java.util.StringTokenizer;

public class Main{

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[] r = new int[num];
        int[] g = new int[num];
        int[] b = new int[num];

        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            r[i] = Integer.parseInt(st.nextToken());
            g[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            }

        int[][] dp = new int[num][3];
        dp[0][0] = r[0];
        dp[0][1] = g[0];
        dp[0][2] = b[0];

        for(int i=1;i<num;i++){
            dp[i][0] = r[i]+Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = g[i]+Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = b[i]+Math.min(dp[i-1][0],dp[i-1][1]);
        }

         bw.write( Math.min(Math.min(dp[num-1][0],dp[num-1][1]),dp[num-1][2])+"");
         bw.flush();;
         bw.close();
    }



}