package PAT.basic.basic_1008;

import java.util.Scanner;
public class Basic_1008 {
    /**
     * 数组元素逆序
     * @param a 待逆序数组
     * @param start 逆序开始位置
     * @param end 逆序结束位置
     */
    public static void arrayReverse(int[] a, int start, int end) {
        int temp;
        for (int i = start; i <= (start + end) / 2; i++) {
            temp = a[i];
            a[i] = a[end - i + start];
            a[end - i + start] = temp;
        }
    }
    public static void main(String[] args) {
        // 读取数据
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // N个元素
        int M = in.nextInt();   // 移动M位
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        // 循环移动
        M %= N;
        if (M != 0) {
            arrayReverse(a, 0, a.length - 1);
            arrayReverse(a, 0, M - 1);
            arrayReverse(a, M, a.length - 1);
        }

        // 输出结果
        for (int i = 0; i < a.length; i++) {
            if (i != 0){
                System.out.print(" " + a[i]);
            }
            else {
                System.out.print(a[i]);
            }
        }
        in.close();
    }
}
