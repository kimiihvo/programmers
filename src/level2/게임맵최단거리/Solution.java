package level2.���Ӹ��ִܰŸ�;

import java.util.*;

class Solution {
    // 4�� Ž���� ���� dx, dy �迭
    // �Ʒ�, ��, ��, ��
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    public static int solution(int[][] maps) {
        int answer = 0;

        // �湮üũ�� ���� �迭
        int[][] visited = new int[maps.length][maps[0].length];

        // ���� ��ġ�� �̸� �湮üũ
        visited[0][0] = 1;

        // bfs Ž�� ��
        bfs(maps, visited);

        // ������ ���� �־��ֱ�
        answer = visited[maps.length - 1][maps[0].length - 1];

        // ���������� �����ٸ� -1����
        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        // ���� ��ġ �߰�
        q.add(new int[] { 0, 0 });

        while (!q.isEmpty()) {
            // queue �� �տ� �ִ� �� ��ȯ �� ����
            int[] now = q.poll();
            // ���� x, y ���
            int x = now[0];
            int y = now[1];

            // �Ʒ�, ������,
            // {1, 0, -1, 0};
            // {0, 1, 0, -1};

            // 4��Ž�� - (�Ʒ�, ��, ��, ��) �������
            for (int i = 0; i < 4; i++) {
                // �̵����� �� ��ġ
                int nx = x + dx[i];
                int ny = y + dy[i];

                // ���� ������� 1, ���� ������� 2, ���� ������� 3, ���� ������� 4, �湮 �ߴ���, �� �� �ִ���
                //
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && visited[nx][ny] == 0
                        && maps[nx][ny] == 1) {
                    // �湮�ߴٰ� üũ!! (�ѹ�¦ ������ +1 ����)
                    visited[nx][ny] = visited[x][y] + 1;
                    // �̵��� ��ǥ ť�� �߰�~~~~
                    q.add(new int[] { nx, ny });
                }
            }
        }
    }
}