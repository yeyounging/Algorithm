import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        if(input.isEmpty()==false) {
            String[] arr = input.split(" ");
            System.out.println(arr.length);
        }
        else System.out.println(0);
    }
}
