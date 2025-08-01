class Solution 
{
    public List<List<Integer>> generate(int n) 
    {
        List<List<Integer>> v = new ArrayList<>(n);

        for(int i=0;i<n;i++)
        {
            v.add(new ArrayList<>(i+1));
        }

        int val=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    v.get(i).add(1);
                }

                else
                {
                    val = v.get(i-1).get(j-1) + v.get(i-1).get(j);
                    v.get(i).add(val);
                }
            }
        }

        return v;
    }
}