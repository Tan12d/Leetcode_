class Solution 
{
    public int maxAbsoluteSum(int[] nums) 
    {
        int minPoint = 0;
        int maxPoint = 0;
        int prefixSum = 0;

        for (int num : nums) 
        {
            prefixSum += num;
            minPoint = Math.min(minPoint, prefixSum);
            maxPoint = Math.max(maxPoint, prefixSum);
        }

        return maxPoint - minPoint;
    }
}