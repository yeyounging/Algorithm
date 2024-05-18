import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i =0; i < num ; i++){
            char input[] = br.readLine().toCharArray();
            int cnt = 0; // '(' 카운트
            
            for(int j = 0;j<input.length;j++){
                char temp = input[j];

                if(temp == '(') cnt ++;
                else cnt --;

                if (cnt < 0 ) break;
            }

            if(cnt == 0) sb.append("YES\n");
            else sb.append("NO\n");
            }
        System.out.println(sb);
        }
    }
