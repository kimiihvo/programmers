package level2.���������ϱ�;

import java.util.*;

class Solution {

    static List<String> result = new ArrayList<String>();
    static Stack<String[]> stack = new Stack<>();

    public static String[] solution(String[][] plans) {
        /**
         * plans: start �������� ����
         */
        // �ð� > ������ ����
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
         * ����
         * ���ļ����� �ѹ� �� ����
         */
        for (int i = 0; i < plans.length - 1; i++) {

            if (Integer.parseInt(plans[i][1]) + Integer.parseInt(plans[i][2]) <= Integer.parseInt(plans[i + 1][1])) {
                // ���� ó�� ��.
                result.add(plans[i][0]);

                // ���� ó�� ��, ���� �ð��� �ִ��� Ȯ��
                // nowtime = (���� ���� start + ���� ���� playtime) - (���� ���� start)
                int nowtime = (Integer.parseInt(plans[i][1]) + Integer.parseInt(plans[i][2]))
                        - Integer.parseInt(plans[i + 1][1]);

                // �����ð��� �ְ� && ����� ������ ������
                if (nowtime < 0 && !stack.isEmpty()) {

                    // ���⼭ nowtime �� �� ������ ��� �Ǵ� �ݺ� �ؾ���
                    // ���Ǽ��� ���� ����� ����
                    nowtime *= -1;

                    // �����ð� �ȿ� ó���Ǵ� �� �ִ��� Ȯ��
                    // ���� �ð��� �ְ� ����� ������ ������
                    while (nowtime > 0 && !stack.isEmpty()) {
                        // ����� ������ playtime ��������
                        int stack_peek = Integer.parseInt(stack.peek()[2]);
                        // ����� ������ playtime�� ���� �ð����� �۰ų� ������
                        // ó���� �� ����
                        if (stack_peek <= nowtime) {
                            // ���� ó�� ��.
                            result.add((stack.pop())[0]);
                            // �ð��� ������ nowtime ����
                            nowtime = nowtime - stack_peek;

                            // ó���� �� ���� ���
                            // ó���� �� ��� ���� �ð��� �Һ��ؾ���
                        } else {
                            // ����� ���� �ƿ� �迭ä�� ��������
                            String[] peek = stack.peek();
                            // ����� ������ playtime - nowtime ���ֱ�
                            peek[2] = String.valueOf(Integer.parseInt(peek[2]) - nowtime);
                            // peek ��Ʈ���� �ٽ� ����
                            stack.pop();
                            stack.add(peek);
                            // nowtime �����Ͽ� while�� ����������
                            nowtime = 0;
                        }
                    }

                }
                /**
                 * ������ ���� �� ���� ���
                 */
            } else {
                // ������ ������ �ð��� ���ϰ� ������ ���� �� ����
                // ������ ������ �ð� = (���� start - ���� start)
                int spendTime = (Integer.parseInt(plans[i + 1][1]) - Integer.parseInt(plans[i][1]));

                // ���� ������ playtime �����ϱ�
                plans[i][2] = String.valueOf(Integer.parseInt(plans[i][2]) - spendTime);

                // ó�� �������� stack�� �ױ�
                stack.push(plans[i]);
            }

        }

        // ������ ó��
        // �������� ������ �����ϱ�
        result.add(plans[plans.length - 1][0]);

        // ��ü �ѹ� ���Ҵµ� ���� ������ �ʾҴٸ�
        // ������� stack ó�����ֱ�
        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                result.add((stack.pop())[0]);
            }
        }

        return result.toArray(new String[result.size()]);
    }
}