import java.io.*;


public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n_arr = Integer.parseInt(br.readLine());

        StringBuilder sb= new StringBuilder();
        sb.append(" ");
        sb.append(br.readLine());
        sb.append(" ");

        int n_input = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

       String arr = String.valueOf(sb);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0;i<n_input;i++){
            String temp = " "+input[i]+" ";

            if(arr.contains(temp) == true )
                bw.write("1\n");
            else
                bw.write("0\n");
        }
        bw.close();

    }

}
