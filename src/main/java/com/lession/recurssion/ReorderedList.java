package com.lession.recurssion;

import org.w3c.dom.NodeList;

import java.util.List;

public class ReorderedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(50, new ListNode(60, new ListNode(70, new ListNode(80, null))));
         ListNode res1 =l;
         ListNode curr =l;
        ListNode last = new ListNode();
         while(curr!=null){
             last=curr;
             curr=curr.next;
         }
         curr =l;
         while(curr!=null) {
             ListNode res = printReordered(curr, last);
             res1.next = res.next;

             curr = l.next.next;

             last = res;
         }



        while (res1 != null) {
            System.out.println(res1.val);
            res1 = res1.next;
        }
    }

    private static ListNode printReordered(ListNode head,ListNode tail) {
        if (head.next == tail) {
            return head;
        }
        else{
            return printReordered(head.next,tail);
        }

    }
}
