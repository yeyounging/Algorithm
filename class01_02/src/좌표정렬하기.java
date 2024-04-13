import java.io.*;
import java.util.*;

public class 좌표정렬하기 {


    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int input[][] = new int [size][2];

        for(int i =0;i<size;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input, (arr1, arr2) -> {
            if(arr1[0]==arr2[0]) return arr1[1]-arr2[1];
            else return arr1[0]-arr2[0];
        });

//        Arrays.sort(input, new Comparator<int[]>(){
//            public int compare(int[] arr1, int[] arr2){
//                if(arr1[0]==arr2[1]) return arr1[1]-arr2[1];
//                else return arr1[0]-arr2[0];
//            }
//        });
//
        StringBuilder sb = new StringBuilder();
        for (int[] arr : input){
            sb.append(arr[0]+ " ");
            sb.append(arr[1]+"\n");
        }

        System.out.println(sb);


    }


}
