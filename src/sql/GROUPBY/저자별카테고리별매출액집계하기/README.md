���� �� ī�װ� �� ����� �����ϱ�
���� ����
������ ��� �� �������� �Ǹ����� �������� ���� ����(BOOK), ���� ����(AUTHOR) ���̺��Դϴ�.

BOOK ���̺��� �� ������ ������ ���� ���̺�� �Ʒ��� ���� ������ �Ǿ��ֽ��ϴ�.

Column name	Type	Nullable	Description
BOOK_ID	INTEGER	FALSE	���� ID
CATEGORY	VARCHAR(N)	FALSE	ī�װ� (����, �ι�, �Ҽ�, ��Ȱ, ���)
AUTHOR_ID	INTEGER	FALSE	���� ID
PRICE	INTEGER	FALSE	�ǸŰ� (��)
PUBLISHED_DATE	DATE	FALSE	������
AUTHOR ���̺��� ������ ������ ������ ���� ���̺�� �Ʒ��� ���� ������ �Ǿ��ֽ��ϴ�.

Column name	Type	Nullable	Description
AUTHOR_ID	INTEGER	FALSE	���� ID
AUTHOR_NAME	VARCHAR(N)	FALSE	���ڸ�
BOOK_SALES ���̺��� �� ������ ��¥ �� �Ǹŷ� ������ ���� ���̺�� �Ʒ��� ���� ������ �Ǿ��ֽ��ϴ�.

Column name	Type	Nullable	Description
BOOK_ID	INTEGER	FALSE	���� ID
SALES_DATE	DATE	FALSE	�Ǹ���
SALES	INTEGER	FALSE	�Ǹŷ�
����
2022�� 1���� ���� �Ǹ� �����͸� �������� ���� ��, ī�װ� �� �����(TOTAL_SALES = �Ǹŷ� * �ǸŰ�) �� ���Ͽ�, ���� ID(AUTHOR_ID), ���ڸ�(AUTHOR_NAME), ī�װ�(CATEGORY), �����(SALES) ����Ʈ�� ����ϴ� SQL���� �ۼ����ּ���.
����� ���� ID�� ������������, ���� ID�� ���ٸ� ī�װ��� �������� �������ּ���.

����
���� ��� BOOK ���̺�� AUTHOR ���̺�, BOOK_SALES ���̺��� ������ ���ٸ�

BOOK_ID	CATEGORY	AUTHOR_ID	PRICE	PUBLISHED_DATE
1	�ι�	1	10000	2020-01-01
2	����	1	9000	2021-02-05
3	����	2	9000	2021-03-11
AUTHOR_ID	AUTHOR_NAME
1	ȫ�浿
2	�迵ȣ
BOOK_ID	SALES_DATE	SALES
1	2022-01-01	2
2	2022-01-02	3
1	2022-01-05	1
2	2022-01-20	5
2	2022-01-21	6
3	2022-01-22	2
2	2022-02-11	3
2022�� 1���� ���� �� �� ������� ���� ID �� 1 �� ������ �� 3�� * 10,000�� = 30,000��, ���� ID �� 2 �� ������ �� 14�� * 9,000 = 126,000�� �̰�, ���� ID �� 3 �� ������ �� 2�� * 9,000 = 18,000�� �Դϴ�.

���� �� ī�װ� ���� ������� �����ϸ� ����� ������ �����ϴ�.

AUTHOR_ID	AUTHOR_NAME	CATEGORY	TOTAL_SALES
1	ȫ�浿	�ι�	30000
1	ȫ�浿	����	126000
2	�迵ȣ	����	18000
�׸��� ���� ID, ī�װ� ������ �������� �����ϸ� ������ ���� ���;� �մϴ�.

AUTHOR_ID	AUTHOR_NAME	CATEGORY	TOTAL_SALES
1	ȫ�浿	�ι�	30000
1	ȫ�浿	����	126000
2	�迵ȣ	����	18000