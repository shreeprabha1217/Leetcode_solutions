class Solution {
    public ListNode findkNode(ListNode temp,int k){
        k--;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front = temp.next;  
        
            temp.next = prev;  
            prev = temp;  
            temp = front; 
       }
       return prev;  
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevNode=null;
        while(temp!=null){
            ListNode kNode=findkNode(temp,k);
            if(kNode==null){
                if(prevNode!=null){
                prevNode.next=temp;
                }
                break;
            }
        ListNode nextNode=kNode.next;
        kNode.next=null;
        reverse(temp);
        if(temp==head){
            head=kNode;
        }else{
            prevNode.next=kNode;
        }
        prevNode=temp;
        temp=nextNode;
        }
        return head;
    }
}
