import java.io.*;
import java.util.*;

public class Main{
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int answer1 =1;
        int answer2=n1*n2;

        int smallN, largeN = 0;
        if(n1>n2){
            smallN = n2;
            largeN = n1;
        }
        else{
            smallN = n1;
            largeN = n2;
        }

        if(largeN%smallN==0){
            sb.append(smallN+" "+largeN);
            System.out.println(sb);
        }
        else{       //최대공약수 구하기
            for(int i = smallN/2; i>1; i--){
                if(largeN % i == 0 && smallN % i == 0){
                    answer1 = i;
                    break;
                }
            }

            //최소공배수 구하기
            for(int i= 2 ; i<smallN ; i++ ){
                if(largeN*i % smallN == 0) {
                    answer2 = largeN*i;
                    break;
                }
            }

            sb.append(answer1+" "+answer2);
            System.out.println(sb);

        }
    }
}