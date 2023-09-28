class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0;
        int e=nums.length - 1;
        while(s<e){
            if(nums[s]%2==0){
                s++;
            }
            else{
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                e--;
            }
        }
        return nums;
    }
}