package PAT_1010;



/***
 * @description
 * @author Tang
 * @Date 2019/9/7
 */


import java.util.Scanner;

/**
 * 设计函数求一元多项式的导数。（注：x^n（n为整数）的一阶导数为nx^n−1
 * ​​ 。）
 *
 * 输入格式:
 * 以指数递降方式输入多项式非零项系数和指数（绝对值均为不超过 1000 的整数）。数字间以空格分隔。
 *
 * 输出格式:
 * 以与输入相同的格式输出导数多项式非零项的系数和指数。数字间以空格分隔，但结尾不能有多余空格。注意“零多项式”的指数和系数都是 0，但是表示为 0 0。
 *
 */

/**
 * 解题思路：
 *      1, 将输入的字符串，每两个作为（分零系数，指数）
 *      2, 判断是否系数和指数是否含有零
 *          如果没有的话，进入求导，输出
 *          如果有的话，不打印
 *      3, 如果知道最后没有进入求导的过程的话，就直接输出"0 0"
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag =false;
        while (sc.hasNext()){
            int M = sc.nextInt(); // 系数
            int N = sc.nextInt(); // 指数
            if (M*N!=0){
                if (flag){
                    System.out.print(" ");
                }else {
                    flag = true;
                }
                System.out.print(M*N+" "+(N-1));
            }
        }
        sc.close();
        if (!flag){
            System.out.print("0 0");
        }
    }
}
























