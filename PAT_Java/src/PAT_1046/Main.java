package PAT_1046;

/**
 * 划拳是古老中国酒文化的一个有趣的组成部分。酒桌上两人划拳的方法为：
 *      每人口中喊出一个数字，同时用手比划出一个数字。如果谁比划出的数字正好等于两人喊出的数字之和，谁就赢了，输家罚一杯酒。
 *      两人同赢或两人同输则继续下一轮，直到唯一的赢家出现。下面给出甲、乙两人的划拳记录，请你统计他们最后分别喝了多少杯酒。
 *
 * 输入格式：
 *      输入第一行先给出一个正整数 N（≤100），随后 N 行，每行给出一轮划拳的记录，格式为：
 *          甲喊 甲划 乙喊 乙划
 *      其中喊是喊出的数字，划是划出的数字，均为不超过 100 的正整数（两只手一起划）。
 * 输出格式：
 *      在一行中先后输出甲、乙两人喝酒的杯数，其间以一个空格分隔。
 */

/**
 * 解题思路：
 *      1，接受将进行N轮的划拳
 *      2，接受每一轮划拳的结果，并将每人喊和划存放起来
 *      3，比较每个人划出来的数值与两个所喊的数值之和
 *          - 若甲方赢，则需要乙需要喝一杯酒
 *          - 若乙方赢，则需要甲需要喝一杯酒
 */

import java.util.Scanner;

public class Main {
    public static final int NUMBRE = 100;

    public static void main(String[] args) {
        int A,TotalA,B,TotalB;
        int DrinkA=0,DrinkB=0;
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // N为进行的比赛次数
        for (int i=0;i<N;i++){
            int realTotal = 0;
            A = in.nextInt();  // 甲喊
            TotalA = in.nextInt();  // 甲划
            B = in.nextInt();   // 乙喊
            TotalB = in.nextInt();  // 乙划
            realTotal = A + B;  // 甲乙喊出来数字之和
            if ((TotalA==realTotal)&&(TotalB!=realTotal)){
                DrinkB++;
            }else if ((TotalA!=realTotal)&&(TotalB==realTotal)){
                DrinkA++;
            }
        }
        System.out.printf("%d %d",DrinkA,DrinkB);
        in.close();
    }
}
