import java.util.Scanner;
public class 단어공부 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        word = word.toUpperCase();
        String[] alps = word.split("");
        String[] answer = new String[word.length()];
        int[] cnt = new int[word.length()];

        for(int i=0;i<word.length();i++){
            for(int j=0;j<i;j++){
                if(alps[i].equals(answer[j])){
                    cnt[j]++;
                    break;
                }
                else if (j==i-1){
                    answer[i]=alps[i];
                    cnt[i]++;
                }
            }
            if(i==0){
                answer[i]=alps[i];
                cnt[i]++;
            }

        }
        //최빈값 찾기
        int max_index=0;
        for(int i=0;i<word.length();i++){
            if (cnt[max_index] < cnt[i]) max_index=i;
        }
        //중복체크
        boolean check=false;
        for(int i=0;i<word.length();i++){
            if (i == max_index) continue;
            if (cnt[max_index] == cnt[i]) check = true;
        }

        if(check) System.out.println("?");
        else  System.out.println(alps[max_index]);

    }
}
