import java.io.*;
import java.util.*;

public class 수정렬하기2 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());

        int[] input = new int[size];

        for(int i =0;i<size;i++){
            input[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(input);

        for(int i =0;i<size;i++){
            bw.write(String.valueOf(input[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();



    }


}
