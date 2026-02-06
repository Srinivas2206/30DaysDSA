package Day29;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        int num = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (char c : s.toCharArray()) {
            num += map.get(c);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int num1 = map.get(s.charAt(i));
            int num2 = map.get(s.charAt(i + 1));
            if (num1 < num2) {
                num -= 2 * num1;
            }
        }
        return num;
    }
}
