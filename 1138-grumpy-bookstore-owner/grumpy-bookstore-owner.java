class Solution {
    public int maxSatisfied1(int[] customers, int[] grumpy, int minutes) 
    {
        int sum=0;

        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
            }
        }

        int satisfaction = sum;
        int start=0;
        int end=start+minutes-1;
        int tempSum=0;

        for(int i=start;i<=end;i++)
        {
            if(grumpy[i]==0)
            {
                tempSum+=customers[i];
            }
        }
        
        int maxWindows=tempSum;
        start++;
        end++;

        while(end<customers.length)
        {
            if(grumpy[start-1]==1)
            {
                tempSum=tempSum-customers[start-1];
            }

            if(grumpy[end]==1)
            {
                tempSum=tempSum+customers[end];
            }

            maxWindows = Math.max(tempSum, maxWindows);
            start++;
            end++;
        }

        return (satisfaction+maxWindows);
    }

    public int maxSatisfied(int customers[], int grumpy[], int X)
    {
        int sum=0;

        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
            }
        }

        int satisfaction = sum;
        int start=0;
        int end=start+X-1;

        while(end<customers.length)
        {
            int tempSum=0;

            for(int i=start;i<=end;i++)
            {
                if(grumpy[i]==1)
                {
                    tempSum+=customers[i];
                }

                satisfaction = Math.max(satisfaction, (sum+tempSum));
            }

            start++;
            end++;
        }

        return satisfaction;
    }
}