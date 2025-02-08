class NumberContainers {

    HashMap<Integer, Integer> idx_num;
    HashMap<Integer, TreeSet<Integer>> num_indices;

    public NumberContainers() 
    {
        idx_num = new HashMap<Integer, Integer>();
        num_indices = new HashMap<>();        
    }
    
    public void change(int index, int number) 
    {
        // If the number exists
        if(idx_num.containsKey(index))
        {
            int old_value = idx_num.get(index);

            if(old_value == number) return;

            num_indices.get(old_value).remove(index);
        }

        // Insert a new Number
        idx_num.put(index, number);
        num_indices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);        
    }
    
    public int find(int number) 
    {
        TreeSet<Integer> res = num_indices.getOrDefault(number, new TreeSet<>());

        return res.isEmpty() ? -1 : res.first();  
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */