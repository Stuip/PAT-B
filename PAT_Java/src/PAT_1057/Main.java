package PAT_1057;

/***
 * @description
 * @author Tang
 * @Date 2019-08-19
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定一串长度不超过 10^​5的字符串，本题要求你将其中所有英文字母的序号（字母 a-z 对应序号 1-26，不分大小写）相加，
 * 得到整数 N，然后再分析一下 N 的二进制表示中有多少 0、多少 1。例如给定字符串 PAT (Basic)，其字母序号之和为：
 * 16+1+20+2+1+19+9+3=71，而 71 的二进制是 1000111，即有 3 个 0、4 个 1。
 * 输入格式：
 *      输入在一行中给出长度不超过 10^​5、以回车结束的字符串。
 * 输出格式：
 *      在一行中先后输出 0 的个数和 1 的个数，其间以空格分隔。
 */

/**
 * 注意事项：
 *        注意要将sum为0的时候区分开，如果这一串字母中没有字母，也会认为有一个零
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toUpperCase().toCharArray();
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i] >= 'A' && str[i] <= 'Z') {
                sum += (str[i] - 'A' + 1);
            }
        }
        char[] num = Integer.toString(sum,2).toCharArray();
        int zero=0,one=0;
        if (sum !=0){
            for (int i = 0; i <num.length ; i++) {
                if (num[i]-'0'==1){
                    one++;
                }
                if (num[i]-'0'==0){
                    zero++;
                }
            }
        }
        System.out.printf("%d %d",zero,one);
    }
}

