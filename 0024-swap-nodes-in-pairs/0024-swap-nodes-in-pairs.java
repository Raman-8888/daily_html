class Solution {
    public ListNode swapPairs(ListNode head) {
       int size=0;
       ListNode temp=head;
       while(temp!=null)
       {
            temp=temp.next;
            size++;
       }
       if(size==0||size==1)return head;


        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        
       while(curr!=null&&curr.next!=null)
       {
            ListNode future=curr.next.next;
            ListNode second=curr.next;
            
            second.next=curr;
            curr.next=future;
            prev.next=second;
            
            prev=curr;
            curr=future;
       }
       return dummy.next;
    }
}