class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r){
            int found = numbers[l] + numbers[r];
            if (found == target) return new int[]{l + 1, r + 1};

            if (found > target){
                r--;
            }
            else {
                l++;
            }
        }

        throw new IllegalStateException("No Match found");
        
    }
}
