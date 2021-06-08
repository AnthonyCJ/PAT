package PAT.advanced.advanced_1001;
import java.io.IOException;
import java.util.Scanner;
public class Advanced_1001 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = a + b;
        String s = Integer.toString(c);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // 输出字符
            System.out.print(s.charAt(i));
            if (s.charAt(i) == '-')
                continue;
            // 处理分隔符","
            if (((len - i - 1) % 3 == 0) && (i + 1 != len)) {
                System.out.print(",");
            }
        }
        in.close();
    }
}
