public class Solution {

	public int maxArea (int[] height) {
		int v = 0, l = 0, r = height.length-1;

		// v - объем, l - left, r - right		

		while (l != r) {
			v = Math.max(v, 
(Math.min(height[l], height[r] * (r - l))));
			if (height[l] <= height[r]) {
				l++;
			} else {
				r--;
			}
		}

		return v;
	}

}
