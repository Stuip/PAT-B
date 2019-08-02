package PAT_1037;

/***
 * @author Tang
 * @Date 2019-07-23
 */


import java.util.Scanner;

/**
 * 如果你是哈利·波特迷，你会知道魔法世界有它自己的货币系统 —— 就如海格告诉哈利的：“十七个银西可(Sickle)兑一个加隆(Galleon)，
 * 二十九个纳特(Knut)兑一个西可，很容易。”现在，给定哈利应付的价钱 P 和他实付的钱 A，你的任务是写一个程序来计算他应该被找的零钱。
 *
 * 输出格式：
 *      输入在 1 行中分别给出 P 和 A，格式为 Galleon.Sickle.Knut，其间用 1 个空格分隔。这里 Galleon 是 [0, 10^7]区间内的整数，
 *      Sickle 是 [0, 17) 区间内的整数，Knut 是 [0, 29) 区间内的整数。
 * 输入格式：
 *      在一行中用与输入同样的格式输出哈利应该被找的零钱。如果他没带够钱，那么输出的应该是负数。
 *
 * 输入样例 1：
 *          10.16.27 14.1.28
 * 输出样例 1：
 *          3.2.1
 * 输入样例 2：
 *          14.1.28 10.16.27
 * 输出样例 2：
 *          -3.2.1
 */

/**
 * 解题思路：
 *      1, 接受到应付钱和哈利实付的钱
 *      2, 封装到自己的货币对象的里面
 *      3, 将货币全部转化为Galleon,比较两者大小
 *          -- 如果实付的钱大于harry实付的钱，则将实付的钱减去harry的钱，但是需要体现为负数，则需要加"-"
 *          -- 如果实付的钱小于harry实付的钱，则将harry的钱减去实付的钱
 */

public class Main {

    /**
     * 合计货币得出Galleon
     * 29 Knut->1 Sickle;     17 Sickle->1 Galleon
     * @param coin
     * @return
     */
    public static int CountMoney(Coin coin){
        return (coin.Galleon*17 + coin.Sickle)*29 + coin.Knut;
    }

    public static void PrintCoin(Coin shouldMoney,Coin harryMoney){
        int change = CountMoney(harryMoney) - CountMoney(shouldMoney);
        if (change < 0){
            System.out.print("-");
            change = 0-change;
        }
        System.out.printf("%d.%d.%d",change / 29 / 17, change / 29 % 17, change % 29);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] moneyPay = sc.nextLine().split(" ");
        String[] ShouldPay = moneyPay[0].split("\\.");
        String[] HarryPay = moneyPay[1].split("\\.");
        Coin ShouldCoin = new Coin(ShouldPay[0],ShouldPay[1],ShouldPay[2]); // 需付
        Coin HarryCoin = new Coin(HarryPay[0],HarryPay[1],HarryPay[2]);  // 哈利付
        PrintCoin(ShouldCoin,HarryCoin);
        sc.close();
    }
}

class Coin{

    int Galleon;
    int Sickle;
    int Knut;

    public Coin(String Galleon,String Sickle,String Knut){
        this.Galleon=Integer.parseInt(Galleon);
        this.Sickle=Integer.parseInt(Sickle);
        this.Knut=Integer.parseInt(Knut);
    }
}



