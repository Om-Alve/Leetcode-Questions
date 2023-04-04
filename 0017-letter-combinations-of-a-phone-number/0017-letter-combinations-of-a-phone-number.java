class Solution {
    String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<String>();
        }
        ArrayList<String> ans = new ArrayList<>();
        combinations(digits,new StringBuilder(),ans);
      return ans;
    }
    public void combinations(String digits,StringBuilder p,ArrayList<String> ans){
        if(digits.isEmpty()){
            ans.add(p.toString());
            return;
        }
        String let = (letters[(digits.charAt(0)) - '0']);
        for(int i = 0 ; i < let.length(); i++){
            p.append(let.charAt(i));
            combinations(digits.substring(1), p,ans);
            p.deleteCharAt(p.length() - 1);
        }
    }
}