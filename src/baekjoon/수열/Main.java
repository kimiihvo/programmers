package baekjoon.����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n; // �µ� ������ ��ü ��¥�� ��
    static int k; // ���� ���ϱ� ���� �������� ��¥�� ��
    static int[] arr; // ���� ������ �µ��� ��Ÿ���� N���� ����
    static int[] days = new int[2];
    static int sum;
    static int max = -2147483648;

    public static void main(String[] args) throws IOException {

        /**
         * �Է� �� �ޱ� ���� �۾�
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 2; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }

        n = days[0];
        k = days[1];
        arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <= n - k; i++) {
            sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
            max = sum > max ? sum : max;
        }

        System.out.println(max);

    }
}
