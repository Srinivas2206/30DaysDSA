package Day08;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        int min_len = Integer.MAX_VALUE;
        ;
        for (int i = 0; i < strs.length; i++) {
            min_len = Math.min(min_len, strs[i].length());
        }
        int i = 0;
        while (i < min_len) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return res.toString();
                }

            }
            res.append(ch);
            i++;
        }
        return res.toString();
    }
}
