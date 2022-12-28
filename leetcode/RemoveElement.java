//This is a leetcode solution that I have written in java for solving the problem statement from https://leetcode.com/problems/remove-element/

import java.util.*;
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0, temp = 0, k;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = -1;
                count++;
            }
        }
        k = nums.length - count;

        //sorting elements in descending order for placing the array elements(which are not equal to the element to be removed) to the first
        for (int i = 0; i < nums.length; i++) {   
        for (int j = i+1; j < nums.length; j++) {   
           if(nums[i] < nums[j]) {  
               temp = nums[i];  
               nums[i] = nums[j];  
               nums[j] = temp;  
           }   
        }   
        }         
        return k;
    }
}