class Solution {
    public int search(int[] nums, int target) {
        int fp = 0;
        int lp = nums.length - 1;

        while (lp >= fp) {
            int mid = (int) lp + (int) Math.floor((fp - lp)/2);
            if (nums[mid] > target) {
                lp = mid - 1;
            } else if (nums[mid] < target) {
                fp = mid + 1;
            } else {
                return mid;
            }


        }

        return -1;
    }
}
