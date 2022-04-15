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
class GettingRandomNode {
    
    // Method 1
    //---------------------
    
    // taking an ARRAY for storing all the elements in Linked List
    int arr[] = new int[10001];
    // taking the counter 
    int n = 0;
    // constructor
    public GettingRandomNode(ListNode head) {
    // Taking a temporary node to store the head 
    // and for traversing the linked list
    ListNode temp = head;
    
    // now we are traversing the linked list
    while(temp!=null)
    {
        arr[n] = temp.val;
        temp = temp.next;
        n++;
    }
        
    }
    
    // for getting the random linked list element 
    public int getRandom() {
        // taking random class
        Random random = new Random();
        // getting the random index from 0 to n-1 (size of the linked list)
        int id = random.nextInt(n);
     // returning the answer
        return arr[id];
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */