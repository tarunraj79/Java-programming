//This is a leetcode solution that I have written in java for solving the problem statement from https://leetcode.com/problems/two-sum/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    a[0]=i;
                    a[1]=j;    
                }
            }
            
        }
        return a;
        
    }
}