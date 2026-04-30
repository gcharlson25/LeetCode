class TimeMap {
    private HashMap<String, List<String>> values;
    private HashMap<String, List<Integer>> timestamps;

    public TimeMap() {
        values = new HashMap<>();
        timestamps = new HashMap<>();
    }   
    
    public void set(String key, String value, int timestamp) {
        if(!values.containsKey(key)) {
            values.put(key, new ArrayList<>());
            timestamps.put(key, new ArrayList<>());            
        }
        values.get(key).add(value);
        timestamps.get(key).add(timestamp);  
    }
    
    public String get(String key, int timestamp) {
        String min = "";
        int left = 0;
        if(!timestamps.containsKey(key)) {
            return "";
        }
        int right = timestamps.get(key).size()-1;
        while(left <= right) {
            int middle = (left + right) / 2;
            if(timestamps.get(key).get(middle) <= timestamp) {
                min = values.get(key).get(middle);
                left = middle + 1;
            }   
            else if(timestamps.get(key).get(middle) > timestamp) {
                right = middle -1;
            }

        }
        return min;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
