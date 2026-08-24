class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        m = {}

        count = k
        n = 0
        out = []

        for item in nums:
            m[item] = m.get(item, 0) + 1

        while count > 0:
            key = max(m, key=m.get)
            out.append(key)
            m[key] = 0
            count = count - 1
            n = n + 1
        
        return out
