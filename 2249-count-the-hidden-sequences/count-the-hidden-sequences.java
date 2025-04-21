class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) 
    {
        int prefix_sum = 0;
        int large = differences[0];
        int small = differences[0];

        for(int i: differences)
        {
            prefix_sum += i;
            large = Math.max(large, prefix_sum);
            small = Math.min(small, prefix_sum);
        }
        
        int ans = 0;

        for(int i=lower;i<=upper;i++)
        {
            if((i+small)>=lower && (i+large)<=upper) ans++;
        }
        
        return ans;
    }
}