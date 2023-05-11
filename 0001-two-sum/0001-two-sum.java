class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute force approach
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return null;
        List<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(a.contains(target-nums[i])){
                return new int[]{i,a.indexOf(target-nums[i])};
            }
            a.add(nums[i]);
        }
        return null;
    }
}