class MedianFinder {
    PriorityQueue<Double> max;
    PriorityQueue<Double> min;
    double cm;
    public MedianFinder() {
        max=new PriorityQueue<>(Collections.reverseOrder());
        min=new PriorityQueue<>();
        cm=0;
    }
    
    public void addNum(int n) {
        if(n>cm) min.add((double)n);
        else max.add((double)n);
        if(Math.abs(max.size()-min.size())>1){
            if(max.size()>min.size()){
                min.add(max.remove());
                cm=max.peek();
            }
            if(max.size()<min.size()){
                max.add(min.remove());
                cm=min.peek();
            }
        }
        if(Math.abs(max.size()-min.size())==0){
            cm=(max.peek()+min.peek())/2;
        }
        else{
            if(max.size()>min.size()){
                // min.add(max.remove());
                cm=max.peek();
            }
            if(max.size()<min.size()){
                // max.add(min.remove());
                cm=min.peek();
            }
            
        }
    }
    
    public double findMedian() {
        return cm;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */