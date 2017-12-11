package com.train;

/**
 * Created by 张超 on 2017/12/8.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            while (nums[i]==val&&i<length){
                nums[i]=nums[--length];
            }

        }
        for(int j=0;j<nums.length;j++){
            System.out.println(nums[j]);
        }
        return nums.length;
    }
    //耗时最短的方法，我觉得最机智了！！！
    public int removeElement2(int[] a, int val) {
        int start = 0;
        int len = a.length;
        int begin = 0;
        for (int i = 0; i < len; i++)
            if (a[i] != val)
                a[begin++] = a[i];
        return begin;
    }
    public static void main(String[] args) {
        RemoveElement removeElement=new RemoveElement();
        int[] ss=new int[5];
        ss[0]=1;
        ss[1]=1;
        ss[2]=2;
        ss[3]=2;
        ss[4]=1;
        removeElement.removeElement(ss,1); 
        removeElement.removeElement2(ss,1);
    }
}
