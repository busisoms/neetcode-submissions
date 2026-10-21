class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        List<Map.Entry<Integer, Integer>> sortedByFreq = new ArrayList<>(map.entrySet());
        sortedByFreq.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) result[i] = sortedByFreq.get(i).getKey();

        return result;

        
    }
}
