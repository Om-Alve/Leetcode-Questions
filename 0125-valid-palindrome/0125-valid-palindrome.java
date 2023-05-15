class Solution {
    public boolean isPalindrome(String s) {
        String p="";
        s=s.trim();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                p+=s.charAt(i);
            }
        }
        return Palindrome(p);
    }
    private boolean Palindrome(String s){
        int st=0;
        int e=s.length()-1;
        while(st<=e){
         if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}