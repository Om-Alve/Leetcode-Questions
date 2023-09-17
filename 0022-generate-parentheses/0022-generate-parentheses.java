class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        possibleParenthesis("",0,0,n,results);
        return results;
    }
    void possibleParenthesis(String s,int open,int close,int n,List<String> result){
        if (open == close && open+close == n * 2){
            result.add(s);
        }
        if(open < n){
            possibleParenthesis(s+'(',open+1,close,n,result);
        }
        if(close < open){
            possibleParenthesis(s+')',open,close+1,n,result);
        }
    }
}