package level2.�Ƿε�;

class Solution {
    // DFS�� ���� �������� ����
    public static boolean[] visited;
    public static int answer = -1;

    public static int solution(int k, int[][] dungeons) {
        // ���� ������ŭ visit ����
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    public static void dfs(int k, int[][] dungeons, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            // visit[i]�� �湮���� �ʾҰ� && �ּ� �ʿ��Ƿε��� ���� �Ƿε����� ������
            if (visited[i] == false && dungeons[i][0] <= k) {
                // �湮 ó�� ~
                visited[i] = true;
                // (���� �Ƿε� - �Ҹ� �Ƿε�)�� ��� (�ѹ� �湮������ count +1)
                dfs(k - dungeons[i][1], dungeons, count + 1);

                // ��ͷ� �ִ밪 ���� ��, �ٸ� ���̽��� ���� �湮�غ������� �湮 ���
                visited[i] = false;
            }
        }
        // �ִ밪 ����
        answer = Math.max(answer, count);

        // �ִ밪�� ������ ���� ���ٸ� ������
        if (answer == dungeons.length) {
            return;
        }

    }
}