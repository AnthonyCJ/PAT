package PAT.basic.basic_1006;
import java.util.Scanner;

public class Basic_1006Plus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String strb = "BBBBBBBBB", strs = "SSSSSSSSS", strg = "123456789";
        strg = strg.substring(0, num % 10);
        num /= 10;
        strs = strs.substring(0, num % 10);
        num /= 10;
        strb = strb.substring(0, num % 10);
        String all = String.join("", strb, strs, strg);
        System.out.println(all);
        in.close();
    }
}
