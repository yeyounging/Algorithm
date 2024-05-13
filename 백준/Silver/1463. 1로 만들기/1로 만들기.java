import java.io.*;

public class Main{
    static int[] dp;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        dp = new int[num+1];
        if(num>1) dp[2] = 1;

         math(num);
         bw.write(dp[num]+"");
         bw.flush();;
         bw.close();
    }

    static void math(int n){
        if(n==1 || n==2) return;

        if(n % 3 == 0 || n%2 == 0 || dp[n-1]==0 ) {
            if(dp[n/3] == 0) {
                math(n/3);
            }
            if(dp[n/2]== 0){
                math(n/2);
            }
            if(dp[n-1]==0)
                math(n-1);
        }

        if (n%3==0 && n%2 == 0)
            dp[n] = Math.min(dp[n/3],Math.min(dp[n/2],dp[n-1]))+1;
        else if(n%3 == 0){
            dp[n] = Math.min(dp[n/3], dp[n-1])+1;
        }
        else if(n%2 == 0){
            dp[n] = Math.min(dp[n-1],dp[n/2])+1;
        }
        else {
            dp[n] = dp[n-1]+1;
        }

    }


}