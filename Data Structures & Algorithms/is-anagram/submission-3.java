class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap <Character, Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            char a = entry.getKey();
            int b = entry.getValue();

            if (!map2.containsKey(a)) return false;
            if (map2.get(a) != b) return false;
        }

        return true;



    }
}
