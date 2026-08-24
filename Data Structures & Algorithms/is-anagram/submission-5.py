class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mine = {}
        yours = {}
        for i in s:
            mine[i] = mine.get(i, 0) + 1
        for j in t:
            yours[j] = yours.get(j, 0) + 1
        
        return mine == yours
        