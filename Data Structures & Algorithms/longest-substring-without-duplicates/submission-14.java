class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();

        if (s == null || s.length() == 0) return 0;

        for (int end = 0; end < s.length(); end++) {
            char a = s.charAt(end);

            if (map.containsKey(a)) {
                start = Math.max(map.get(a) + 1, start);
            }

            map.put(a, end);
            max = Math.max(max, end - start + 1);
            
        }
        return max;
    }
        
}