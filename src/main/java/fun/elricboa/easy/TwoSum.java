package fun.elricboa.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shentongzhou on 2019-09-22
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int completeNum = target - nums[i];
            if (map.containsKey(completeNum)) {
                return new int[]{map.get(completeNum), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
