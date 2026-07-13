class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String str = cleaned.toString();
        int i= 0;
        int j= str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
