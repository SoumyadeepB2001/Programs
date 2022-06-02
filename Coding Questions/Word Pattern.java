/*
 Word Pattern

 Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

 

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:

Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
 

Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.

https://leetcode.com/problems/word-pattern/
 */

import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        int i = 0, c = 0, len = pattern.length();

        ArrayList<String> h1 = new ArrayList<String>();
        ArrayList<String> h2 = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            String ch1 = st.nextToken();
            i++;
            if (!h1.contains(ch1))
                h1.add(ch1);

            if (i <= len)
                if (!h2.contains(Character.toString(pattern.charAt(c))))
                    h2.add(Character.toString(pattern.charAt(c)));
            c++;
        }

        if (h1.size() != h2.size() || i != len)
            return false;
        else {
            c = 0;
            s = s + " ";
            for (i = 0; i < h1.size(); i++) {
                s = s.replace(h1.get(i) + " ", Integer.toString(c));
                pattern = pattern.replace(h2.get(i), Integer.toString(c));
                c++;
            }

            if (s.equals(pattern))
                return true;
            else
                return false;
        }
    }
}
