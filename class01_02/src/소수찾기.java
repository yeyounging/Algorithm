import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {
    public static void main (String args[]) throws IOException {

        int answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str= br.readLine().split(" ");

        Set<Integer> uniquePrimes = new HashSet<>();
        for (String s : str) {
            int value = Integer.parseInt(s);
            if (isPrime(value)) {
                uniquePrimes.add(value);
            }
        }

        System.out.println(uniquePrimes.size());
    }
    private static boolean isPrime(int n){
        if(n==2) return true;
        else if (n<=1) return false;

        for(int i=2; i<n/2;i++){
            if (n%i == 0) return false;
        }

        return true;
    }

}
