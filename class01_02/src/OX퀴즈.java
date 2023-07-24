import java.io.*;
import java.util.Scanner;

public class OX퀴즈 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i=0;i<num;i++){
            String str = scanner.next();
            String[] arr = str.split("");
            int score[] = new int[num];

            for(int j=0;j<str.length();j++){
               int cnt=0;
                if(arr[j]=="O"){
                    //연속된 0개수세기
                   for(int k=j;k<str.length();k++){
                       if(arr[k]=="X") break;
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
                System.out.println(score[i]);
               }
            }
        }
