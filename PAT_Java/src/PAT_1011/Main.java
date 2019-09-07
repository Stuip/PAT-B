package PAT_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * @description
 * @author Tang
 * @Date 2019/9/7
 */

/**
 * 给定区间 [−2^31,2^31] 内的 3 个整数 A、B 和 C，请判断 A+B 是否大于 C。
 *
 * 输入格式：
 *      输入第 1 行给出正整数 T (≤10)，是测试用例的个数。随后给出 T 组测试用例，每组占一行，顺序给出 A、B 和 C。整数间以空格分隔。
 *
 * 输出格式：
 *      对每组测试用例，在一行中输出 Case #X: true 如果 A+B>C，否则输出 Case #X: false，其中 X 是测试用例的编号（从 1 开始）。
 */


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] nums = br.readLine().split(" ");
            long A =Integer.parseInt(nums[0]);
            long B = Integer.parseInt(nums[1]);
            long C = Integer.parseInt(nums[2]);
            boolean flag = false;
            if ((A+B)>C){
                flag =true;
            }
            System.out.println("Case #"+(i+1)+": "+flag);
        }
    }
}
