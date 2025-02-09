class Solution {
    public long countBadPairs(int[] nums) 
    {
        long good_pairs=0;
        
        HashMap<Integer, Integer> good_pair_freq=new HashMap<Integer, Integer>();
        
        for(int j=0;j<nums.length;j++)
        {
        	if(good_pair_freq.containsKey(nums[j]-j)) 
        	{
        		good_pairs+=good_pair_freq.get(nums[j]-j);
        	}
        		
        	good_pair_freq.put(nums[j]-j, good_pair_freq.getOrDefault(nums[j]-j, 0)+1);
        }

        return 1L * nums.length * (nums.length-1) / 2 - good_pairs;           
    }
}