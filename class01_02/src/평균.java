import java.util.*;
import java.io.*;

public class 평균 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[num];
        int max = 0;
        float mean = 0;
        for(int i =0;i<num;i++){
            scores[i] = Integer.parseInt(st.nextToken());
            mean += scores[i];
            if(max < scores[i]) max=scores[i];
        }
        mean = mean / max * 100 / num;
        bw.write(String.valueOf(mean));
        bw.flush();
        bw.close();

    }
}