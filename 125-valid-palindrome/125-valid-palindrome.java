class Solution {
    public boolean isPalindrome(String s) {
        String string = "";
        for(char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                string += c;
            }
        }
        
        string = string.toLowerCase();
        
        int left = 0;
        int right = string.length()-1;
        
        while(left <= right){
            if(string.charAt(left) != string.charAt(right)){
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}