from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        a = defaultdict(list)
        #Key is char signature and the values is an array

        ans = []

        for i in range(len(strs)):
            word = strs[i]

            wordSig = {}
            for c in word:
                wordSig[c] = wordSig.get(c, 0) + 1

            sig = tuple(sorted(wordSig.items()))
            a[sig].append(word)
        
        for item in a.values():
            ans.append(item)

        return ans

