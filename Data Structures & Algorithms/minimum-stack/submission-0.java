class MinStack {

    private Stack<Integer> stack;

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
        
    }
    
    public void pop() {
        this.stack.pop();
        
    }
    
    public int top() {
        return this.stack.peek();

        
    }
    
    public int getMin() {

        Stack<Integer> tmp = new Stack<>();
        int min = this.stack.peek();

        while (!this.stack.isEmpty()) {
            min = Math.min(min, this.stack.peek());
            tmp.push(stack.pop());
        }

        while(!tmp.isEmpty()) {
            stack.push(tmp.pop());
        }

        return min;
        
    }
}
