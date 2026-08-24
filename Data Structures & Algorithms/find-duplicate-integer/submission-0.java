class Solution {
    public int findDuplicate(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int key = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key1 = entry.getKey();
            int value = entry.getValue();

            if (value > 1) {
                key = key1;
                break;
            }
        }

        return key;
        
    }
}
