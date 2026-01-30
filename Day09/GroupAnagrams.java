package Day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] freq = new int[26];
            for (char c : s.toCharArray())
                freq[c - 'a']++;

            // Build Key
            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(freq[i]);
            }
            map.putIfAbsent(key.toString(), new ArrayList<>());
            map.get(key.toString()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
