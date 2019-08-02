package PAT_1087;

/***
 * @author Tang
 * @Date 2019-07-27
 */

import java.util.HashSet;
import java.util.Scanner;

/**
 * 当自然数 n 依次取 1、2、3、……、N 时，算式 ⌊n/2⌋+⌊n/3⌋+⌊n/5⌋ 有多少个不同的值？
 * （注：⌊x⌋ 为取整函数，表示不超过 x 的最大自然数，即 x 的整数部分。）
 *
 * 输入格式：
 *      输入给出一个正整数 N（2≤N≤10^4)
 * 输出格式：
 *      在一行中输出题面中算式取到的不同值的个数。
 *
 * 输入示例：
 *      2017
 * 输出示例：
 *      1480
 */

public class Main {

    public static int getInt(int x,int de){
        double num = x / de;
        return (int)Math.floor(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> number = new HashSet<>();
        int total=0;
        for (int i=0;i<N;i++){
            total = getInt(i+1,2) + getInt(i+1,3)+getInt(i+1,5);
            number.add(total);
        }
        System.out.println(number.size());
        sc.close();
    }
}
