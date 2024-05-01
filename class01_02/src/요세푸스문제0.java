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

        for(int i=0;i<size;i++){
            linked.add(i+1);
        }
        bw.write("<");

        int n = 0, i = -1;

        while(linked.size()>1){
            i+=gap;
            if(i>= linked.size()){
                i = i % linked.size();
            }
            n = linked.remove(i);
            bw.write("삭제할 인덱스 :"+i+"\n");
            bw.write(n+", ");
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}