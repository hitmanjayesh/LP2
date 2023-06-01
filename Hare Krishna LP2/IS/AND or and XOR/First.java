import java.util.*;
public class First  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Text:");
        String str = sc.nextLine();
        int len = str.length();
        // System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print((char) (str.charAt(i) & 127));
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print((char) (str.charAt(i) ^ 127));
        }
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print((char) (str.charAt(i) | 127));
        }
        System.out.println();
    }
}
