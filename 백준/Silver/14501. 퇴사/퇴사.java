import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num+1];
        int[] time = new int[num];
        int[] profit = new int[num];

        for(int i=0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            profit[i] = Integer.parseInt(st.nextToken());
            }

        for(int i = num-1; i>=0 ; i--){
            if(i+time[i] > num) dp[i] = dp[i+1];
            else dp[i] = Math.max((profit[i]+dp[i+time[i]]),dp[i+1]);
        }
         bw.write(String.valueOf(dp[0]));
         bw.flush();;
         bw.close();
    }
}