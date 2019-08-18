package PAT_1022;

/***
 * @description
 * @author Tang
 * @Date 2019-08-18
 */

import java.util.Scanner;

/**
 * 输入两个非负 10 进制整数 A 和 B (≤2^30−1)，输出 A+B 的 D (1<D≤10)进制数。
 *
 * 输入格式：
 *      输入在一行中依次给出 3 个整数 A、B 和 D。
 *
 * 输出格式：
 *      输出 A+B 的 D 进制数。
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int ascii = Integer.parseInt(input[2]);
        int  C = A + B;
        System.out.println(Integer.toString(C,ascii));;
    }
}
