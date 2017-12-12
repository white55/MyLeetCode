package com.train;

/**
 * Created by 张超 on 2017/12/12.
 */
//Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would
// be if it were inserted in order.
//You may assume no duplicates in the array.
//    Input: [1,3,5,6], 5
//            Output: 2
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int j=nums.length-1;
        if(target<=nums[0]){
            return 0;
        }
        if(target==nums[j]){
            return j;
        }
        if(target>nums[j]){
            return j+1;
        }
        for(int i=0;i<j+1;i++){

            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return 0;
    }
    public int searchInsert2(int[] nums, int target) {
        int i = 0;
        int j = 0;
        for(i = 0; i< nums.length; i++){
            if(target == nums[i]) {
                return i;
            }
        }

        for(j = 0; j< nums.length; j++){
            if(nums[j]> target){
                return j;
            }

        }
        return j;

    }
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
        int[] x=new int[2];
        x[0]=1;
        x[1]=3;
        searchInsertPosition.searchInsert(x,2);
        searchInsertPosition.searchInsert2(x,2);
    }
}
