class Solution {
    public int reverse(int x) {
        int ans=0;
        int sign = (x>0)? 1 : 0;
        x=Math.abs(x);
        while(x>0){
            ans*=10;
            ans+=(x%10);
            x/=10;
            if((ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10) && x>0){
                return 0;
            }
        }
        return (sign==1)?ans:ans*(-1);
    }
}