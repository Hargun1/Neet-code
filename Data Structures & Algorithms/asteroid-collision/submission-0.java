class Solution {
    public int[] asteroidCollision(int[] nums) {

        Stack<Integer> stack = new Stack<>();
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }

        stack.push(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && nums[i] < 0) {

                if (Math.abs(nums[i]) > Math.abs(stack.peek())) {
                    stack.pop();
                }
                else if (Math.abs(nums[i]) == Math.abs(stack.peek())) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(nums[i]);
            }
        }

        int arr[] = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - i - 1] = stack.pop();
        }

        return arr;
    }
}