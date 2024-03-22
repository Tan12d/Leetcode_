class Solution {
    public int findNumbers(int[] a) {
        int c=0;

        for(int i=0;i<a.length;i++)
        {
            int digits = (int)Math.log10(a[i])+1;

            if(digits%2==0) c++;
        }

        return c;
    }
}