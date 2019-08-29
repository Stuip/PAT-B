package PAT_1083;

/***
 * @description
 * @author Tang
 * @Date 2019/8/29
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定 N 张卡片，正面分别写上 1、2、……、N，然后全部翻面，洗牌，在背面分别写上 1、2、……、N。
 * 将每张牌的正反两面数字相减（大减小），得到 N 个非负差值，其中是否存在相等的差？
 *
 * 输入格式：
 *      输入第一行给出一个正整数 N（2 ≤ N ≤ 10 000），随后一行给出 1 到 N 的一个洗牌后的排列，第 i 个数表示正面写了 i 的那张卡片背面的数字。
 * 输出格式：
 *      按照“差值 重复次数”的格式从大到小输出重复的差值及其重复的次数，每行输出一个结果。
 *
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] number = br.readLine().split(" ");
        int[] num = new int[N];
        for (int i = 0; i < number.length; i++) {
            int differ = Math.abs(i+1-Integer.parseInt(number[i]));
            num[differ]+=1;
        }

        for (int i = num.length-1; i >=0; i--) {
            if (num[i]>1){
                System.out.printf("%d %d\n",i,num[i]);
            }
        }
    }
}
