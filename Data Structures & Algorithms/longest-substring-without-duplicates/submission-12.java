class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        // Map stores the character and its most recent index
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0; // The left boundary of our window
        
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            
            // If we have seen this char, move the start pointer 
            // to the right of the previous occurrence.
            if (map.containsKey(c)) {
                // Math.max is vital here because we don't want to move 'start' 
                // backward if the duplicate is outside our current window.
                start = Math.max(start, map.get(c) + 1);
            }
            
            map.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}