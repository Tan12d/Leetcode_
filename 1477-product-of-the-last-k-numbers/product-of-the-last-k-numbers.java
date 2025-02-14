class ProductOfNumbers {

    List<Integer> l;

    public ProductOfNumbers() 
    {
        l=new ArrayList<Integer>();
    }
    
    public void add(int num) 
    {
        l.add(num);
    }
    
    public int getProduct(int k) 
    {
    	int n=l.size(), product=1;
    	
        for(int i=n-1;i>=(n-k);i--)
        {
        	product*=l.get(i);
        }
        
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */