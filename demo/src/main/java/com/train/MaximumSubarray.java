package com.train;

/**
 * Created by 张超 on 2017/12/18.
 */
//Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
//For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
//the contiguous subarray [4,-1,2,1] has the largest sum = 6.
public class MaximumSubarray {
    //copy
    public int maxSubArray2(int[] A) {
        if(A==null || A.length==0)
            return 0;
        int global = A[0];
        int local = A[0];
        for(int i=1;i<A.length;i++)
        {
            local = Math.max(A[i],local+A[i]);
            global = Math.max(local,global);
        }
        return global;
    }
    public int maxSubArray(int[] nums) {
        return 0;
    }
}
