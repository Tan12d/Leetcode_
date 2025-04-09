class Solution {
    public int minOperations(int[] nums, int k) 
    {
        Arrays.sort(nums);
        
        int min = nums[0];
        
        HashSet<Integer> h= new HashSet<Integer>();

        for(int i=0;i<nums.length;i++) h.add(nums[i]);
        
        if(k<min) return h.size();
        
        else if(k==min) return h.size()-1;
        
        return -1;        
    }
}