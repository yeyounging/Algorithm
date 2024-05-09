import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


class Member {
    int age;
    String name;
}
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        Member[] members = new Member[num];

        for(int i =0;i<num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i] = new Member();
            members[i].age = Integer.parseInt(st.nextToken());
            members[i].name = st.nextToken();
        }

        Arrays.sort(members, (a,b)-> a.age - b.age);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i =0;i<num;i++){
            bw.write(String.valueOf(members[i].age) + " " + members[i].name);
            bw.newLine();
        }


        bw.flush();
        bw.close();

    }
}