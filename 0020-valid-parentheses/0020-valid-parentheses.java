class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(')');
            }
            else if(ch == '{'){
                st.push('}');
            }
            else if(ch == '['){
                st.push(']');
            }
            else{
                if (st.empty()){
                    return false;
                }
                else{
                    if((char)(st.pop())!=ch){
                        return false;
                    }
                }
            }
        }
        return st.empty();
    }
}