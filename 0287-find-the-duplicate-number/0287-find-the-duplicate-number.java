class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length ;){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != i + 1){
                return nums[i];
            }
        }
        return -1;
    }
}