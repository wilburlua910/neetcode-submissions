class Solution:
    def isPalindrome(self, s: str) -> bool:

        
        newStr = ''

        for item in s:
            if item.isalnum():
                newStr = newStr + item.lower()
        
        return newStr == newStr[::-1]
        
        