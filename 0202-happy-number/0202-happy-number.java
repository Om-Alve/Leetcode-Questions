class Solution {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;
        while(f!=1){
            s=square(s);
            f = square(square(f));
            if(f==s && f!=1){
                return false;
            }
        }
        return true;
    }
    public int square(int n){
        int sq = 0;
        while(n!=0){
            sq+=(n%10)*(n%10);
            n/=10;
        }
        return sq;
    }
}
