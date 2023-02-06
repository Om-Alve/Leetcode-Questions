class Solution {
    public boolean isHappy(int n) {
        int sum;
        ArrayList<Integer> a = new ArrayList<Integer>();
        while(n!=1 && !a.contains(n)){
            a.add(n);
            sum=0;
            while(n>0){
                int rem = (n%10);
                sum += rem * rem;
                n/=10;
            }
            n=sum;
        }
        return n==1;
    }
}
