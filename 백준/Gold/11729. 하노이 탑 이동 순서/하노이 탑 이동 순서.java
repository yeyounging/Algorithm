import java.io.*;

public class Main {
    static int n,cnt=0;
    static BufferedWriter bw;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());

        yap(n,1,3);
        bw.write(cnt+"\n"+String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    static void yap(int num, int current, int goal) throws IOException {
        cnt++;
        if(num ==1){
            sb.append(current+" "+goal+"\n");
            return;
        }
        int next=0;
        for(int i=1;i<=3;i++){
            if(i == current || i == goal) continue;
            next = i;
        }
        yap(num-1, current,next);
        sb.append(current+" "+goal+"\n");
        yap(num-1, next, goal);
    }

}