�籸�Ű� �Ͼ ��ǰ�� ȸ�� ����Ʈ ���ϱ�
���� ����
������ ��� �Ƿ� ���θ��� �¶��� ��ǰ �Ǹ� ������ ���� ONLINE_SALE ���̺� �Դϴ�. ONLINE_SALE ���̺��� �Ʒ��� ���� ������ �Ǿ������� ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE�� ���� �¶��� ��ǰ �Ǹ� ID, ȸ�� ID, ��ǰ ID, �Ǹŷ�, �Ǹ����� ��Ÿ���ϴ�.

Column name	Type	Nullable
ONLINE_SALE_ID	INTEGER	FALSE
USER_ID	INTEGER	FALSE
PRODUCT_ID	INTEGER	FALSE
SALES_AMOUNT	INTEGER	FALSE
SALES_DATE	DATE	FALSE
������ ��¥, ȸ�� ID, ��ǰ ID ���տ� ���ؼ��� �ϳ��� �Ǹ� �����͸� �����մϴ�.

����
ONLINE_SALE ���̺��� ������ ȸ���� ������ ��ǰ�� �籸���� �����͸� ���Ͽ�, �籸���� ȸ�� ID�� �籸���� ��ǰ ID�� ����ϴ� SQL���� �ۼ����ּ���. ����� ȸ�� ID�� �������� �������� �������ֽð� ȸ�� ID�� ���ٸ� ��ǰ ID�� �������� �������� �������ּ���.

����
���� ��� ONLINE_SALE ���̺��� ������ ���ٸ�

ONLINE_SALE_ID	USER_ID	PRODUCT_ID	SALES_AMOUNT	SALES_DATE
1	1	3	2	2022-02-25
2	1	4	1	2022-03-01
4	2	4	2	2022-03-12
3	1	3	3	2022-03-31
5	3	5	1	2022-04-03
6	2	4	1	2022-04-06
2	1	4	2	2022-05-11
USER_ID �� 1�� ������ PRODUCT_ID �� 3, 4�� ��ǰ���� �籸���ϰ�, USER_ID �� 2�� ������ PRODUCT_ID �� 4�� ��ǰ�� �籸�� �Ͽ����Ƿ�, ������ ���� ����� ���;��մϴ�.

USER_ID	PRODUCT_ID
1	4
1	3
2	4