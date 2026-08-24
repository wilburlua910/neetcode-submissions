class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        m = {}

        for index, value in enumerate(nums):
            diff = target - nums[index]

            if diff in m:
                i1 = m.get(diff)
                i2 = index
            
            m[value] = index
            
        return [i1, i2]

            