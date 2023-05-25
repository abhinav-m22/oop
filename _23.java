import java.util.HashSet;

public class _23 {
    public static int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       int maxLength = 0;

       for(int num : nums){
        set.add(num);
       }

       for(int num : nums){
        if(!set.contains(num-1)){
            int currentNum = num;
            int currLength = 1;

            while(set.contains(currentNum + 1)){
                currLength += 1;
                currentNum += 1;
            }

            maxLength = Math.max(maxLength, currLength);
        }
       }
       return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        int length = longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence: " + length);
    }
}