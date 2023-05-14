class Solution {
    public int romanToInt(String s) {
        int l = s.length()-1;
        int ans = 0;
        int lastValue=0;
        while(l>=0){
            int value;
            char ch = s.charAt(l);
            l--;
            if(ch =='I'){
                value = 1;
            }
            else if(ch=='V'){
                value = 5;
            }
            else if(ch=='X'){
                value = 10;
            }
            else if(ch=='L'){
                value = 50;
            }
            else if(ch=='C'){
                value = 100;
            }
            else if(ch=='D'){
                value = 500;
            }
            else{
                value = 1000;
            }
            if(ans==0){
                ans+=value;
            }
            else if(lastValue>value){
                ans-=value;
            }
            else{
                ans+=value;
            }
            lastValue = value;
        }
        return ans;
    }
}