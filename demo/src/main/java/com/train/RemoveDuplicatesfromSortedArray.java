package com.train;

/**
 * Created by 张超 on 2017/12/7.
 */
    //Remove Duplicates from Sorted Array
    //Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    --k;
                }
            }
        }if(k==0){
            k=1;
        }
        return   k;
    }  public int removeDuplicates2(int[] A) {
        if (A.length==0) return 0;
        int j=0;
        for (int i=0; i<A.length; i++){
            if (A[i]!=A[j]){
                A[++j]=A[i];
            }
        }
        return ++j;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray re=new RemoveDuplicatesfromSortedArray();
        int[] ss=new int[3];
        ss[0]=1;
        ss[1]=1;
        ss[2]=2;

        System.out.println(re.removeDuplicates(ss));
    }
}
