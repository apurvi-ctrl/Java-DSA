package STACK;
import java.util.Stack;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class removenode {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            while (!stack.isEmpty() && stack.peek().val < temp.val) {
                stack.pop();
            }
                stack.push(temp);
                temp = temp.next;
            }
            ListNode newHead = null;
            while (!stack.isEmpty()) {
                ListNode node = stack.pop();
                node.next = newHead;
                newHead = node;
            }
            return newHead;
    }
}