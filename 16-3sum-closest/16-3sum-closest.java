class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum_closest = nums[0] + nums[1] + nums[nums.length - 1];
        
        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int curr_sum = nums[i] + nums[left] + nums[right];
                if(curr_sum > target){
                    right -= 1;
                }
                else{
                    left += 1;
                }
                if(Math.abs(curr_sum - target) < Math.abs(sum_closest - target)){
                    sum_closest = curr_sum;
                }
            }
        }
        return sum_closest;
    }
}