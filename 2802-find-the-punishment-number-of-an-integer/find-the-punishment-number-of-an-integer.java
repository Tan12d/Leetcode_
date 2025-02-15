class Solution {
    public int punishmentNumber(int n) 
    {
        int square=0;
        int val=0;

        for(int i=0;i<=n;i++)
        {
            square=i*i;

            if(partition(Integer.toString(square), i, 0)) val+=square;
        }
        
        return val;
    }


    public boolean partition(String squareStr, int target, int index)
    {
        if(index==squareStr.length()) return target==0;

        int sum=0;
        for(int i=index;i<squareStr.length();i++)
        {
            sum=sum*10+(squareStr.charAt(i)-'0');

            if(sum>target) break;

            if(partition(squareStr, target-sum, i+1)) return true;
        }

        return false;
    }
}