class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxRain = 0 
        left, right = 0, len(heights) - 1

        while left < right:
            base = right - left 
            height = min(heights[left], heights[right])
            localMaxRain = base * height
            maxRain = max(maxRain, localMaxRain)
            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1

        return maxRain
        