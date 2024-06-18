import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int score[] = new int[num];

        for(int i=0;i<num;i++){
            String str = scanner.next();
            String[] arr = str.split("");

            for(int j=0;j<str.length();j++){
                int cnt=0;
                if(arr[j].equals("O")){
                    //연속된 0개수세기
                    for(int k=j;k<str.length();k++){
                        if(arr[k].equals("X")) break;
                        cnt++;
                    }
                    j+=cnt-1;
                    //점수 합하기
                    while(cnt!=0){
                        score[i]+=cnt;
                        cnt--;
                    }
                }
            }
        }
        for(int i=0;i<num;i++)
            System.out.println(score[i]);
    }
}


}