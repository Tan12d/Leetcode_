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
        if(idx_num.containsKey(index))
        {
            int old_value = idx_num.get(index);
            
            if(old_value == number) return;

            num_indices.get(old_value).remove(index);

            if(num_indices.get(old_value).isEmpty())
            {
                num_indices.remove(old_value);
            }

        }

        idx_num.put(index, number);
        num_indices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);        
    }
    
    public int find(int number) 
    {
        if(!num_indices.containsKey(number)) return -1;

        return num_indices.get(number).first(); 
    }
}
