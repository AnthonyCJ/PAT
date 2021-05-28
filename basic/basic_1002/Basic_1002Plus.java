package PAT.basic.basic_1002;
import java.util.Scanner;

public class Basic_1002Plus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sNum = null;     // 保存输入的数字串
        sNum = in.nextLine();
        String[] sPinYin = new String[] {"ling", "yi", "er", "san", "si", "wu", 
        "liu", "qi", "ba", "jiu"};
        int sum = 0;            // 输入的数字串每位之和
        for (int i = 0; i < sNum.length(); i++) {
            sum += (sNum.charAt(i) - '0');  // 求各位数值之和
        }
        String sSum = Integer.toString(sum);    // 整形转字符串
        for (int i = 0; i < sSum.length(); i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(sPinYin[sSum.charAt(i) - '0']);
        }
        in.close();
    }
}
