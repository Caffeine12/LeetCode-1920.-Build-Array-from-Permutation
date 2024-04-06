public class Solution {
    public int[] buildArray(int[] nums) {
        arrPermutaion(nums, 0);
        return nums;
    }
    public void arrPermutaion(int[] nums, int start)
    {
        if(start<nums.length)
        {
            int presentValue = nums[start];
            int futureValue =  nums[presentValue];
            arrPermutaion(nums, start+1);
            nums[start]=futureValue;
        }
    }
}
