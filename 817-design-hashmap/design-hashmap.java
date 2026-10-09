class MyHashMap {
    int[] MyHashMap=new int[10000001];
    public MyHashMap() {
        Arrays.fill(MyHashMap,-1);
    }
    
    public void put(int key, int value) {
        MyHashMap[key]=value;
    }
    
    public int get(int key) {
        return MyHashMap[key];
    }
    
    public void remove(int key) {
        MyHashMap[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */