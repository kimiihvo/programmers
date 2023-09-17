package baekjoon.수찾기;

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

                // 중간 값을 mid에 넣기
                mid = (left + right) / 2;

                // 찾는 원소와 mid의 값이 같다면 ? 탐색종료
                if (arr[mid] == targetArray[i]) {
                    // 찾았다는 표시
                    chk = true;
                    break;

                    // mid의 값이 찾는 원소보다 작을 때, left = mid+1 로 찾기
                } else if (arr[mid] < targetArray[i]) {
                    left = mid + 1;

                    // mid의 값이 찾는 원소보다 클 때, right = mid-1 로 찾기
                } else if (arr[mid] > targetArray[i]) {
                    right = mid - 1;
                }
            }

            // right > left가 된다면 해당 배열에 찾는 원소가 없는 것이므로 -> 0 출력
            if (chk) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
    }

    public static void main(String[] args) throws IOException {

        /**
         * 입력 값 받기 위한 작업
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 미리 정렬
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
