class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:

        queue = deque()

        minimum = 100000

        sum1 = 0

        

        if len(nums) == 0: 
            return 0
        
        if sum(nums) < target:
            return 0
        


        for i in range(len(nums)):
            sum1 = sum1 + nums[i]
            queue.append(nums[i])
            
            while sum1 >= target:

                minimum = min(minimum, len(queue))
                
                number = queue.popleft()
                sum1 = sum1 - number
            
            
            
            

        
        
        

        return minimum



        