package com.train;

/**
 * Created by 张超 on 2017/11/27.
 */
//Determine whether an integer is a palindrome. Do this without extra space.
    //判断一个integer是不是回文数
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber p =new PalindromeNumber();
        System.out.println(p.isPalindrome(123211));
    }
    //自己的
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        if(str == null || str.length() == 1){
            return true;
        }
        char[] ch = str.toCharArray();//字符串转换成字符数组
        int len = str.length();
        for(int i= 0; i< len/ 2; i++) {
            ch[i]^= ch[len- 1- i];
            ch[len- 1- i]^= ch[i];
            ch[i]^= ch[len- 1- i];
        }
        String str2=new String(ch);
        if( str.compareTo(str2)==0){
            return true;
        }else {
            return false;
        }

    }
    //人家的
    public boolean isPalindrome2(int x) {
        int y=0;
        int z=x;
        while(z>0){
            y=y*10+z%10;
            z=z/10;
        }
        if(x==y)
            return true;
        return false;
    }
}
