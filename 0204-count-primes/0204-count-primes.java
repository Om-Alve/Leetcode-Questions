class Solution {
    public int countPrimes(int n) {
        int counter=0;
        if(n<3)
            return 0;
        boolean[] arr = new boolean[n];
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<n;i++){
            arr[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=false;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]==true)
                counter++;
        }
        return counter;
    }
}