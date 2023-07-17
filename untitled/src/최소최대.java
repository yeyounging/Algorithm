import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int input[] = new int[num];

        for(int i=0;i<num;i++){
            input[i]= scanner.nextInt();
        }

        //find min,max
        int min_index=0, max_index = 0;
        for(;num>1;num--){
            if (input[min_index]>input[num-1]) min_index=num-1;
            else if (input[max_index]<input[num-1]) max_index=num-1;
        }
        System.out.println(input[min_index]+" "+input[max_index]);

    }
}