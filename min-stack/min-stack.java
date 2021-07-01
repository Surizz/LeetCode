class MinStack {

    Stack<MinElement> minElementStack;
    
    class MinElement {
        int val;
        int minVal;

        public MinElement(int val, int minVal) {
            this.val = val;
            this.minVal = minVal;
        }
    }
    
    public MinStack() {
        minElementStack = new Stack<>();
    }
    
    public void push(int val) {
        if(minElementStack.empty()) {
            minElementStack.push(new MinElement(val, val));
            return;
        }
        
        int min = Math.min(minElementStack.peek().minVal, val);
        minElementStack.push(new MinElement(val, min));
    }
    
    public void pop() {
        minElementStack.pop();
    }
    
    public int top() {
        return minElementStack.peek().val;
    }
    
    public int getMin() {
        return minElementStack.peek().minVal;
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