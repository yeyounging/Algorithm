import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Index{
    int i;
    int j;

    public Index(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

public class 그림{
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int size_i = Integer.parseInt(st.nextToken());
        int size_j = Integer.parseInt(st.nextToken());

        int[][] visited = new int[size_i][size_j];
        int[][] grid = new int[size_i][size_j];

        for (int i = 0; i < size_i; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size_j; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] index = new int[] {1,0,-1,0};
        int[] index2 = new int[] {0,-1,0,1};

        Queue<Index> queue= new LinkedList<>();

        int cnt = 0;
        int max_area = 0;
        int temp_i, temp_j;

        for(int i=0;i<size_i;i++){
            for(int j=0;j<size_j;j++){
                if(visited[i][j]==0){
                    visited[i][j]=1;

                    if(grid[i][j]==1){
                        int area = 1;
                        cnt++;
                        queue.offer(new Index(i,j));
                        while(!queue.isEmpty()){
                            Index current = queue.poll();
                            for(int k=0;k<4;k++){
                                temp_i = current.i+index[k];
                                temp_j = current.j+index2[k];
                                if(temp_i < 0 || temp_j < 0 || temp_i >= size_i ||temp_j >=size_j) continue;

                                if(visited[temp_i][temp_j]==0){
                                    visited[temp_i][temp_j]=1;
                                    if(grid[temp_i][temp_j]==1){
                                        area++;
                                        queue.offer(new Index(temp_i,temp_j));
                                    }}}
                        }
                        if(area > max_area) max_area =area;
                    }}}}
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(cnt+" "+max_area);
        bw.flush();
        bw.close();
    }}