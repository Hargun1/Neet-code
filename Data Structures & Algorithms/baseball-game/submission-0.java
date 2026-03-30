class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < operations.length; i++){
            String op = operations[i];
          if(op.equals("+")){
            int a = stack.pop();
            int b = stack.peek();
            stack.push(a);
            stack.push(a + b);
          }
          else if (op.equals("D")) {
            stack.push(stack.peek() * 2);
        }
        else if (op.equals("C")) {
                stack.pop();
        }

             else {
                stack.push(Integer.parseInt(op));
        }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;

    }
}