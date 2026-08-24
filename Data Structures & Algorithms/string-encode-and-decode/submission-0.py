class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""
        delim = ":;"
        for s in strs:
            res = res + s + delim
        return res
        

    def decode(self, s: str) -> List[str]:
        delim = ":;"
        i = 0
        res = []
        word = ""
        while i < len(s):
            if s[i] == ':' and s[i+1] == ';':
                res.append(word)
                word = ""
                i+=2
            else:
                word = word + s[i]
                i+=1
        
        return res




