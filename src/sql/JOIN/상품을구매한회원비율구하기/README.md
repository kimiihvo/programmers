��ǰ�� ������ ȸ�� ���� ���ϱ�
���� ����
������ ��� �Ƿ� ���θ��� ������ ȸ�� ������ ���� USER_INFO ���̺�� �¶��� ��ǰ �Ǹ� ������ ���� ONLINE_SALE ���̺� �Դϴ�. USER_INFO ���̺��� �Ʒ��� ���� ������ �Ǿ������� USER_ID, GENDER, AGE, JOINED�� ���� ȸ�� ID, ����, ����, �������� ��Ÿ���ϴ�.

Column name	Type	Nullable
USER_ID	INTEGER	FALSE
GENDER	TINYINT(1)	TRUE
AGE	INTEGER	TRUE
JOINED	DATE	FALSE
GENDER �÷��� ����ְų� 0 �Ǵ� 1�� ���� ������ 0�� ��� ���ڸ�, 1�� ���� ���ڸ� ��Ÿ���ϴ�.

ONLINE_SALE ���̺��� �Ʒ��� ���� ������ �Ǿ������� ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE�� ���� �¶��� ��ǰ �Ǹ� ID, ȸ�� ID, ��ǰ ID, �Ǹŷ�, �Ǹ����� ��Ÿ���ϴ�.

Column name	Type	Nullable
ONLINE_SALE_ID	INTEGER	FALSE
USER_ID	INTEGER	FALSE
PRODUCT_ID	INTEGER	FALSE
SALES_AMOUNT	INTEGER	FALSE
SALES_DATE	DATE	FALSE
������ ��¥, ȸ�� ID, ��ǰ ID ���տ� ���ؼ��� �ϳ��� �Ǹ� �����͸� �����մϴ�.

����
USER_INFO ���̺�� ONLINE_SALE ���̺��� 2021�⿡ ������ ��ü ȸ���� �� ��ǰ�� ������ ȸ������ ��ǰ�� ������ ȸ���� ����(=2021�⿡ ������ ȸ�� �� ��ǰ�� ������ ȸ���� / 2021�⿡ ������ ��ü ȸ�� ��)�� ��, �� ���� ����ϴ� SQL���� �ۼ����ּ���. ��ǰ�� ������ ȸ���� ������ �Ҽ��� �ι�°�ڸ����� �ݿø��ϰ�, ��ü ����� ���� �������� �������� �������ֽð� ���� ���ٸ� ���� �������� �������� �������ּ���.

����
���� ��� USER_INFO ���̺��� ������ ����

USER_ID	GENDER	AGE	JOINED
1	1	26	2021-06-01
2	NULL	NULL	2021-06-25
3	0	NULL	2021-06-30
4	0	31	2021-07-03
5	1	25	2022-01-09
6	1	33	2022-02-14
ONLINE_SALE �� ������ ���ٸ�

ONLINE_SALE_ID	USER_ID	PRODUCT_ID	SALES_AMOUNT	SALES_DATE
1	1	54	1	2022-01-01
2	1	3	2	2022-01-25
3	4	34	1	2022-01-30
4	6	253	3	2022-02-03
5	2	31	2	2022-02-09
6	5	35	1	2022-02-14
7	5	57	1	2022-02-18
2021�⿡ ������ ȸ���� USER_ID�� 1, 2, 3, 4 �� ȸ����� �� 4�� �Դϴ�. ONLINE_SALE ���̺��� �ش� ȸ���鿡 ���� �Ǹ� �����ʹ� ������ �����ϴ�.

ONLINE_SALE_ID	USER_ID	PRODUCT_ID	SALES_AMOUNT	SALES_DATE
1	1	54	1	2022-01-01
2	1	3	2	2022-01-25
3	4	34	1	2022-01-30
5	2	31	2	2022-02-09
�׷��Ƿ� ��, �� ���� ��ǰ�� ������ ȸ������ ��ǰ�� ������ ȸ���� ������ ���ϰ� ����� �����ϸ� ������ ���ƾ� �մϴ�.

YEAR	MONTH	PUCHASED_USERS	PUCHASED_RATIO
2022	1	2	0.5
2022	2	1	0.3