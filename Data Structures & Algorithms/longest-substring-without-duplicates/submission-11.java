class Solution {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> mapped = new HashMap<>();
        int longest = 0;
        int counter = 0;

        if (s.isEmpty()) {
            return longest;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if (mapped.containsKey(a)) {
                i = mapped.get(a) + 1;
                a = s.charAt(i);
                mapped = new HashMap<>();
                
                if (counter > longest) {
                    longest = counter;
                }
                counter = 0;

            }
            counter++;
            mapped.put(a, i);
        }
        
        if (counter > longest) {
            longest = counter;
        }
        return longest;
        
    }
}