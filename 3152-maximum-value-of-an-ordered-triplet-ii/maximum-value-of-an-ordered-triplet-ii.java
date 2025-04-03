class Solution {
    public long maximumTripletValue(int[] nums) 
    {
        long res = 0;
        int maxVal = 0;
        int maxDiff = 0;
        
        for(int num: nums)
        {
            res = Math.max(res, (long) maxDiff*num);
            maxDiff = Math.max(maxDiff, maxVal-num);
            maxVal = Math.max(maxVal, num);
        }

        return res;
    }
}