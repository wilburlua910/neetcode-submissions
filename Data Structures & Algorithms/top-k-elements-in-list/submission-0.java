class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = new int[k];

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < k; i++) {
            arr[i] = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            map.put(arr[i], 0);
        }

        return arr;
    }
}
