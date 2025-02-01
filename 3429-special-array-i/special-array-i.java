class Solution {
    public boolean isArraySpecial(int[] nums) 
    {
        if(nums.length==1) return true;

        // Method-1

        // boolean flag[] = new boolean[nums.length];

        // int j=0;
        
        // for(int i:nums)
        // {
        //     flag[j++] = (i%2 == 0 ? true : false);
        // }

        // for(int i=1;i<flag.length;i++)
        // {
        //     if(flag[i]==flag[i-1]) return false;
        // }


        // Method-2

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]%2 == nums[i-1]%2) return false;
        }

        return true;
    }
}