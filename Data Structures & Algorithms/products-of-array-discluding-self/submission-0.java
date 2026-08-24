class Solution {
    public int[] productExceptSelf(int[] nums) {

        

        int[] arr = new int[nums.length];

        int curr = 1;

        

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    curr = curr * nums[j];
                }

            }
            arr[i] = curr;
            curr = 1;
        }

        return arr;
        
    }
}  
