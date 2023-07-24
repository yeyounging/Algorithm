import java.util.Scanner;

public class 팰린드롬수 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String num[]= new String[100];
        int cnt=0;

       while(true){
           num[cnt++]= scanner.next();
           if(num[cnt-1].equals("0")) break;
       }

        for(int k=0;k<cnt-1;k++) {
            String digit[] = num[k].split("");
            boolean check=true;

            for(int i=0;i<digit.length/2;i++){
                if (!(digit[i].equals(digit[digit.length-i-1]))) {
                    check = false;
                    System.out.println("no");
                    break;
                }

            }
            if(check==true)
                System.out.println("yes");
            }

        }
}
