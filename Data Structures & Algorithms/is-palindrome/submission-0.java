class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] sChar = s.toLowerCase().toCharArray();


        int l = 0;
        int r = sChar.length - 1;

        while (l < r){
            if (sChar[l] != sChar[r]) return false;

            l++;
            r--;
        }

        return true;
        
    }
}
