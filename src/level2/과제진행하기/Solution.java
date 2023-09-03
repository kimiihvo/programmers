package level2.과제진행하기;

import java.util.*;

class Solution {

    static List<String> result = new ArrayList<String>();
    static Stack<String[]> stack = new Stack<>();

    public static String[] solution(String[][] plans) {
        /**
         * plans: start 기준으로 정렬
         */
        // 시간 > 분으로 변경
        for (String[] plan : plans) {
            String[] time = plan[1].split(":");
            plan[1] = String.valueOf(Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]));
        }

        Arrays.sort(plans, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
            }
        });

        /**
         * 시작
         * 정렬순으로 한번 쫙 돌기
         */
        for (int i = 0; i < plans.length - 1; i++) {

            if (Integer.parseInt(plans[i][1]) + Integer.parseInt(plans[i][2]) <= Integer.parseInt(plans[i + 1][1])) {
                // 과제 처리 완.
                result.add(plans[i][0]);

                // 과제 처리 후, 남은 시간이 있는지 확인
                // nowtime = (지금 과제 start + 지금 과제 playtime) - (다음 과제 start)
                int nowtime = (Integer.parseInt(plans[i][1]) + Integer.parseInt(plans[i][2]))
                        - Integer.parseInt(plans[i + 1][1]);

                // 남은시간이 있고 && 멈춰둔 과제가 있으면
                if (nowtime < 0 && !stack.isEmpty()) {

                    // 여기서 nowtime 다 쓸 때까지 재귀 또는 반복 해야함
                    // 편의성을 위해 양수로 변경
                    nowtime *= -1;

                    // 남은시간 안에 처리되는 게 있는지 확인
                    // 남은 시간이 있고 멈춰둔 과제가 있으면
                    while (nowtime > 0 && !stack.isEmpty()) {
                        // 멈춰둔 과제의 playtime 가져오기
                        int stack_peek = Integer.parseInt(stack.peek()[2]);
                        // 멈춰둔 과제의 playtime이 남은 시간보다 작거나 같으면
                        // 처리할 수 있음
                        if (stack_peek <= nowtime) {
                            // 과제 처리 완.
                            result.add((stack.pop())[0]);
                            // 시간을 썼으니 nowtime 갱신
                            nowtime = nowtime - stack_peek;

                            // 처리할 수 없는 경우
                            // 처리할 수 없어도 남은 시간은 소비해야함
                        } else {
                            // 멈춰둔 과제 아예 배열채로 가져오기
                            String[] peek = stack.peek();
                            // 멈춰둔 과제의 playtime - nowtime 해주기
                            peek[2] = String.valueOf(Integer.parseInt(peek[2]) - nowtime);
                            // peek 터트리고 다시 삽입
                            stack.pop();
                            stack.add(peek);
                            // nowtime 갱신하여 while문 빠져나가기
                            nowtime = 0;
                        }
                    }

                }
                /**
                 * 과제를 끝낼 수 없는 경우
                 */
            } else {
                // 과제를 진행한 시간만 더하고 나머지 남긴 뒤 빼기
                // 과제를 진행한 시간 = (다음 start - 지금 start)
                int spendTime = (Integer.parseInt(plans[i + 1][1]) - Integer.parseInt(plans[i][1]));

                // 지금 과제의 playtime 갱신하기
                plans[i][2] = String.valueOf(Integer.parseInt(plans[i][2]) - spendTime);

                // 처리 못했으니 stack에 쌓기
                stack.push(plans[i]);
            }

        }

        // 마지막 처리
        // 마지막은 무조건 끝나니깡
        result.add(plans[plans.length - 1][0]);

        // 전체 한번 돌았는데 아직 끝나지 않았다면
        // 순서대로 stack 처리해주기
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                result.add((stack.pop())[0]);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}