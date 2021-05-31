package PAT.basic.basic_1005;
import java.util.Scanner;

public class Basic_1005 {
    public static final int MAXSIZE = 0xFFFF; // 宏定义数组长度

    /**
     * 优化的冒泡排序算法（降序）
     * @param r 待排序数组
     * @param n 待排序元素个数
     */
    public static void BubbleSort(int r[], int n) {
        int bound, exchange = n - 1;    // 第一趟冒泡排序区间为[0, n - 1]
        // 当上一趟排序有记录交换时
        while (exchange != 0) {
            bound = exchange;
            exchange = 0;
            for (int i = 0; i < bound; i++) {
                if (r[i] < r[i + 1]) {
                    // 交换
                    int temp = r[i];
                    r[i] = r[i + 1];
                    r[i + 1] = temp;
                    // 记录交换位置
                    exchange = i;
                }
            }
        }
    }


    /**
     * 判断a是否大于b
     * @param a 
     * @param b 
     * @return bool 比较结果
     */
    private boolean cmp(int a, int b) {
        return a > b;
    } 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[MAXSIZE];   // 
        int k, n;       // k为元素个数，n暂存每一个参与计算的元素
        int flag = 0;   // 输出空格标识
        k = in.nextInt();
        int v[] = new int[k];

        for (int i = 0; i < k; i++) {
            n = in.nextInt();
            v[i] = n;
            while (n !=1) {
                if (n % 2 != 0) {
                    n = 3 * n + 1;
                }
                n /= 2;
                // 遇到“已覆盖”元素，则无需继续计算，转向下一元素
                if (arr[n] == 1) {
                    break;
                }
                // 记录“已覆盖”元素
                arr[n] = 1;
            }
        }
        // 排序
        BubbleSort(v, k);
        for (int i = 0; i < k; i ++) {
            if (arr[v[i]] == 0) {
                if (flag == 1) {
                    System.out.print("\040");
                }
                System.out.print(v[i]);
                flag = 1;
            }
        }
        in.close();
    }

}
