class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        m = {}
        n = {}
        for item in s:
            m[item] = m.get(item, 0) + 1
        
        for item in t:
            n[item] = n.get(item, 0) + 1

        return m == n

        