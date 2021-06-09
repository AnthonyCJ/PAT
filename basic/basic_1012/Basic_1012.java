package PAT.basic.basic_1012;

import java.util.Scanner;

public class Basic_1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 输入N
        int N = in.nextInt();
        int[] array = new int[N];
        // 输入N个数据
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }
        // 遍历，求A1 - A5
        int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0, countA2 = 0, countA4 = 0;
        int sign = 1;
        for (int i = 0; i < N; i++) {
            // 处理A1
            if ((array[i] % 5 == 0) && (array[i] % 2 == 0)) 
                A1 += array[i];
            // 处理A2
            if (array[i] % 5 == 1) {
                A2 += sign * array[i];
                sign *= -1;
                countA2++;
            }
            // 处理A3
            if (array[i] % 5 == 2)
                A3++;
            // 处理A4
            if (array[i] % 5 == 3) {
                A4 += array[i];
                countA4++;
            }

            // 处理A5
            if ((array[i] % 5 == 4) && array[i] > A5)
                A5 = array[i];
        }
        if (A1 == 0) {
            System.out.print("N ");
        }
        else {
            System.out.print(A1 + " ");
        }
        if (countA2 == 0) {
            System.out.print("N ");
        }
        else {
            System.out.print(A2 + " ");
        }
        if (A3 == 0) {
            System.out.print("N ");
        }
        else {
            System.out.print(A3 + " ");
        }
        if (countA4 == 0) {
            System.out.print("N ");
        }
        else {
            System.out.printf("%.1f\040", A4 * 1.0 / countA4);
        }
        if (A5 == 0) {
            System.out.print("N");
        }
        else {
            System.out.print(A5);
        }
        in.close();
    }
}
