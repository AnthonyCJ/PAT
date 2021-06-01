package PAT.basic.basic_1006;
import java.util.Scanner;

public class Basic_1006 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String strb, strs, strg;
        StringBuilder stringBuilder = new StringBuilder();
        // 处理个位
        for (int i = 1; i <= num % 10; i++) {
            stringBuilder.append(i);
        }
        strg = stringBuilder.toString();
        num /= 10;
        // 处理十位
        stringBuilder = new StringBuilder();
        for (int i = 1; i <= num % 10; i++) {
            stringBuilder.append("S");
        }
        strs = stringBuilder.toString();
        num /= 10;
        // 处理百位
        stringBuilder = new StringBuilder();
        for (int i = 1; i <= num % 10; i++) {
            stringBuilder.append("B");
        }
        strb = stringBuilder.toString();
        System.out.println(strb + strs + strg);
        in.close();
    }
}
