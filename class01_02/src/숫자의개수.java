import java.util.Scanner;

public class 숫자의개수 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int result = 1;
        for(int i=0;i<3;i++) {
            int input = scanner.nextInt();
            result*=input;
        }
        String res = String.valueOf(result);
        int[] answer = new int[10];
        String res2[] = res.split("");

        for(int j=0;j<res.length();j++){
            for(int i=0;i<10;i++){
                if(res2[j].equals(String.valueOf(i))) {
                    answer[i]++;
                    break;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(answer[i]);
        }


    }
}
