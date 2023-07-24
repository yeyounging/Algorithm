import java.util.Scanner;

public class 나머지 {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int[] res = new int[10];
        int[] arr = new int[10];
        int cnt=0;

        for(int i=0;i<10;i++){
            int input = scanner.nextInt();
            res[i]= input%42;
        }

        for(int i = 0;i<10;i++){
            int j=0;
            do{
                if(res[i]==arr[j]) break;
                j++;
            }while(j<cnt);

            if(cnt==0 || j==cnt) {
                arr[cnt]=res[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
