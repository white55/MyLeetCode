package com.train;

/**
 * Created by 张超 on 2017/11/24.
 */
//Question:
//Given a 32-bit signed integer, reverse digits of an integer.
    //Note:
    //Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
    //For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ri=new ReverseInteger();
        int x= Integer.parseInt("1534006400");
        System.out.println(ri.reverse(x));
        System.out.println(ri.reverse2(x));
    }
    //自己的
    public int reverse(int x) {
        if(x==0){

        }
        int flag=0;
        int y=0;
        if(x<0){
            x=Math.abs(x);
            flag=1;
        }
        String rev="";
        while(x!=0){
            y=x%10;
            x=x/10;

                rev=rev+y;

        }
        if(flag==1){
            rev="-"+rev;
        }
        try {
            y=Integer.parseInt(rev);
        }catch (Exception e){
            return 0;
        }
        return y;
    }
    //抄来的
    public int reverse2(int x) {
        int output = 0;

        while (true) {
            if (x == 0) {
                return x;
            }

            output = output * 10 + x % 10;

            if ((x /= 10) == 0) {
                return output;
            }

            if (output > 214748364 || output < -214748364) {
                return 0;
            }
        }
    }
}
