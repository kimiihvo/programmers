���� ��� ��ǰ ���ϱ�
���� ����
������ ��� �Ƿ� ���θ����� �Ǹ� ���� ��ǰ���� ������ ���� PRODUCT ���̺��Դϴ�. PRODUCT ���̺��� �Ʒ��� ���� ������ �Ǿ�������, PRODUCT_ID, PRODUCT_CODE, PRICE�� ���� ��ǰ ID, ��ǰ�ڵ�, �ǸŰ��� ��Ÿ���ϴ�.

Column name	Type	Nullable
PRODUCT_ID	INTEGER	FALSE
PRODUCT_CODE	VARCHAR(8)	FALSE
PRICE	INTEGER	FALSE
��ǰ ���� �ߺ����� �ʴ� 8�ڸ� ��ǰ�ڵ� ���� ������, �� 2�ڸ��� ī�װ� �ڵ带 �ǹ��մϴ�.

����
PRODUCT ���̺��� �Ǹ� ���� ��ǰ �� ���� ���� �ǸŰ��� ����ϴ� SQL���� �ۼ����ּ���. �̶� �÷����� MAX_PRICE�� �������ּ���.

����
���� ��� PRODUCT ���̺��� ������ ���ٸ�

PRODUCT_ID	PRODUCT_CODE	PRICE
1	A1000001	10000
2	A2000005	9000
3	C1000006	22000
���� ���� �ǸŰ��� 22,000 �� �̹Ƿ�, ������ ���� ����� ���;� �մϴ�.

MAX_PRICE
22000