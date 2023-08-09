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



        int start=0;
        int end=0;


        for(int i=1;i<cnt;i++){
           if(words[index[i]].length()>words[index[i-1]].length()){
               end=i;
               //같은 문자열길이안에서 사전순 정렬 -최댓값정렬
               for(int j=end;j>start;j--){
                   int max_index=start;
                   for(int h=start;h<j;h++){
                       if (words[index[h]].compareTo(words[index[max_index]])>0)
                       {
                           max_index = index[h];
                       }
                   }
                   int temp = index[j-1];
                   index[j-1]=max_index;
                   index[max_index]= temp;
               }
               start=i;
           }
        }
        for(int j=cnt;j>start;j--){
            int max_index=start;
            for(int h=start;h<j;h++){
                if (words[index[h]].compareTo(words[index[max_index]])>0)
                {
                    max_index = index[h];
                }
            }
            int temp = index[j-1];
            index[j-1]=max_index;
            index[max_index]= temp;
        }


        for(int i=0;i<cnt;i++){
            System.out.println(words[index[i]]);
        }



    }
}
