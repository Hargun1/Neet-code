class MyStack {
            Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

    public MyStack() {

    }
    
    public void push(int x) {
        queue1.offer(x);
    }
    
    public int pop() {
        while(queue1.size() != 1){
        int a = queue1.poll();
        queue2.offer(a);
    }
     int rem = queue1.poll();

     while(!queue2.isEmpty()){
        queue1.offer(queue2.poll());
     }
     
    return rem;

    }

    
    public int top() {
        
        while(queue1.size() != 1){
       int a = queue1.poll();
        queue2.offer(a);
    }
     int top = queue1.poll();
    
     while(!queue2.isEmpty()){
        queue1.offer(queue2.poll());
     }
     queue1.offer(top);
    return top;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */