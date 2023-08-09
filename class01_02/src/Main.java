import java.util.*;

public class Main {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);

        int n_arr = in.nextInt();

        StringBuilder sb= new StringBuilder();
        sb.append("@");
        for(int i=0;i<n_arr;i++){
            sb.append(in.next());
            sb.append("@");
        }

        int n_input = in.nextInt();
        String[] input = new String[n_input];

        for(int i=0;i<n_input;i++){
            input[i]=in.next();
        }

       String arr = String.valueOf(sb);

        for(int i=0;i<n_input;i++){
            String temp = "@"+input[i]+"@";

            if(arr.contains(temp) == true )
                System.out.println("1");
            else System.out.println("0");
        }

    }

}
