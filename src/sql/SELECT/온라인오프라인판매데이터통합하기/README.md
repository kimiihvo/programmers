��������/�¶��� �Ǹ� ������ �����ϱ�
���� ����
������ ��� �Ƿ� ���θ��� �¶��� ��ǰ �Ǹ� ������ ���� ONLINE_SALE ���̺�� �������� ��ǰ �Ǹ� ������ ���� OFFLINE_SALE ���̺� �Դϴ�. ONLINE_SALE ���̺��� �Ʒ��� ���� ������ �Ǿ������� ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE�� ���� �¶��� ��ǰ �Ǹ� ID, ȸ�� ID, ��ǰ ID, �Ǹŷ�, �Ǹ����� ��Ÿ���ϴ�.

Column name	Type	Nullable
ONLINE_SALE_ID	INTEGER	FALSE
USER_ID	INTEGER	FALSE
PRODUCT_ID	INTEGER	FALSE
SALES_AMOUNT	INTEGER	FALSE
SALES_DATE	DATE	FALSE
������ ��¥, ȸ�� ID, ��ǰ ID ���տ� ���ؼ��� �ϳ��� �Ǹ� �����͸� �����մϴ�.

OFFLINE_SALE ���̺��� �Ʒ��� ���� ������ �Ǿ������� OFFLINE_SALE_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE�� ���� �������� ��ǰ �Ǹ� ID, ��ǰ ID, �Ǹŷ�, �Ǹ����� ��Ÿ���ϴ�.

Column name	Type	Nullable
OFFLINE_SALE_ID	INTEGER	FALSE
PRODUCT_ID	INTEGER	FALSE
SALES_AMOUNT	INTEGER	FALSE
SALES_DATE	DATE	FALSE
������ ��¥, ��ǰ ID ���տ� ���ؼ��� �ϳ��� �Ǹ� �����͸� �����մϴ�.

����
ONLINE_SALE ���̺�� OFFLINE_SALE ���̺��� 2022�� 3���� ��������/�¶��� ��ǰ �Ǹ� �������� �Ǹ� ��¥, ��ǰID, ����ID, �Ǹŷ��� ����ϴ� SQL���� �ۼ����ּ���. OFFLINE_SALE ���̺��� �Ǹ� �������� USER_ID ���� NULL �� ǥ�����ּ���. ����� �Ǹ����� �������� �������� �������ֽð� �Ǹ����� ���ٸ� ��ǰ ID�� �������� ��������, ��ǰID���� ���ٸ� ���� ID�� �������� �������� �������ּ���.

����
���� ��� ONLINE_SALE ���̺��� ������ ����

ONLINE_SALE_ID	USER_ID	PRODUCT_ID	SALES_AMOUNT	SALES_DATE
1	1	3	2	2022-02-25
2	4	4	1	2022-03-01
4	2	2	2	2022-03-02
3	6	3	3	2022-03-02
5	5	5	1	2022-03-03
6	5	7	1	2022-04-06
OFFLINE_SALE ���̺��� ������ ���ٸ�

OFFLINE_SALE_ID	PRODUCT_ID	SALES_AMOUNT	SALES_DATE
1	1	2	2022-02-21
4	1	2	2022-03-01
3	3	3	2022-03-01
2	4	1	2022-03-01
5	2	1	2022-03-03
6	2	1	2022-04-01
�� ���̺��� 2022�� 3���� �Ǹ� �����͸� ���ļ�, ������ ����� ������ ���ƾ� �մϴ�.

SALES_DATE	PRODUCT_ID	USER_ID	SALES_AMOUNT
2022-03-01	1	NULL	2
2022-03-01	3	NULL	3
2022-03-01	4	NULL	1
2022-03-01	4	4	1
2022-03-02	2	2	2
2022-03-02	3	6	3
2022-03-03	2	NULL	1
2022-03-03	5	5	1