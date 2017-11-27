package com.train;

/**
 * Created by 张超 on 2017/11/24.
 */

public class HammingDistence {
    public static void main(String[] args) {
        HammingDistence hm=new HammingDistence();
        int x=5;
        int y=3;
        hm.hd1(x,y);
        hm.hm2(x,y);
        int s = Integer.parseInt("");
        if(String.valueOf(s)==null){
            System.out.println("null");
        }
        System.out.println(s);
    }
    //自己写的笨方法
    void hd1(int x,int y){
        int distense=0;
        String xb=Integer.toBinaryString(x);
        String yb=Integer.toBinaryString(y);
        int diff=xb.length()-yb.length();
        diff=Math.abs(diff);
        int max=yb.length();
        if(xb.length()>yb.length()){
            max=xb.length();
            for(int j=0;j<diff;j++){
                yb="0"+yb;
            }
        }else {
            for(int j=0;j<diff;j++){
                xb="0"+xb;
            }
        }
        for(int i=0;i<max;i++){
            if(xb.charAt(i)!=yb.charAt(i)){
                distense++;
            }
        }
        System.out.println(distense);
    }
    //leetCode 上看到的位运算方法，很机智，学来的
    //异或
    void hm2(int x,int y){
         int distance=0;
         int xor=x^y;
         while (xor>0){
             ++distance;
             xor=xor&(xor-1);
         }
        System.out.println(distance);
    }
}
