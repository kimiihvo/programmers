���ǿ� �����ϴ� �߰�ŷ� ���� ��ȸ�ϱ�
���� ����
������ �߰�ŷ� �Խ��� ������ ���� USED_GOODS_BOARD ���̺��Դϴ�. USED_GOODS_BOARD ���̺��� ������ ������ BOARD_ID, WRITER_ID, TITLE, CONTENTS, PRICE, CREATED_DATE, STATUS, VIEWS�� �Խñ� ID, �ۼ��� ID, �Խñ� ����, �Խñ� ����, ����, �ۼ���, �ŷ�����, ��ȸ���� �ǹ��մϴ�.

Column name	Type	Nullable
BOARD_ID	VARCHAR(5)	FALSE
WRITER_ID	VARCHAR(50)	FALSE
TITLE	VARCHAR(100)	FALSE
CONTENTS	VARCHAR(1000)	FALSE
PRICE	NUMBER	FALSE
CREATED_DATE	DATE	FALSE
STATUS	VARCHAR(10)	FALSE
VIEWS	NUMBER	FALSE
����
USED_GOODS_BOARD ���̺��� 2022�� 10�� 5�Ͽ� ��ϵ� �߰�ŷ� �Խù��� �Խñ� ID, �ۼ��� ID, �Խñ� ����, ����, �ŷ����¸� ��ȸ�ϴ� SQL���� �ۼ����ּ���. �ŷ����°� SALE �̸� �Ǹ���, RESERVED�̸� ������, DONE�̸� �ŷ��Ϸ� �з��Ͽ� ������ֽð�, ����� �Խñ� ID�� �������� �������� �������ּ���.

����
USED_GOODS_BOARD ���̺��� ������ ���� ��

BOARD_ID	WRITER_ID	TITLE	CONTENTS	PRICE	CREATED_DATE	STATUS	VIEWS
B0007	s2s2123	Ŀ�Ǳ۶��δ�	����ǰó�� �����մϴ�.	7000	2022-10-04	DONE	210
B0008	hong02	������ �Ǹ��մϴ�	����ٿ����� �����ߴٰ� ������� �ʾƼ� ������	40000	2022-10-04	SALE	301
B0009	yawoong67	���� �˴ϴ�	6�� ����. ȯ�� ��ǰ �ȵ˴ϴ�.	12000	2022-10-05	DONE	202
B0010	keel1990	ö������5��	ö������ 5�� ������ ��	10000	2022-10-05	SALE	194
SQL�� �����ϸ� ������ ���� ��µǾ�� �մϴ�.

BOARD_ID	WRITER_ID	TITLE	PRICE	STATUS
B0010	keel1990	ö������5��	10000	�Ǹ���
B0009	yawoong67	���� �˴ϴ�	12000	�ŷ��Ϸ�