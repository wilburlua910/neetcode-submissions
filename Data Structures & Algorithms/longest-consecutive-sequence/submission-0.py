class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        unique = set(nums)
        longest = 0
        for item in unique:
            if (item - 1) not in unique:
                length = 1
                while (item + length) in unique:
                    length = length + 1
                longest = max(longest, length)
        return longest



        

        