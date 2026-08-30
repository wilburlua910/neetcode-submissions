class Solution:
    def isValid(self, s: str) -> bool:
        stackArr = []
        
        for i in range(len(s)):
            # Push opening brackets
            if s[i] in ["[", "(", "{"]:
                stackArr.append(s[i])
            
            # Handle closing brackets
            elif s[i] == "]":
                if not stackArr or stackArr[-1] != "[":
                    return False
                stackArr.pop()
                
            elif s[i] == ")":
                if not stackArr or stackArr[-1] != "(":
                    return False
                stackArr.pop()
                
            elif s[i] == "}":
                if not stackArr or stackArr[-1] != "{":
                    return False
                stackArr.pop()
        
        return not stackArr