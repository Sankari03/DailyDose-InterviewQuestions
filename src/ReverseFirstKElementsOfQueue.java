import java.util.*;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            q.add(sc.nextInt());
        }
        int k = 3;
        System.out.println(modifyQueue(q,k));
    }
    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        if (q.size()==1){
            return q;
        }
        int len = q.size()-k;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }
        Queue<Integer> ans = new LinkedList<>();
        while (!stack.isEmpty()){
            ans.add(stack.pop());
        }
        for (int i = 0; i < len; i++) {
            ans.add(q.remove());
        }
        return ans;
    }
}
