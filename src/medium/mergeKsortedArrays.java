package medium;

import java.util.*;

public class mergeKsortedArrays {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode mergeKLists(ListNode[] arr) {
        if(arr.length==0) return null;
        if(arr.length==1) return arr[0];
        ListNode parent=arr[0];
        for(int i=1;i<arr.length;i++){
            parent=merger(parent,arr[i]);
        }
        return parent;
    }

    public static ListNode merger(ListNode head1,ListNode head2)
    {
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode ans;
        if(head1.val<head2.val){
            ans=head1;
            ans.next=merger(head1.next,head2);
        }
        else{
            ans=head2;
            ans.next=merger(head1,head2.next);
        }
        return ans;
    }

//    public static void main(String[] args) {
//         ListNode[][] l=new ListNode{{1,2,3},{7,8,9},{4,5,6}};
//         mergeKLists(l1);
//    }
}
