import java.util.*;

public class RE단어정렬 {

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] words = new String[num];

        for (int i = 0; i < num; i++) {
            words[i] = scanner.next();
        }

        Arrays.sort(words, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(words[0]);

        for (int i = 1; i < num; i++) {
            // 중복되지 않는 단어만 출력
            if (!words[i].equals(words[i - 1])) {
                System.out.println(words[i]);
            }
        }



    }

}
