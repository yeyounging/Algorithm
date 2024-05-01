import java.util.*;
import java.io.*;

class 요세푸스문제0{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int gap =  Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> linked = new LinkedList<>();

        for(int i=1;i<=size;i++){
            linked.add(i);
        }
        bw.write("<");

        for(int i=gap-1;linked.size()>1;i+=gap-1){
            if(i>= linked.size()) {
                i = i % linked.size();
            }
            bw.write(linked.remove(i)+", ");
        }
        bw.write(linked.poll() +">");
        bw.flush();
        bw.close();
    }
}