class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<1) return "";

        int maxLength;
        int start=0,end=0;
        
        for (int i = 0; i < s.length(); i++) {
            maxLength=Math.max(checkPalindrome(s,i,i),checkPalindrome(s,i,i+1));
            if(maxLength>end-start)
            {
                start=i-((maxLength-1)/2);
                end=i+(maxLength/2);
            }
        }
        return s.substring(start,end+1);
    }
    public static int checkPalindrome(String s, int left, int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            //Expand the selection
            left--;
            right++;
        }
        return right-left-1; //This is the length of the palindrome
    }
    public static void main(String[] args) {
        Solution ob = new Solution();
        System.out.println(ob.longestPalindrome("babad"));
        System.out.println(ob.longestPalindrome("cbbd"));
        System.out.println(ob.longestPalindrome("abba"));
    }
}