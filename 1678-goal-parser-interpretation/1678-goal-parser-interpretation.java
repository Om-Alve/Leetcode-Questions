class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < command.length();i++){
            char c = command.charAt(i);
            if (c == 'G') {
                ans.append(c);
            }else if (c == '(' && command.charAt(i + 1) == ')') {
                ans.append("o");
                ++i;
            }else {
                ans.append("al");
                i += 3;
            }
        }
        return ans.toString();
    }
}