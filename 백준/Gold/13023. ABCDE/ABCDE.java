import java.io.*;
import java.util.*;

public class Main {
    static int num, flag=0;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        num = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        for(int i=0;i<num;i++)
            adj.add(new ArrayList<>());

        for(int i =0;i<num2;i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            adj.get(n1).add(n2);
            adj.get(n2).add(n1);
        }

        for(int i=0;i<num;i++){

            boolean[] visited = new boolean[num];
            dfs(i,0,visited);
            if(flag ==1) {
                bw.write("1");
                bw.flush();
                bw.close();
                return;
            }
        }
        bw.write("0");
        bw.flush();
        bw.close();
    }

    static void dfs(int n, int cnt,boolean[] arr){
        boolean[] visited = Arrays.copyOf(arr,num);
        visited[n]=true;
        for(int i : adj.get(n)){
            if(visited[i] == false){
                if(cnt+1 == 4) {
                    flag = 1;
                    return;
                }
                dfs(i,cnt+1,visited);
            }
        }
    }
}
