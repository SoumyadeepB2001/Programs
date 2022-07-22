import java.util.*;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;

        if (s.length() == 1)
            return map.get(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            int s1 = map.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = map.get(s.charAt(i + 1));

                if (s1 >= s2)
                    num = num + s1;
                else {
                    i++;
                    num = num + s2 - s1;
                }
            } else
                num = num + s1;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.romanToInt("III"));
        System.out.println(ob.romanToInt("MCMXCIV"));
        System.out.println(ob.romanToInt("LVIII"));
    }
}



