package Bluescopetasks;

import java.util.*;

class DataStructures {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        System.out.println("Array: " + arr[1]);

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println("LinkedList: " + list.get(0));

        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        System.out.println("Stack pop: " + stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println("Queue poll: " + queue.poll());

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        System.out.println("Tree root: " + root.data);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            graph.add(new ArrayList<>());
        graph.get(0).add(1);
        graph.get(1).add(2);
        System.out.println("Graph adj of 0: " + graph.get(0));
    }
}