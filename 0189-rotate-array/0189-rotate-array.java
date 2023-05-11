class Solution {
    public void rotate(int[] nums, int k) {

        int[] temp = new int[nums.length];
        int x = 0;
        int n = nums.length;
        k=k%n;
        k= n-k;
        for(int i=k;i<n;i++){
            temp[x++] = nums[i];
        }
        for(int i=0;x<n;i++,x++){
            temp[x] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = temp[i];
        }
    }
}