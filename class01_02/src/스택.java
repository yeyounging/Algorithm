import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for(int i=0;i<size;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "push" :
                    stack.push(st.nextToken());
                    break;
                case "top" :
                    if(stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.peek()+"\n");
                    break;
                case "pop" :
                    if(stack.isEmpty()) sb.append("-1\n");
                    else {sb.append(stack.peek()+"\n");
                        stack.pop();}
                    break;
                case "size" :
                    sb.append(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;

            }

        }
        System.out.println(sb);
    }
}

