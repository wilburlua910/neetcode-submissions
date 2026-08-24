class Solution {
    public int[] productExceptSelf(int[] nums) {

        

        /*int[] arr = new int[nums.length];

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

        return arr;*/


        

        int[] arr = new int[nums.length];
        int multi = 1;
        int zero_count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zero_count++;
                continue;
            }
            
            multi = multi * nums[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (nums[i] == 0 && zero_count > 1) {
                arr[i] = 0;
            } else if (nums[i] == 0 && zero_count > 0){
                 arr[i] = multi;

            } else if (nums[i] != 0 && zero_count > 0){
                arr[i] = 0;
            } else {
                arr[i] = multi/nums[i];
            }
           
            

        }
        return arr;
    }
}  
