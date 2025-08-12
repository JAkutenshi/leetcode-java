package com.github.jakutenshi.leetcode;

import java.util.Stack;

public class Problem155 {
    public static class MinStack {
        private static class Node {
            private final int value;

            private final int currentMin;

            public Node(int value, int currentMin) {
                this.value = value;
                this.currentMin = currentMin;
            }

            public int getValue() {
                return value;
            }

            public int getCurrentMin() {
                return currentMin;
            }
        }

        Stack<Node> stack = new Stack<>();

        public MinStack() { }
        
        public void push(int val) {
            if (stack.empty()) {
                stack.push(new Node(val, val));   
            } else {
                int currentMin = stack.peek().getCurrentMin();

                stack.push(new Node(val, val < currentMin ? val : currentMin));
            }
        }
        
        public void pop() {
            stack.pop();
        }
        
        public int top() {
            return stack.peek().getValue();
        }
        
        public int getMin() {
            return stack.peek().getCurrentMin();
        }
    }
}
