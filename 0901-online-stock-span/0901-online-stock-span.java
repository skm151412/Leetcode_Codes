class StockSpanner {
    Stack<Integer> st=new Stack<>();
    ArrayList<Integer> ls= new ArrayList<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int i = ls.size();
        ls.add(price);

        while (!st.isEmpty() && ls.get(st.peek()) <= price) {
            st.pop();
        }

        int pge = -1;

        if (!st.isEmpty()) {
            pge = st.peek();
        }

        st.push(i);

        return i - pge;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */