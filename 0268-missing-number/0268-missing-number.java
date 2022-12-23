class Solution {
    public int missingNumber(int[] nums) {
        int ans = nums.length;
        for(int i = 0 ; i < nums.length;){
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=i){
                ans = i;
                break;
            }
        }
        return ans;
    }
}