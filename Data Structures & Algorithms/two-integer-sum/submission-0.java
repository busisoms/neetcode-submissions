class Solution {
    public int[] twoSum(int[] nums, int target) {
        int current = 0;
        int[] result = new int[2];

        while (current != nums.length){
            for (int i = current + 1; i < nums.length; i++){
                if (nums[current] + nums[i] == target){
                    result[0] = current;
                    result[1] = i;
                    return result;
                }

            }
            current++;
        }

        return result;
    }
}
