���� ������ ���� ȸ�� �� ���ϱ�
���� ����
������ ��� �Ƿ� ���θ��� ������ ȸ�� ������ ���� USER_INFO ���̺��Դϴ�. USER_INFO ���̺��� �Ʒ��� ���� ������ �Ǿ�������, USER_ID, GENDER, AGE, JOINED�� ���� ȸ�� ID, ����, ����, �������� ��Ÿ���ϴ�.

Column name	Type	Nullable
USER_ID	INTEGER	FALSE
GENDER	TINYINT(1)	TRUE
AGE	INTEGER	TRUE
JOINED	DATE	FALSE
GENDER �÷��� ����ְų� 0 �Ǵ� 1�� ���� ������ 0�� ��� ���ڸ�, 1�� ���� ���ڸ� ��Ÿ���ϴ�.

����
USER_INFO ���̺��� ���� ������ ���� ȸ���� �� ������ ����ϴ� SQL���� �ۼ����ּ���. �̶� �÷����� USERS�� �������ּ���.

����
���� ��� USER_INFO ���̺��� ������ ���ٸ�

USER_ID	GENDER	AGE	JOINED
1	1	26	2021-06-01
2	NULL	NULL	2021-07-25
3	1	NULL	2021-07-30
4	0	31	2021-08-03
���� ������ ���� ȸ���� 2�� �̹Ƿ�, ������ ���� ����� ���;� �մϴ�.

USERS
2