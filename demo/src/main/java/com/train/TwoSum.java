package com.train;

/**
 * Created by 张超 on 2017/11/23.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ret=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int x=nums[i]+nums[j];
                if(x==target){
                    ret[0]=i;
                    ret[1]=j;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        TwoSum t=new TwoSum();
        int[] i=new int[4];
        i[0]=1;
        i[1]=2;
        i[2]=3;
        i[3]=5;
        System.out.println(t.twoSum(i,9));
    }
}
