class Solution {
    String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<String>();
        }
        ArrayList<String> ans = new ArrayList<>();
        combinations(digits,"",ans);
      return ans;
    }
    public void combinations(String digits,String p,ArrayList<String> ans){
        if(digits.isEmpty()){
            ans.add(p);
            return;
        }
        String let = (letters[(digits.charAt(0)) - '0']);
        for(int i = 0 ; i < let.length(); i++){
            combinations(digits.substring(1),p + let.charAt(i),ans);
        }
    }
}