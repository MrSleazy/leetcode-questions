package sorting;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeftBinarySearch {

    private static Logger logger = LogManager.getLogger(LeftBinarySearch.class);

    // Returns left-most index at which target should be located, must validate nums[getTargetIndexFromBinary(nums, target)] == target
    static int getTargetIndexFromBinarySearch(int[] nums, int target) {
        logger.info("Array: {}", nums);
        logger.info("Target: {}", target);
        int left = 0, right = nums.length;
        int iterations = 0;

        while (left < right) {
            iterations++;
            int pivot = (left + right) / 2;
//            logger.info("left: {} ({}), right: {} ({}), pivot: {} ({})", left, nums[left], right, nums[right], pivot, nums[pivot]);

            if (target <= nums[pivot]) {
                logger.info("GO LEFT");
                right = pivot;
            } else {
                logger.info("GO RIGHT");
                left = pivot + 1;
            }
        }
        logger.info("Completed in {} iterations", iterations);
        return left;
    }

    static int customBinarySearch(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
