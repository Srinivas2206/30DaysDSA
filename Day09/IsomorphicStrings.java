package Day09;

import java.util.HashMap;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int i = 0;
        StringBuilder key1 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!map1.containsKey(c)) {
                map1.put(c, i++);
            }
            key1.append('#').append(map1.get(c));
        }

        int j = 0;
        StringBuilder key2 = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (!map2.containsKey(c)) {
                map2.put(c, j++);
            }
            key2.append('#').append(map2.get(c));
        }

        return key1.toString().equals(key2.toString());
    }

}
