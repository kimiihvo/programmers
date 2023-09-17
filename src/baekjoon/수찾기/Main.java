package baekjoon.��ã��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static int m;
    static int[] targetArray;

    public static void solution(int n, int[] arr, int m, int[] targetArray) {
        boolean chk;
        int left;
        int right;
        int mid;

        for (int i = 0; i < targetArray.length; i++) {
            chk = false;
            left = 0;
            right = arr.length - 1;

            while (right >= left) {

                // �߰� ���� mid�� �ֱ�
                mid = (left + right) / 2;

                // ã�� ���ҿ� mid�� ���� ���ٸ� ? Ž������
                if (arr[mid] == targetArray[i]) {
                    // ã�Ҵٴ� ǥ��
                    chk = true;
                    break;

                    // mid�� ���� ã�� ���Һ��� ���� ��, left = mid+1 �� ã��
                } else if (arr[mid] < targetArray[i]) {
                    left = mid + 1;

                    // mid�� ���� ã�� ���Һ��� Ŭ ��, right = mid-1 �� ã��
                } else if (arr[mid] > targetArray[i]) {
                    right = mid - 1;
                }
            }

            // right > left�� �ȴٸ� �ش� �迭�� ã�� ���Ұ� ���� ���̹Ƿ� -> 0 ���
            if (chk) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }

    public static void main(String[] args) throws IOException {

        /**
         * �Է� �� �ޱ� ���� �۾�
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // �̸� ����
        Arrays.sort(arr);

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        targetArray = new int[m];

        for (int i = 0; i < m; i++) {
            targetArray[i] = Integer.parseInt(st.nextToken());
        }

        solution(n, arr, m, targetArray);

    }

}
