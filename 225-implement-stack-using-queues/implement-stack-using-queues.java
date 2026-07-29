class MyStack {
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> helper = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        queue.offer(x);
    }
    
    public int pop() {
        while(queue.size() != 1){
            helper.offer(queue.poll());
        }
        int pop = queue.poll();
        while(!helper.isEmpty()){
            queue.offer(helper.poll());
        }
        return pop;
    }
    
    public int top() {
        while(queue.size() != 1){
            helper.offer(queue.poll());
        }
        int top = queue.peek();
        helper.offer(queue.poll());
        while(!helper.isEmpty()){
            queue.offer(helper.poll());
        }
        return top;
    }
    
    public boolean empty() {
        return queue.isEmpty();
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