class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> mapped = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            mapped.put(s1.charAt(i), mapped.getOrDefault(s1.charAt(i),0) + 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int curr = 0;
            for (int j = i; j < s2.length(); j++) {
                char a = s2.charAt(j);
                map.put(a, map.getOrDefault(a, 0) + 1);

                if (mapped.getOrDefault(a, 0) < map.get(a)) {
                    break;
                }

                if (mapped.getOrDefault(a, 0) == map.get(a)) {
                    curr++;
                }

                if (curr == mapped.size()) {
                    return true;
                }
            }
        }
        return false;
    }
}
