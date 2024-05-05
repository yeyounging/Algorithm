import java.io.*;

public class Main{
    public static void main (String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int input = Integer.parseInt(br.readLine());
            boolean mode = true; //첫번째 수가 버려지는 경우
            int firstN = 1;
            int interval = 1;

            for( int i=input ; i!=1; i=i/2 ) {
                if(mode == true) firstN = firstN+interval;
                interval *=2;
                if(i % 2 != 0){
                    if(mode == false) i++;
                    mode=!mode;
                }
            }
            bw.write(String.valueOf(firstN));
            bw.flush();
            bw.close();
        }
}