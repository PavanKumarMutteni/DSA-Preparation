/**



https://leetcode.com/problems/find-median-from-data-stream/

*/
import java.util.*;
class MedianFinder {

    PriorityQueue<Integer>min;
    PriorityQueue<Integer>max;
    int size1;
    int size2;
    public MedianFinder() {
        
        min=new PriorityQueue<Integer>();
        max=new PriorityQueue<>(Collections.reverseOrder());
        size1=0;
        size2=0;
    }
    
    
    public void addNum(int num) {
        
       if(size2-size1==0)
       {
           if(size1!=0 && num>min.peek())
           {
               max.add(min.poll());
               min.add(num);
           }
           else
           {
               max.add(num);
           }
           size2++;
       }
        else
        {
            if(size2!=0 && num<max.peek())
            {
                min.add(max.poll());
                max.add(num);
            }
            else
            {
                min.add(num);
            }
            size1++;
        }
        
        
        
        
        
    }
    
    public double findMedian() {
        double ans=0.0;
        if(size1==size2)
            ans=((double)(max.peek()+min.peek())/2);
        else
            ans=(double)max.peek();
        return ans;
        
            
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
