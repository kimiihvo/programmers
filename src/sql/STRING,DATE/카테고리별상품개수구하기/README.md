ī�װ� �� ��ǰ ���� ���ϱ�
���� ����
���� ����
������ ��� �Ƿ� ���θ����� �Ǹ����� ��ǰ���� ������ ���� PRODUCT ���̺��Դϴ�. PRODUCT ���̺��� �Ʒ��� ���� ������ �Ǿ�������, PRODUCT_ID, PRODUCT_CODE, PRICE�� ���� ��ǰ ID, ��ǰ�ڵ�, �ǸŰ��� ��Ÿ���ϴ�.

Column name	Type	Nullable
PRODUCT_ID	INTEGER	FALSE
PRODUCT_CODE	VARCHAR(8)	FALSE
PRICE	INTEGER	FALSE
��ǰ ���� �ߺ����� �ʴ� 8�ڸ� ��ǰ�ڵ� ���� ������, �� 2�ڸ��� ī�װ� �ڵ带 �ǹ��մϴ�.

����
PRODUCT ���̺��� ��ǰ ī�װ� �ڵ�(PRODUCT_CODE �� 2�ڸ�) �� ��ǰ ������ ����ϴ� SQL���� �ۼ����ּ���. ����� ��ǰ ī�װ� �ڵ带 �������� �������� �������ּ���.

����
���� ��� PRODUCT ���̺��� ������ ���ٸ�

PRODUCT_ID	PRODUCT_CODE	PRICE
1	A1000011	10000
2	A1000045	9000
3	C3000002	22000
4	C3000006	15000
5	C3000010	30000
6	K1000023	17000
��ǰ ī�װ� �ڵ� �� ��ǰ�� �Ʒ��� �����Ƿ�,

A1: PRODUCT_ID�� 1, 2 �� ��ǰ
C3: PRODUCT_ID�� 3, 4, 5 �� ��ǰ
K1: PRODUCT_ID�� 6 �� ��ǰ
������ ���� ����� ���;� �մϴ�.

CATEGORY	PRODUCTS
A1	2
C3	3
K1	1