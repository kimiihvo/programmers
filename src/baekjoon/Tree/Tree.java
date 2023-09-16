package baekjoon.Tree;

import java.io.*;

public class Tree {

    static class Node {
        char value;
        Node left;
        Node right;

        Node(char value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }// class Node

    static int N;
    // 루트노드는 항상 A라는 조건이 있음
    static Node head = new Node('A', null, null);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 받 어 .
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            char root = str[0].charAt(0);
            char left = str[1].charAt(0);
            char right = str[2].charAt(0);
            insertNode(head, root, left, right);
        }

        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);

    }

    static void insertNode(Node tmp, char root, char left, char right) {
        // 루트노드 인가?
        if (tmp.value == root) {
            // 자식노드가 . 이면 null
            // 아니면 새로운 노드 생성
            tmp.left = (left == '.' ? null : new Node(left, null, null));
            tmp.right = (right == '.' ? null : new Node(right, null, null));
        } else {
            if (tmp.left != null)
                insertNode(tmp.left, root, left, right);
            if (tmp.right != null)
                insertNode(tmp.right, root, left, right);
        }
    }

    /**
     * 전위순회
     * 루 - 왼자 - 오자
     * 
     * @param n
     */
    static void preOrder(Node n) {
        if (n == null)
            return;

        // 루트 출력
        System.out.print(n.value);
        preOrder(n.left);
        preOrder(n.right);

    }

    /**
     * 중위순회
     * 왼자 - 루 - 오자
     * 
     * @param n
     */
    static void inOrder(Node n) {
        if (n == null)
            return;

        inOrder(n.left);
        // 루트 출력
        System.out.print(n.value);
        inOrder(n.right);

    }

    /**
     * 후위순회
     * 왼자 - 오자 - 루
     * 
     * @param n
     */
    static void postOrder(Node n) {
        if (n == null)
            return;

        postOrder(n.left);
        postOrder(n.right);
        // 루트 출력
        System.out.print(n.value);

    }

}