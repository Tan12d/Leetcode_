class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        if(nums.length==1) return ans;

        int max=Integer.MIN_VALUE;

        for(int i:nums)
        {
            max = Math.max(max,i);
        }

        int freq[] = new int[max+1];

        for(int i:nums)
        {
            freq[i]++;
        }

        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==2)
            {
                ans.add(i);
            }
        }

        return ans;
    }
}