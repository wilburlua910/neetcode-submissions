class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        counter = {}

        # List of list to store freq bucket
        freq = [[] for i in range(len(nums)+1)]

        for i in range(len(nums)):
            counter[nums[i]] = counter.get(nums[i], 0) + 1
        
        for num, count in counter.items():
            #num = 1
            #count = occurence
            freq[count].append(num)

        ans = []

        index = len(nums) 
        while k > 0:
            currentList = freq[index] 

            while k > 0 and currentList:
                ans.append(currentList.pop())
                k = k - 1
            
            index = index - 1
        return ans





        


        