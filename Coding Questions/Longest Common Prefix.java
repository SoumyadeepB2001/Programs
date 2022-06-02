/*
 Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.

https://leetcode.com/problems/longest-common-prefix/
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int subString = 0;
        if (strs[0].equals("") || strs.length == 0) // if first element is ""
            return "";
        while (subString <= strs[0].length()) {
            subString++;
            if (subString <= strs[0].length())
                s = strs[0].substring(0, subString);
            else
                return s;
            for (int i = 1; i < strs.length; i++) {
                if (subString <= strs[i].length()) {
                    System.out.println(i);
                    if (!s.equals(strs[i].substring(0, subString)))
                        return s.substring(0, subString - 1);
                } else
                    return s.substring(0, subString - 1);

            }
        }
        return strs[0];
    }
}