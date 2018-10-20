package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    Queue<Integer> queue;
    /** Initialize your data structure here. */
    public MyStack() {
        this.queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for (int i = 0; i < queue.size()-1; i++){
            queue.add(queue.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public void pop() {
        queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
//
//    private Queue<Integer> q1 = new LinkedList<>();
//    private Queue<Integer> q2 = new LinkedList<>();
//    private int top;
//
//    /** Push element x onto stack. */
//    public void push(int x) {
//        q1.add(x);
//        top = x;
//    }
//
//    /** Removes the element on top of the stack and returns that element. */
//    public int pop() {
//        while (q1.size() > 1){
//            top = q1.remove();
//            q2.add(top);
//        }
//        int a = q1.remove();
//        Queue<Integer> temp = q1;
//        q1 = q2;
//        q2 = temp;
//        return a;
//    }
//
//    /** Get the top element. */
//    public int top() {
//        return top;
//    }
//
//    /** Returns whether the stack is empty. */
//    public boolean empty() {
//        return q1.isEmpty();
//    }
}
