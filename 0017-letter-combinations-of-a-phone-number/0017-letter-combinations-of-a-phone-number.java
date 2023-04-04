class Solution {
    String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<String>();
        }
      return combinations(digits,"");
    }
    public List<String> combinations(String digits,String ans){
        if(digits.isEmpty()){
            ArrayList<String> answers = new ArrayList<>();
            answers.add(ans);
            return answers;
        }
        ArrayList<String> list = new ArrayList<>();
        String let = (letters[(digits.charAt(0)) - '0']);
        for(int i = 0 ; i < let.length(); i++){
            list.addAll(combinations(digits.substring(1),ans + let.charAt(i)));
        }
        return list;
    }
}