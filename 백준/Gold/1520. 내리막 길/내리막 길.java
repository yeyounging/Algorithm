import java.io.*;
import java.util.StringTokenizer;

public class Main{
    static int n,k;
    static int[][] arr;
    static boolean[][] visited;
    static int[][] dp;
    static int[] dx = {0,-1,0,1};
    static int[] dy = {1,0,-1,0};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n][k];
        visited = new boolean[n][k];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<k;j++)
                arr[i][j] = Integer.parseInt(st.nextToken());
        }
        dp = new int[n][k];
        dp[n-1][k-1]=1;

         bw.write( dfs(0,0)+"");
         bw.flush();;
         bw.close();
    }

    static int dfs(int i , int j){
        int cnt=0;

        for(int h = 0; h <4;h++){
            int temp_i = i + dx[h];
            int temp_j = j+ dy[h];

            if(temp_i < 0 || temp_j < 0 || temp_i >= n ||temp_j >=k) continue;
            if(arr[i][j] > arr[temp_i][temp_j]) {
                if(dp[temp_i][temp_j]==0 && visited[temp_i][temp_j] == false)
                    cnt+=dfs(temp_i,temp_j);
                else
                    cnt+= dp[temp_i][temp_j];
            }
        }
        visited[i][j] = true;
        return dp[i][j] = cnt;
    }


}