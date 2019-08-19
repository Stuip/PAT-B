package PAT_1077;

/***
 * @description
 * @author Tang
 * @Date 2019-08-18
 */

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 在浙大的计算机专业课中，经常有互评分组报告这个环节。一个组上台介绍自己的工作，其他组在台下为其表现评分。
 * 最后这个组的互评成绩是这样计算的：所有其他组的评分中，去掉一个最高分和一个最低分，剩下的分数取平均分记为 G1；
 * 老师给这个组的评分记为 G2。该组得分为 (G​1+G2)/2，最后结果四舍五入后保留整数分。本题就要求你写个程序帮助老师计算每个组的互评成绩。
 *
 * 输入格式：
 *      输入第一行给出两个正整数 N（> 3）和 M，分别是分组数和满分，均不超过 100。随后 N 行，每行给出该组得到的 N 个分数
 *      （均保证为整型范围内的整数），其中第 1 个是老师给出的评分，后面 N−1 个是其他组给的评分。合法的输入应该是 [0,M] 区间内的整数，
 *      若不在合法区间内，则该分数须被忽略。题目保证老师的评分都是合法的，并且每个组至少会有 3 个来自同学的合法评分。
 *
 * 输出格式：
 *      为每个组输出其最终得分。每个得分占一行。
 *
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);  // 分组数
        int M = Integer.parseInt(str[1]);  // 满分
        String[] teams = new String[N];
        for (int i=0;i<N;i++){
            teams[i] = br.readLine();
        }
        for (int i=0;i<teams.length;i++){
            String[] grades = teams[i].split(" ");
            int G2 = Integer.parseInt(grades[0]);  // 老师的成绩
            double G[] = new double[N-1];  // 组员评分
            int index =0; // 统计合格的人数
            for (int j=1;j<grades.length;j++){  // 除了老师的评分开始
                int grade = Integer.parseInt(grades[j]);
                if (grade >= 0&&grade <= M){
                    G[index] = grade;
                    index++;
                }
            }
            double G1 = 0;
            Arrays.sort(G,0,index);  // 将后面的零踢出去
            int num=0; // 统计达标的人数
            for(int j=1;j<index-1;j++){  // 后面为零的数排除
                G1 += G[j];
                num++;
            }
            G1 /= num;
            System.out.println(Math.round((G1 + G2) / 2));
        }
    }
}
