class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String S = new StringBuilder(s).reverse().toString();
        if(S.equals(s)){
            return true;
        }
        return false;
    }
}