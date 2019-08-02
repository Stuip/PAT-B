package PAT_1047;

/***
 * @author Tang
 * @Date 2019-07-19
 */


/**
 * 编程团体赛的规则为：每个参赛队由若干队员组成；所有队员独立比赛；参赛队的成绩为所有队员的成绩和；成绩最高的队获胜。
 * 现给定所有队员的比赛成绩，请你编写程序找出冠军队。
 *
 * 输入格式：
 *      输入第一行给出一个正整数 N（≤10^​4），即所有参赛队员总数。随后 N 行，每行给出一位队员的成绩，格式为：队伍编号-队员编号成绩，
 *      其中队伍编号为 1 到 1000 的正整数，队员编号为 1 到 10 的正整数，成绩为 0 到 100 的整数。
 * 输出格式：
 *      在一行中输出冠军队的编号和总成绩，其间以一个空格分隔。注意：题目保证冠军队是唯一的。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] team = new int[1001];
        int i,max;
        max=0;
        for (i=0;i<N;i++){
            String s = br.readLine();
            String[] s1 = s.split("[ ]");
            String[] s2 = s1[0].split("-");
            int tem = Integer.parseInt(s2[0]);
            team[tem] = team[tem] + Integer.parseInt(s1[1]);
            if (team[max] < team[tem]){
                max = tem;
            }
        }
        System.out.println(max+" "+team[max]);
        br.close();
    }
}
