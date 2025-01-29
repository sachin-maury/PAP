


    import java.util.*;

class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) break; // No need to continue if the smallest number is positive

            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate values

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        threeSum sol = new threeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(sol.threeSum(nums));
    }
}


