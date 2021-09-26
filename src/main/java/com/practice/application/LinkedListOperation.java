package com.practice.application;

import java.util.*;

public class LinkedListOperation {
    private static class Node<E> {
        E item;
        LinkedListOperation.Node<E> next;
        LinkedListOperation.Node<E> prev;

        Node(LinkedListOperation.Node<E> prev, E element, LinkedListOperation.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "item=" + item +
                    '}';
        }
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(null, 5, null);
        //System.out.println(node);
        Node<Integer> node1 = new Node<>(null, 6, node);
        Node<Integer> node2 = new Node<>(null, 7, node1);
        Node<Integer> node3 = new Node<>(null, 8, node2);
        Node<Integer> node4 = new Node<>(null, 9, node3);
        //node.next = node3;
        if (!isCyclic2(node4))
            printNodes(node4);
        else
            System.out.println("There is cyclic dependencies");
    }

    private static boolean isCyclic(Node<Integer> root) {
        Set<Node> uniqueNodes = new HashSet<>();
        while (root != null) {
            if (!uniqueNodes.contains(root)) {
                uniqueNodes.add(root);
                root = root.next;
            } else {
                return true;
            }
        }
        return false;
    }

    //fast and slow pointer implementation Flyod's cycle detection algo
    private static boolean isCyclic2(Node<Integer> root) {
        Node<Integer> fast = root;
        Node<Integer> slow = root;
        while (fast != null && slow != null) {
            if (fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;


        }
        return false;
    }

    static void printNodes(Node root) {
        while (root != null) {
            System.out.print(root.item + "-->");
            root = root.next;
        }

    }

}
