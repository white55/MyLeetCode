package com.train;

/**
 * Created by 张超 on 2017/11/27.
 */
//Write a function to find the longest common prefix string amongst an array of strings.
    //编写一个函数来查找字符串数组中最长的通用前缀字符串
public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[3];
        strs[0]="aabc";
        strs[1]="aaqw";
        strs[2]="aaweq";
        longestCommonPrefix longestCommonPrefix=new longestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            //indexOf 返回字符串中indexof(String)中子串string在父串中首次出现的位置，从0开始，没有则返回-1
            while(strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }
}
