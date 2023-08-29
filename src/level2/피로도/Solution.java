package level2.피로도;

class Solution {
    // DFS를 위한 전역변수 설정
    public static boolean[] visited;
    public static int answer = -1;

    public static int solution(int k, int[][] dungeons) {
        // 던전 개수만큼 visit 설정
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    public static void dfs(int k, int[][] dungeons, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            // visit[i]를 방문하지 않았고 && 최소 필요피로도가 현재 피로도보다 작으면
            if (visited[i] == false && dungeons[i][0] <= k) {
                // 방문 처리 ~
                visited[i] = true;
                // (현재 피로도 - 소모 피로도)로 재귀 (한번 방문했으니 count +1)
                dfs(k - dungeons[i][1], dungeons, count + 1);

                // 재귀로 최대값 갱신 후, 다른 케이스를 먼저 방문해보기위해 방문 취소
                visited[i] = false;
            }
        }
        // 최대값 갱신
        answer = Math.max(answer, count);

        // 최대값이 던전의 수와 같다면 끝내기
        if (answer == dungeons.length) {
            return;
        }

    }
}