import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static int[] contain;
    static int k,n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        //1~k까지 n개
        //길이가 n -> print, return

        arr = new int[n];
        contain = new int[k+1];

        for(int i=1;i<=k;i++){
            arr[0] = i;
            contain[i] =1;
            yap(1);
            contain[i] = 0;
        }

        bw.flush();
        bw.close();
    }

    static void yap(int index){
        if(index==n) {
            for(int i : arr) System.out.print(i+" ");
            System.out.print("\n");
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