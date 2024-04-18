import java.io.*;
import java.util.StringTokenizer;

public class 소수구하기 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        if(start <=2) sb.append("2\n");
        if(start %2 == 0) start++;

        for(int i =start; i<=end ; i=i+2){
            if(isPrime(i)) sb.append(i+"\n");
        }

        System.out.println(sb);

    }
    private static boolean isPrime(int n){
        for(int i=3 ; i<=Math.sqrt(n);i=i+2){
            if (n%i == 0) return false;
        }
        if(n ==1) return false;
        return true;
    }

}

