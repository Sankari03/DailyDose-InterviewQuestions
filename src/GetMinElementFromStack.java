import java.util.Stack;

public class GetMinElementFromStack {
    public static void main(String[] args) {
        Test t = new Test();
        t.push(2);
        t.push(3);
        System.out.println(t.pop());
        System.out.println(t.getMin());
        t.push(1);
        System.out.println(t.getMin());
    }


}

class Test {
    Stack<Integer> s;
    Stack<Integer> min;
    Test(){
        s = new Stack<>();
        min = new Stack<>();
    }
    public int getMin() {
        // Your code here
        if (min.isEmpty()) {
            return -1;
        }
        return min.peek();
    }

    /*returns poped element from stack*/
    public int pop() {
        // Your code here
        if (s.isEmpty()) {
            return -1;
        }
        if (s.peek() == min.peek()) {
            min.pop();
            return s.pop();
        } else {
            return s.pop();
        }
    }

    /*push element x into the stack*/
    public void push(int x) {
        // Your code here
        if (s.isEmpty()) {
            s.push(x);
            min.push(x);
        } else {
            if (x <= min.peek()) {
                min.push(x);
                s.push(x);
            } else {
                s.push(x);
            }
        }
    }
}
