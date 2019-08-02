package PAT_1006;

import java.util.Scanner;
import java.util.Arrays;


class Main{
    public static final int number = 1000;

    public static String repeatStr(char letter,int n){
        char[] chars = new char[n];
        Arrays.fill(chars, letter);
        String result = new String(chars);
        return result;
    }

    public static void main(String[] args) {
        int bai=0,shi=0,ge=0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num < number){
            bai = num/100;
            shi = (num/10)%10;
            ge = num%10;
        }
        System.out.print(repeatStr('B',bai)+repeatStr('S', shi));
        for(int i=1;i<=ge;i++){
            System.out.print(i);
        }
        in.close();
    }
}