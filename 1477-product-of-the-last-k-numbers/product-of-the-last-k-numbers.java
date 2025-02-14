class ProductOfNumbers {

    List<Integer> l;

    public ProductOfNumbers() 
    {
        l=new ArrayList<Integer>();
        l.add(1);
    }
    
    public void add(int num) 
    {
    	if(num==0) {
    		l.clear();
    		l.add(1);
    		return;
    	}
    	
    	int val=l.get(l.size()-1);
        l.add(val*num);
    }
    
    public int getProduct(int k) 
    {
    	int n=l.size();
        
        if(n<=k) return 0; 
        
        return l.get(n-1)/l.get(n-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */