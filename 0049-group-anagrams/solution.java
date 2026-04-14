class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i = 0; i<strs.length; i++) {
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            String string = new String(array);
            if(!map.containsKey(string)) {
                map.put(string, new ArrayList<>());
            }
            map.get(string).add(strs[i]);
        }
        return new ArrayList<>(map.values());    
    }
}
