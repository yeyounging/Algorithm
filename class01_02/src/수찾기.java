import java.util.*;
import java.io.*;

public class 수찾기{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //method
        //1. byteStream
        //2. String.contains()
        //3. 이진탐색

        int size= Integer.parseInt(br.readLine());

        List< Integer> arr1 = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0;i<size;i++){
            arr1.add(Integer.parseInt(st.nextToken()));
        }


        int size2= Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        Collections.sort(arr1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        for(int i=0;i<size2;i++)
            bw.write(String.valueOf(include(arr1,Integer.parseInt(st2.nextToken())))+"\n");
        bw.flush();
        bw.close();
    }

    private static int include(List<Integer> arr,int num){
        int end = arr.size()-1;
        int start = 0;
        while(start <= end){
            int key = (start+end)/2;
            if(arr.get(key)==num) return 1;
            else if (arr.get(key) > num) {
                end = key-1;
            }
            else{
                start = key+1;
            }
        }
        return 0;

    }
}
