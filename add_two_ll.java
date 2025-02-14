class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode=new ListNode(-1);
        ListNode current=dummyNode;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        int sum=0;
        while(temp1!=null||temp2!=null){
            sum=carry;
            if(temp1!=null){
                sum=temp1.val+sum;
            }
            if(temp2!=null){
                sum=temp2.val+sum;
            }
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;
            current.next=newNode;
            current=newNode;
            if(temp1!=null)
                temp1=temp1.next;
            if(temp2!=null)
                temp2=temp2.next;
        }
        if(carry>0){
            ListNode extraNode=new ListNode(carry);
            current.next=extraNode;
        }
        return dummyNode.next;
    }
}
