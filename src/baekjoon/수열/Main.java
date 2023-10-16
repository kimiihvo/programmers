package baekjoon.수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n; // 온도 측정한 전체 날짜의 수
    static int k; // 합을 구하기 위한 연속적인 날짜의 수
    static int[] arr; // 매일 측정한 온도를 나타내는 N개의 정수
    static int[] days = new int[2];
    static int sum;
    static int max = -2147483648;

    public static void main(String[] args) throws IOException {

        /**
         * 입력 값 받기 위한 작업
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
