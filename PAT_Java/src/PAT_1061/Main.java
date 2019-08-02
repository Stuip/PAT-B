package PAT_1061;

/***
 * @author Tang
 * @Date 2019-07-18
 */


/**
 * 判断题的评判很简单，本题就要求你写个简单的程序帮助老师判题并统计学生们判断题的得分。
 * 输入格式：
 *      输入在第一行给出两个不超过 100 的正整数 N 和 M，分别是学生人数和判断题数量。
 *      第二行给出 M 个不超过 5 的正整数，是每道题的满分值。第三行给出每道题对应的正确答案，0 代表“非”，1 代表“是”。随后 N 行，
 *      每行给出一个学生的解答。数字间均以空格分隔。
 * 输出格式：
 *      按照输入的顺序输出每个学生的得分，每个分数占一行。
 * */


import java.util.Scanner;

public class Main {

    public static final int NUMBER = 100;

    /**
     *  打印信息
     * @param num
     */
    public static void printN(int[] num){
        for (int i=0;i<num.length;i++){
            System.out.printf("%d ",num[i]);
        }
        System.out.println();
    }


    /**
     * 获取每一位学生的所做的选项
     * @param sc
     * @param M
     * @return
     */
    public static int[] getOptions(Scanner sc,int M){
        int[] options = new int[M];
        for (int i=0;i<M;i++){
            options[i] = sc.nextInt();
        }
        return options;
    }

    public static void main(String[] args) {
        int N,M; // N 为学生人数 M为判断题数量
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();  // 学生人数
        M = sc.nextInt();  // 判断题数量
        int[] fullMarks = new int[M];
        int[] answer= new int[M];
        int[] options = new int[M];
        int[] grades = new int[N];
        for (int i=0;i<M;i++){   //每一道判断题的满分
            fullMarks[i] = sc.nextInt();
        }
        for (int i=0;i<M;i++){  //  每一题的答案
            answer[i] = sc.nextInt();
        }
        for (int i=0;i<N;i++){
            options = getOptions(sc,M); // 获取所做选项
            for (int j=0;j<M;j++){
                if (options[j]==answer[j]){
                    grades[i] += fullMarks[j];
                }
            }
        }
        for (int i=0;i<N;i++){
            System.out.println(grades[i]);
        }
        sc.close();
    }
}
