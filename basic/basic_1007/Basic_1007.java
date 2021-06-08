package PAT.basic.basic_1007;

import java.util.Scanner;
import java.lang.Math;

public class Basic_1007 {
    /**
     * 判断参数是否为素数(这里可以确定从3开始，所以不必增加数字2的判断)
     * @param value 待判断元素
     * @return true/false
     */
    public static boolean isPrime(int value) {
        for (int i = 2; i <= Math.sqrt((double)value); i++) {
            if (value % i == 0) {
                return false;
            }           
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int primePair = 0;
        for (int i = 5; i <= n; i++) {
            if (isPrime(i) && isPrime(i - 2)) {
                primePair++;
            }
        }
        System.out.println(primePair);
        in.close();
    }
}
