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
    // ��Ʈ���� �׻� A��� ������ ����
    static Node head = new Node('A', null, null);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // �� �� .
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
        // ��Ʈ��� �ΰ�?
        if (tmp.value == root) {
            // �ڽĳ�尡 . �̸� null
            // �ƴϸ� ���ο� ��� ����
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
     * ������ȸ
     * �� - ���� - ����
     * 
     * @param n
     */
    static void preOrder(Node n) {
        if (n == null)
            return;

        // ��Ʈ ���
        System.out.print(n.value);
        preOrder(n.left);
        preOrder(n.right);

    }

    /**
     * ������ȸ
     * ���� - �� - ����
     * 
     * @param n
     */
    static void inOrder(Node n) {
        if (n == null)
            return;

        inOrder(n.left);
        // ��Ʈ ���
        System.out.print(n.value);
        inOrder(n.right);

    }

    /**
     * ������ȸ
     * ���� - ���� - ��
     * 
     * @param n
     */
    static void postOrder(Node n) {
        if (n == null)
            return;

        postOrder(n.left);
        postOrder(n.right);
        // ��Ʈ ���
        System.out.print(n.value);

    }

}