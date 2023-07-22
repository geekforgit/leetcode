package com.lession.recurssion.arrayrec;

// * Definition for singly-linked list.
class ListNode {
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

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode root = new ListNode(10, new ListNode(11, new ListNode(12)));
        ListNode res = reverse(root);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;

        }
    }

    static ListNode reverse(ListNode node) {
        if (node.next == null)
            return node;
        ListNode  rNode=reverse(node.next);
        node.next.next = node;
        node.next = null;
        return rNode;
    }
}
