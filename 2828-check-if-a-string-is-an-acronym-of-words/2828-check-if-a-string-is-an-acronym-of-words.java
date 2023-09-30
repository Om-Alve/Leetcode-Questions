class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (s.length()!=words.size()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch != words.get(i).charAt(0)){
                return false;
            }
        }
        return true;
    }
}