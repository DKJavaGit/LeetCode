public class Solution {
	public int searchInsert (int[] nums, int target) {
		int left = 0, right = nums.length-1, ind;

		while (left <= right) {
			ind = (left + right) / 2;
			
			if (nums[ind] == target) 
				return ind;
			else if (nums[left] < target && target < nums[right]) {
				if (nums[ind] > target) 
					right = ind - 1;
				else
					left = ind + 1;
			} else {
				ind = nums[left] >= target ? left : right;
				return nums[ind] >= target ? ind : ind + 1;
			}
		}

		return -1; 
	}
}
