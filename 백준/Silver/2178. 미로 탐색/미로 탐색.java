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
        int m = Integer.parseInt(st.nextToken());
        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = s.charAt(j)-'0';
            }
        }

        Queue<Node> queue = new LinkedList<>();
        int[][] length = new int[n][m];

        int temp_i, temp_j;

        int[] index = new int[] {1,0,-1,0};
        int[] index2 = new int[] {0,-1,0,1};

        queue.offer(new Node(0,0));
        length[0][0]=1;

        while(!queue.isEmpty()){
            Node current = queue.poll();

            for(int k=0;k<4;k++){
                temp_i = current.i+index[k];
                temp_j = current.j+index2[k];
                if(temp_i < 0 || temp_j < 0 || temp_i >= n ||temp_j >=m) continue;

                if(length[temp_i][temp_j]==0 && arr[temp_i][temp_j]==1){
                    queue.offer(new Node(temp_i,temp_j));
                    length[temp_i][temp_j]= length[current.i][current.j]+1;
                }
                else if(length[temp_i][temp_j]!=0 && length[temp_i][temp_j]>length[current.i][current.j]+1){
                        queue.offer(new Node(temp_i,temp_j));
                        length[temp_i][temp_j]= length[current.i][current.j]+1;
                }
            }
        }
        bw.write(String.valueOf(length[n-1][m-1]));
        bw.flush();
        bw.close();

    }
}
