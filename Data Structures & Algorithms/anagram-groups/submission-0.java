class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String c : strs){
            char[] chr = c.toCharArray();
            Arrays.sort(chr);
            String key = new String(chr);

            List<String> group = new ArrayList<>();

            if (!map.containsKey(key)){
                group.add(c);
                map.put(key, group);
            }
            else{
                map.get(key).add(c);
            }
            
        }

        return new ArrayList<>(map.values());
        
    }
}
