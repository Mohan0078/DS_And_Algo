class MyHashMap {

    // taking the array for hashing
    int map[];
    
    public MyHashMap() {
        // initializing
        map = new int[1000009];
        for(int i=0;i<map.length;i++)
        map[i] = -1;
    }
    
    // setting the value using the key
    public void put(int key, int value) {
        map[key] = value;
    }
    
    // getting the value using key
    public int get(int key) {
        return map[key];
    }
    
    // removing the value
    public void remove(int key) {
        map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */