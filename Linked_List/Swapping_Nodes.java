/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Swapping_Nodes {
    // for counting the total nodes in the linked list
    public int countNodes(ListNode head)
    {
        ListNode temp = head;
        int c = 0;
        while(temp!=null)
        {
            temp = temp.next;
            c++;
        }
        return c;
    }
    
    // for swapping nodes at kth positions
    public ListNode swapNodes(ListNode head, int k) {
     
        // counting the total nodes
        int n = countNodes(head);
        
        // for counting the first kth and last kth element
        ListNode temp = head;
        int c = 0;
        // for storing the value of the first kth node 
        int first = -1;
        // for storing last kth node's value
        int last = -1;
        
        // traversing through the linked list
        while(temp!=null)
        {
            c++;
            if(c==k)
            {
                first = temp.val;
            }
            if(n-c+1==k)
            {
                last = temp.val;
                // temp.val = first;
            }
            
            temp = temp.next;
        }
        
        temp = head;
        
        c = 0;
        
        // swapping the values at both kth positions
        while(temp!=null)
        {
            c++;
            if(c==k)
            {
                temp.val = last;
            }
            
            if(n-c+1==k)
            {
                temp.val = first;
            }
            
            temp = temp.next;
        }
        
        return head;
    }
}
