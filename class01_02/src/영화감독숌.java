//더 효율적인 방법 생각하기.

import java.io.*;
import java.util.*;

public class 영화감독숌 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int cnt =1;
        int i = 666;
        while(cnt != num){
            i++;
            if(String.valueOf(i).contains("666")) cnt++;
        }
        bw.write(String.valueOf(i));
        bw.flush();
        bw.close();

    }


}
