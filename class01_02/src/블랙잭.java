import java.io.*;
import java.util.Arrays;

public class 블랙잭 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputValues = br.readLine().split(" ");
        int n = Integer.parseInt(inputValues[0]);
        int m = Integer.parseInt(inputValues[1]);

        String[] inputValues2 = br.readLine().split(" ");
        int[] input = new int[n];
        //입력값 배열에 저장
        for(int i =0;i<n;i++){
            input[i] = Integer.parseInt(inputValues2[i]);
        }

        Arrays.sort(input);

        int max = 0;
        //큰수부터 더하기
        for(int i=n-1;i>=0;i--){
            int sum1= input[i] ; //init
            //두번째 수
            for(int j = i-1;j>=0;j--) {
                int sum2 = sum1 + input[j];
                if (sum2 > m) continue;
                //세번째 수
                for (int k = j - 1; k >= 0; k--) {
                    int sum3 = sum2 + input[k];
                    if (sum3 > m) continue;
                    //최댓값 비교
                    if (sum3 > max) {
                        max = sum3;
                        break;
                    }
                }
            }
        }
        wr.write(String.valueOf(max));
        wr.flush();
        wr.close();


    }

}
