���ǿ� �´� ������ ���� ����Ʈ ����ϱ�
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
����
'����' ī�װ��� ���ϴ� �������� ���� ID(BOOK_ID), ���ڸ�(AUTHOR_NAME), ������(PUBLISHED_DATE) ����Ʈ�� ����ϴ� SQL���� �ۼ����ּ���.
����� �������� �������� �������� �������ּ���.

����
���� ��� BOOK ���̺�� AUTHOR ���̺��� ������ ���ٸ�

BOOK_ID	CATEGORY	AUTHOR_ID	PRICE	PUBLISHED_DATE
1	�ι�	1	10000	2020-01-01
2	����	1	9000	2021-04-11
3	����	2	11000	2021-02-05
AUTHOR_ID	AUTHOR_NAME
1	ȫ�浿
2	�迵ȣ
'����' ī�װ��� ���ϴ� ������ ���� ID�� 2, 3�� �����̰�, �������� �������� ������������ �����ϸ� ������ ���� ����� ���;� �մϴ�.

BOOK_ID	AUTHOR_NAME	PUBLISHED_DATE
3	�迵ȣ	2021-02-05
2	ȫ�浿	2021-04-11
���ǻ���
PUBLISHED_DATE�� ����Ʈ ������ ���ÿ� �����ؾ� ����ó�� �˴ϴ�.