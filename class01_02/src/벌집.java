import java.io.*;

public class 벌집 {
    public static void main (String args[]) throws IOException {
        //1 2 8 20 38 62
        //1 6 12 18 24
        //1 2 3  4  5  6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());

        int i=1;

        for(int temp=input-2;temp>=0;i++){
            temp = temp - 6*i;
        }

        int result = (input==2? 2: i);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}
