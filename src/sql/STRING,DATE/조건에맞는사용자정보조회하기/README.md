���ǿ� �´� ����� ���� ��ȸ�ϱ�
���� ����
������ �߰� �ŷ� �Խ��� ������ ���� USED_GOODS_BOARD ���̺�� �߰� �ŷ� �Խ��� ÷������ ������ ���� USED_GOODS_USER ���̺��Դϴ�. USED_GOODS_BOARD ���̺��� ������ ������ BOARD_ID, WRITER_ID, TITLE, CONTENTS, PRICE, CREATED_DATE, STATUS, VIEWS�� �Խñ� ID, �ۼ��� ID, �Խñ� ����, �Խñ� ����, ����, �ۼ���, �ŷ�����, ��ȸ���� �ǹ��մϴ�.

Column name	Type	Nullable
BOARD_ID	VARCHAR(5)	FALSE
WRITER_ID	VARCHAR(50)	FALSE
TITLE	VARCHAR(100)	FALSE
CONTENTS	VARCHAR(1000)	FALSE
PRICE	NUMBER	FALSE
CREATED_DATE	DATE	FALSE
STATUS	VARCHAR(10)	FALSE
VIEWS	NUMBER	FALSE
USED_GOODS_USER ���̺��� ������ ������ USER_ID, NICKNAME, CITY, STREET_ADDRESS1, STREET_ADDRESS2, TLNO�� ���� ȸ�� ID, �г���, ��, ���θ� �ּ�, �� �ּ�, ��ȭ��ȣ�� �ǹ��մϴ�.

Column name	Type	Nullable
USER_ID	VARCHAR(50)	FALSE
NICKANME	VARCHAR(100)	FALSE
CITY	VARCHAR(100)	FALSE
STREET_ADDRESS1	VARCHAR(100)	FALSE
STREET_ADDRESS2	VARCHAR(100)	TRUE
TLNO	VARCHAR(20)	FALSE
����
USED_GOODS_BOARD�� USED_GOODS_USER ���̺��� �߰� �ŷ� �Խù��� 3�� �̻� ����� ������� ����� ID, �г���, ��ü�ּ�, ��ȭ��ȣ�� ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶�, ��ü �ּҴ� ��, ���θ� �ּ�, �� �ּҰ� �Բ� ��µǵ��� ���ֽð�, ��ȭ��ȣ�� ��� xxx-xxxx-xxxx ���� ���·� ������ ���ڿ�(-)�� �����Ͽ� ������ּ���. ����� ȸ�� ID�� �������� �������� �������ּ���.

����
USED_GOODS_BOARD ���̺��� ������ ����

BOARD_ID	WRITER_ID	TITLE	CONTENTS	PRICE	CREATED_DATE	STATUS	VIEWS
B0001	dhfkzmf09	Į�����Ʈ ��Ʈ	��� 70%�̻� ��Ʈ�Դϴ�.	120000	2022-10-14	DONE	104
B0002	lee871201	������ ��������	���� ������� �����Դϴ�.	3000	2022-10-02	DONE	121
B0003	dhfkzmf09	����Ű ������	������� M�Դϴ�.	40000	2022-10-17	DONE	98
B0004	kwag98	�ݷ��� �躯�е� �˴ϴ�	���� ������ �Ǹ��մϴ�. ���� �̰��� ����ǰ�Դϴ�.	12000	2022-10-01	DONE	250
B0005	dhfkzmf09	PS4	PS5 ���ŷ����� �˴ϴ�.	250000	2022-11-03	DONE	111
USED_GOODS_USER ���̺��� ������ ���� ��

USER_ID	NICKNAME	CITY	STREET_ADDRESS1	STREET_ADDRESS2	TLNO
dhfkzmf09	����	������	�д籸 ������ 13	A�� 1107ȣ	01053422914
dlPcks90	���	������	�д籸 ������ 74	401ȣ	01034573944
cjfwls91	���ɸ��ݽ�	������	�д籸 ������ 185	501ȣ	01036344964
dlfghks94	���	������	�д籸 ������ 101	203�� 102ȣ	01032634154
rkdhs95	���	������	�д籸 ������ 23	501ȣ	01074564564
SQL�� �����ϸ� ������ ���� ��µǾ�� �մϴ�.

USER_ID	NICKNAME	��ü�ּ�	��ȭ��ȣ
dhfkzmf09	����	������ �д籸 ������ 13 A�� 1107ȣ	010-5342-2914