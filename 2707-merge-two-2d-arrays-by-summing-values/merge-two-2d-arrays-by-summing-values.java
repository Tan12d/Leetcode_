class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) 
    {
        HashMap<Integer, ArrayList<Integer>> h = new HashMap<>();
		
		for(int i=0;i<nums1.length;i++)
		{
			int key=nums1[i][0];
			int value=nums1[i][1];
			
			h.putIfAbsent(key, new ArrayList<Integer>());
			h.get(key).add(value);
		}
		
		for(int i=0;i<nums2.length;i++)
		{
			int key=nums2[i][0];
			int value=nums2[i][1];
			
			h.putIfAbsent(key, new ArrayList<Integer>());
			h.get(key).add(value);
		}
		
		int res[][] = new int[h.size()][2];
		
		int j=0;
		
		for(Map.Entry<Integer, ArrayList<Integer>> entry: h.entrySet())
		{
			res[j][0]=entry.getKey();
			res[j][1]=entry.getValue().stream().mapToInt(Integer::intValue).sum();
			
			j++;
		}
        
        Arrays.sort(res, (a,b) -> Integer.compare(a[0], b[0]));

		return res;        
    }
}