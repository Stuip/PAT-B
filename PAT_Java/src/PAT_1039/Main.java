package PAT_1039;

/***
 * @author Tang
 * @Date 2019-07-30
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。
 * 于是小红要你帮忙判断一下，某串珠子里是否包含了全部自己想要的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。
 * 为方便起见，我们用[0-9]、[a-z]、[A-Z]范围内的字符来表示颜色。例如在图1中，第3串是小红想做的珠串；
 * 那么第1串可以买，因为包含了全部她想要的珠子，还多了8颗不需要的珠子；第2串不能买，因为没有黑色珠子，并且少了一颗红色的珠子。
 *
 * 输入格式：
 *      每个输入包含 1 个测试用例。每个测试用例分别在 2 行中先后给出摊主的珠串和小红想做的珠串，两串都不超过 1000 个珠子。
 * 输出格式：
 *      如果可以买，则在一行中输出 Yes 以及有多少多余的珠子；如果不可以买，则在一行中输出 No 以及缺了多少珠子。其间以 1 个空格分隔。
 * 输入样例 1：
 *      ppRYYGrrYBR2258
 *      YrR8RrY
 * 输入样例：
 *      Yes 8
 * 输入样例 2：
 *      ppRYYGrrYB225
 *      YrR8RrY
 * 输出样例 2：
 *      No 2
 */



public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String havedLack = sc.nextLine();
        String wantedLack =sc.nextLine();
        ArrayList<Character> al = new ArrayList<>();
        for (int i=0;i<havedLack.length();i++){  // 循环加入摊贩所拥有的珠子
            al.add(havedLack.charAt(i));   // 将摊贩的珠子加入al中
        }
        int need = 0;  // 缺少珠子
        for (int i=0;i<wantedLack.length();i++){  // 遍历想要制作的珠串
            if (al.contains(wantedLack.charAt(i))){  // 存在就移除
                int index  =al.indexOf(wantedLack.charAt(i));
                al.remove(index);
            }else {
                need++;
            }
        }
        if (need==0){
            System.out.print("Yes "+al.size());
        }else {
            System.out.print("No "+need);
        }
    }
}
