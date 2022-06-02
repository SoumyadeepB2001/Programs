/*
 * Valid Palindrome
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric
 * characters.
 * Since an empty string reads the same forward and backward, it is a
 * palindrome.
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 2 * 10^5
 * s consists only of printable ASCII characters.
 * 
 * https://leetcode.com/problems/valid-palindrome/
 */

class Solution1 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left <= right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            int al = l;
            int rl = r;

            if ((al < 97 || al > 122) && !Character.isDigit(al)) {
                left++;
                continue;
            }
            if ((rl < 97 || rl > 122) && !Character.isDigit(rl)) {
                right--;
                continue;
            }
            if (l == r) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }

        }
        return true;
    }
}

// Another approach (Not recommended):

class Solution2 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String reverse = "";
        String original = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                original = original + s.charAt(i);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                reverse = reverse + s.charAt(i);
        }
        return (original.equals(reverse));

    }
}