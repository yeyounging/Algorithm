import java.io.*;
import java.util.*;

public class 단어공부2 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Map<Character, Integer> map= new HashMap<>();

        for(char a : input.toUpperCase().toCharArray()){
            if(!map.containsKey(a)) map.put(a, 0);
            else map.put(a,map.get(a)+1);
        };

        int maxValue = Integer.MIN_VALUE;
        char maxKey = '\0';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
            else if(entry.getValue() == maxValue) maxKey = '?';
        }
        System.out.println(maxKey);



    }}
