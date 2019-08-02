package PAT_1063;

/***
 * @author Tang
 * @Date 2019-07-21
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 在数学中，矩阵的“谱半径”是指其特征值的模集合的上确界。换言之，对于给定的 n 个复数空间的
 * 特征值{a1+b1i,⋯,an+bni},它们的模为实部与虚部的平方和的开方，而“谱半径”就是最大模。
 * 现在给定一些复数空间的特征值，请你计算并输出这些特征值的谱半径。
 *
 * 输入格式：
 *      输入第一行给出正整数 N（≤ 10 000）是输入的特征值的个数。随后 N 行，每行给出 1 个特征值的实部和虚部，
 *      其间以空格分隔。注意：题目保证实部和虚部均为绝对值不超过 1000 的整数。
 * 输出格式：
 *      在一行中输出谱半径，四舍五入保留小数点后 2 位。
 *
 * */

/**
 * 解题思路：
 *      1，接受需要输入的特征值的个数；
 *      2，接受所有的特征值的实部和虚部
 *          - 将接受的字符串分隔成数值，分别存储在实部和虚部的变量
 *          - 将实部和虚部各自平方相加并存放在num数组
 *      3，比较num数组中的大小
 *      4，将最大的数值开方输出
 */

public class Main {

    public static double Max(double[] num){
        double max=0;
        for (int i=0;i<num.length;i++){
            if (num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] num = new double[N];
        for (int i=0;i<N;i++){
            int real=0,plural=0;
            String s = br.readLine();
            String[] str = s.split(" ");
            real = Integer.parseInt(str[0]);
            plural = Integer.parseInt(str[1]);
            num[i] = Math.pow(real,2) + Math.pow(plural, 2);
        }
        double max = Max(num);
        System.out.printf("%.2f",Math.sqrt(max));
        br.close();
    }
}
