class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }
        if (temp1 != null) {
            current.next = temp1;
        }
        if (temp2 != null) {
            current.next = temp2;
        }

        return dummyNode.next; 
    }
}
