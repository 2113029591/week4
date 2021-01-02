import java.util.Scanner;

/**
 * 7.34对字符中的字符排序
 */
public class ex10 {
    public static String Sort(String s) {
        int len = s.length();
        char s1[] = new char[len];
        char temp;
        for(int i = 0; i < len; i++) {
            s1[i] = s.charAt(i);
        }
        for(int i = 0;i < len; i++) {
            for(int j = 0; j < len-1; j++) {
                if(s1[j] > s1[j+1]) {
                    temp = s1[j+1];
                    s1[j+1] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        String s2 = new String(s1);
        return s2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入字符串：");
        String s = input.nextLine();
        System.out.println(Sort(s));
    }
}
