import java.util.*;

public class Main {



    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] words = new String[num];

        for(int i=0;i<num;i++){
            words[i] = scanner.next();
        }

        int[] index = new int [num];
        index[0]=0;
        int cnt=1;

        for(int i=0;i<num;i++)
            for (int j = 0; j < i; j++) {
                if (words[index[j]].length() > words[i].length()) {

                    int h=j-1;
                    boolean dup = false;
                    while(h>=0 && words[i].length()==words[index[h]].length()){
                        if(words[i].equals(words[index[h]])) dup =true;
                        h--;
                    }
                    if(dup==true) break;

                    for(int k=i;k>j;k--) {
                        index[k] = index[k - 1];
                    }
                    index[j] = i;
                    cnt++;
                    break;
                }
                if (j == i-1) {
                    index[j + 1] = i;
                    cnt++;
                }
            }

        for(int i=0;i<cnt;i++){
            System.out.println(words[index[i]]);
        }

        int answer[] = new int[cnt];
        answer[0]=0;
        int check[] = new int[num];
        int cnt_check=0;


        for(int i=1;i<cnt;i++){
            if (!(words[index[i]].equals(words[index[i-1]]))) {
                answer[cnt]=index[i];
            }
            else {

            }
        }



    }
}
