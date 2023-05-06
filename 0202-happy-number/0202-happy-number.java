class Solution {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;
        do{
            s=square(s);
            f = square(square(f));
        }while(f!=s);
        if(s==1){
            return true;    
        }
        return false;
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
