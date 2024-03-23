class NumArray {

    HashMap<Integer,Integer> h;

    public NumArray(int[] nums) 
    {
        h=new HashMap<>();
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            h.put(i,sum);
        }
    }
    
    public int sumRange(int left, int right)
    {
        if(left==0)
        {
            return h.get(right);
        }

        return h.get(right)-h.get(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */