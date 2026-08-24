class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)

        for item in strs:
            sort = ''.join(sorted(item))
            res[sort].append(item)

        return list(res.values())