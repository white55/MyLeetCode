package com.train;

/**
 * Created by 张超 on 2017/12/11.
 */
//Implement strStr().
//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
public class ImplementstrStr28 {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
