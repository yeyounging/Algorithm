import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static int[] contain;
    static int k,n;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n];
        contain = new int[k+1];

        yap(0);

        bw.flush();
        bw.close();
    }

    static void yap(int index) throws IOException {
        if(index==n) {
            for(int i : arr) bw.write(i+" ");
            bw.newLine();
            contain[arr[index-1]] =0;
            return;
        }
        for(int i=1;i<=k;i++) {
            if(contain[i] == 1) continue;
            arr[index] =i;
            contain[i] =1;
            yap(index+1);
            contain[arr[index]]=0;
        }
}
        }