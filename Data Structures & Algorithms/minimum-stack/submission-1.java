class MinStack {
   Stack<Integer> stack1 ;
   Stack<Integer> stack2 = new Stack<>();
    public MinStack() {
        stack1 = new Stack<>();
    }
    
    public void push(int val) {
        stack1.push(val);
         if(stack2.isEmpty() || val <= stack2.peek()){
            stack2.push(val);
        }
           
    }
    
    public void pop() {
        if(stack1.peek().equals(stack2.peek())){
        stack1.pop();
        stack2.pop();
        }else{
            stack1.pop();
        }
    }
    
    public int top() {
      return  stack1.peek();
    }
    
    public int getMin() {
     int a =stack2.peek();
        return a;
    }
}
