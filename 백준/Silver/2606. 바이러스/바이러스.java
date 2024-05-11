import java.io.*;
import java.util.*;

//재귀+인접행렬로 구현

public class Main {
    static int num;
    static int cnt=0;
    static boolean [][] adj;
    static boolean [] visited;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        num = Integer.parseInt((br.readLine()));
        int num2 = Integer.parseInt((br.readLine()));
        
        adj = new boolean[num][num];
        visited = new boolean[num];

        for(int i =0;i<num2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken())-1;
            int n2 = Integer.parseInt(st.nextToken())-1;
            adj[n1][n2] = true;
            adj[n2][n1] = true;
        }

        dfs(0);

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }

    static void dfs(int n){
        for(int i =1;i<num;i++){
            if(adj[n][i]==true && visited[i]==false) {
                visited[i]=true;
                cnt++;
                dfs(i);
            }
        }
    }
}
