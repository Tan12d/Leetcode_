class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        int first=0, second=0, j=0;
		int n1=nums1.length, n2=nums2.length;
		
		int res[][] = new int[n1+n2][2]; 
		
		while(first<n1 && second<n2)
		{
			if(nums1[first][0]==nums2[second][0])
			{
				res[j][0]=nums1[first][0];
				res[j][1]=nums1[first][1]+nums2[second][1];
				
				first++;
				second++;
			}
			
			else if(nums1[first][0]<nums2[second][0])
			{
				res[j][0] = nums1[first][0];
				res[j][1] = nums1[first][1];
				
				first++;
			}
			
			else
			{
				res[j][0] = nums2[second][0];
				res[j][1] = nums2[second][1];
				
				second++;
			}
			
			j++;
		}
		
		while(first<n1)
		{
			res[j][0]=nums1[first][0];
			res[j][1]=nums1[first][1];
			
			first++;
			j++;
		}
		
		while(second<n2)
		{
			res[j][0]=nums2[second][0];
			res[j][1]=nums2[second][1];
			
			second++;
			j++;
		}
		
		return Arrays.copyOf(res, j);
    }
}