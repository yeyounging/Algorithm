import java.io.*;

public class 설탕배달 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int num_5 = 0;
        int num_3 = 0;

        while(num > 0 && num%5 != 0){
            num_3++;
            num-=3;
        }
        num_5 = num /5;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (num < 0) bw.write("-1");
        else bw.write(String.valueOf(num_3+num_5));
        bw.flush();
        bw.close();

    }
}
