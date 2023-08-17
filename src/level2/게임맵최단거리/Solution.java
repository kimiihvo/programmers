package level2.게임맵최단거리;

import java.util.*;

class Solution {
    // 4방 탐색을 위한 dx, dy 배열
    // 아래, 오, 위, 왼
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    public static int solution(int[][] maps) {
        int answer = 0;

        // 방문체크를 위한 배열
        int[][] visited = new int[maps.length][maps[0].length];

        // 시작 위치는 미리 방문체크
        visited[0][0] = 1;

        // bfs 탐색 고
        bfs(maps, visited);

        // 도착지 값을 넣어주기
        answer = visited[maps.length - 1][maps[0].length - 1];

        // 도착지까지 못갔다면 -1리턴
        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        // 시작 위치 추가
        q.add(new int[] { 0, 0 });

        while (!q.isEmpty()) {
            // queue 맨 앞에 있는 값 반환 후 제거
            int[] now = q.poll();
            // 현재 x, y 담기
            int x = now[0];
            int y = now[1];

            // 아래, 오른쪽,
            // {1, 0, -1, 0};
            // {0, 1, 0, -1};

            // 4방탐색 - (아래, 오, 위, 왼) 순서대로
            for (int i = 0; i < 4; i++) {
                // 이동했을 때 위치
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 벗어나는지 1, 범위 벗어나는지 2, 범위 벗어나는지 3, 범위 벗어나는지 4, 방문 했는지, 갈 수 있는지
                // 
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && visited[nx][ny] == 0
                        && maps[nx][ny] == 1) {
                    // 방문했다고 체크!! (한발짝 갔으니 +1 해줌)
                    visited[nx][ny] = visited[x][y] + 1;
                    // 이동한 좌표 큐에 추가~~~~
                    q.add(new int[] { nx, ny });
                }
            }
        }
    }
}