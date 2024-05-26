import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static int n,s,size,ans=0;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int i=1;i<=n;i++){
            size=i;
            yap(0,0,0);
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }

    static void yap(int index,int cnt, int sum) {
        if(cnt == size && sum==s) ans++;
        if(size == cnt) return;
        for(int i=index;i<n;i++){
            sum+=arr[i];
            yap(i+1,++cnt,sum);
            sum-=arr[i];
        }

    }
}