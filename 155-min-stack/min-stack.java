class MinStack {
    Stack<Integer> sm ;//= new Stack<>();
    Stack<Integer> mm;
    public MinStack() {
        sm  = new Stack<>();
        mm = new Stack<>();
    }
    
    public void push(int val) {
        sm.push(val);
        if(mm.empty() || sm.empty() || val<mm.peek())mm.push(val);
        else mm.push(mm.peek());
    }
    
    public void pop() {
        if(sm.empty())return;
        sm.pop();mm.pop();
    }
    
    public int top() {
        return sm.peek();
    }
    
    public int getMin() {
        return mm.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */