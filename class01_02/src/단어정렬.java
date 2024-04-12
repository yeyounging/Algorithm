import java.io.*;
import java.util.*;

public class 단어정렬 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        String input[] = new String[size];
        int input_length[] = new int[size];

        for(int i = 0;i<size;i++){
            input[i]=br.readLine();
            input_length[i] = input[i].length();
        }

        int[] sorted_length = Arrays.copyOf(input_length,size);
        Arrays.sort(sorted_length);

        for(int i =0;i<size;i++){
            if(i!=0 && sorted_length[i]==sorted_length[i-1]) continue;
            Set<String> temp = new TreeSet<>();
            for(String str : input){
                if(str.length()== sorted_length[i]) temp.add(str);
            }

            for(String str : temp) {
                bw.write(str);
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();

    }


}
