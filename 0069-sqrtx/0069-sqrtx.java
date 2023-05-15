class Solution {
    public int mySqrt(int x) {
        long s=0;
        long e=x;
        long mid;
        while(s<=e){
            mid= s + (e-s)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return (int)s-1;
    }
}