import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt((br.readLine()));
        int num2 = Integer.parseInt((br.readLine()));

        boolean [][] adj = new boolean[num][num];
        boolean [] visited = new boolean[num];

        for(int i =0;i<num2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
                int n1 = Integer.parseInt(st.nextToken())-1;
                int n2 = Integer.parseInt(st.nextToken())-1;
                adj[n1][n2] = true;
                adj[n2][n1] = true;
        }
        int cnt=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0]=true;

        while(!stack.isEmpty()){
            int n = stack.pop();
            cnt++;
            for(int i =0;i<num;i++){
                if(adj[n][i]==true && visited[i]==false) {
                    stack.push(i);
                    visited[i]=true;
                }
            }
        }
        bw.write(String.valueOf(cnt-1));
        bw.flush();
        bw.close();
    }


}
