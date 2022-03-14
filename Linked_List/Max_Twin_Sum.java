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
class Max_Twin_Sum {

    // this is for finding the length
    public int findLen(ListNode temp)
    {
       int c = 0;
        while(temp!=null)
        {
            temp = temp.next;
            c++;
        }
        
        return c;
    }
    
    public int pairSum(ListNode head) {
        // creating the array
        int arr[];
        // calculating the list size
        int len = findLen(head);
        
        // giving the array size
        arr = new int[len];
        
        // storing the Linked List to the Array
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = head.val;
            head = head.next;
        }
        int max_sum = 0;
        for(int i=0;i<len;i++)
        {
            if(len-1-i < len)
            {
                int sum = arr[i]+arr[len-1-i];
                if(max_sum<sum)
                    max_sum = sum;
            }
            else
                break;
        }        
        return max_sum;
    }
}