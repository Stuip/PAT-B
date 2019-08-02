package PAT_1092;

/***
 * @description
 * @author Tang
 * @Date 2019-07-31
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 若想评比出一种“最好吃”的月饼，那势必在吃货界引发一场腥风血雨…… 在这里我们用数字说话，给出全国各地各种月饼的销量，
 * 要求你从中找出销量冠军，认定为最好吃的月饼。
 * 输入格式：
 *      输入首先给出两个正整数 N（≤1000）和 M（≤100），分别为月饼的种类数（于是默认月饼种类从 1 到 N 编号）和参与统计的城市数量。
 *      接下来 M 行，每行给出 N 个非负整数（均不超过 1 百万），其中第 i 个整数为第 i 种月饼的销量（块）。数字间以空格分隔。
 * 输出格式：
 *      在第一行中输出最大销量，第二行输出销量最大的月饼的种类编号。如果冠军不唯一，则按编号递增顺序输出并列冠军。
 *      数字间以 1 个空格分隔，行首尾不得有多余空格。
 * 输入样例：
 *      5 3
 *      1001 992 0 233 6
 *      8 0 2018 0 2008
 *      36 18 0 1024 4
 * 输出样例：
 *      2018
 *      3 5
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" ");
        int N = Integer.parseInt(MN[0]);  // 月饼的种类
        int M = Integer.parseInt(MN[1]);  // 参与统计的城市数量
        int[] sales = new int[N];
        for (int i=0;i<M;i++){
            String[] str = br.readLine().split(" ");
            for (int j=0;j<N;j++){
                sales[j] += Integer.parseInt(str[j]);
            }
        }
        int Max=0;
        // 销售量最大值
        for (int i=0;i<sales.length;i++){
            if (sales[i] > Max){
                Max = sales[i];
            }
        }
        System.out.println(Max);
        // 输出销售量最大的月饼种类
        String maxList = "";
        for (int i=0;i<sales.length;i++){
            if (sales[i]==Max){
                maxList += i+1+" ";
            }
        }
        System.out.println(maxList.trim());
    }
}
