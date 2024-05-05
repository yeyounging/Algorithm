import java.io.*;
import java.util.*;

class Node{
        int i;
        int j;

        public Node(int i, int j){
            this.i = i;
            this.j = j;
}}

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<Node> queue = new LinkedList<>();
        LinkedList<Node> nodes = new LinkedList<>();

        int temp_i, temp_j,ti,tj,sum=0, cnt=0, flag=0;

        int[] index = new int[] {1,0,-1,0};
        int[] index2 = new int[] {0,-1,0,1};

        while(true){
            int[][] included = new int[n][n];
            sum = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) {
                    if (included[i][j] == 1) continue;

                    for (int k = 0; k < 4; k++) {
                        temp_i = i + index[k];
                        temp_j = j + index2[k];
                        if (temp_i < 0 || temp_j < 0 || temp_i >= n || temp_j >= n) continue;
                        if (included[temp_i][temp_j] == 0 && Math.abs(arr[temp_i][temp_j] - arr[i][j]) >= n1 && Math.abs(arr[temp_i][temp_j] - arr[i][j]) <= n2) {
                            sum = 0;
                            queue.offer(new Node(i, j));
                            included[i][j] = 1;
                            break;
                        }
                    }
                        while (!queue.isEmpty()) {
                            Node node = queue.poll();
                            nodes.offer(node);
                            sum += arr[node.i][node.j];
                            for (int h = 0; h < 4; h++) {
                                ti = node.i + index[h];
                                tj = node.j + index2[h];
                                if (ti < 0 || tj < 0 || ti >= n || tj >= n) continue;
                                if (included[ti][tj] == 0 && Math.abs(arr[ti][tj] - arr[node.i][node.j]) >= n1 && Math.abs(arr[ti][tj] - arr[node.i][node.j]) <= n2) {
                                    queue.offer(new Node(ti,tj));
                                    included[ti][tj] = 1;
                                }
                            }
                        }
                        if (!nodes.isEmpty()) {
                            int result = sum / nodes.size();
                            while(!nodes.isEmpty()){
                                Node temp = nodes.poll();
                                arr[temp.i][temp.j] = result;
                            }
                        }
                        }
                    }
            if (sum==0) break;
            else cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }


}
