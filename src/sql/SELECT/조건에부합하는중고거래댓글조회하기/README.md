���ǿ� �����ϴ� �߰�ŷ� ��� ��ȸ�ϱ�
���� ����
������ �߰�ŷ� �Խ��� ������ ���� USED_GOODS_BOARD ���̺�� �߰�ŷ� �Խ��� ÷������ ������ ���� USED_GOODS_REPLY ���̺��Դϴ�. USED_GOODS_BOARD ���̺��� ������ ������ BOARD_ID, WRITER_ID, TITLE, CONTENTS, PRICE, CREATED_DATE, STATUS, VIEWS�� �Խñ� ID, �ۼ��� ID, �Խñ� ����, �Խñ� ����, ����, �ۼ���, �ŷ�����, ��ȸ���� �ǹ��մϴ�.

Column name	Type	Nullable
BOARD_ID	VARCHAR(5)	FALSE
WRITER_ID	VARCHAR(50)	FALSE
TITLE	VARCHAR(100)	FALSE
CONTENTS	VARCHAR(1000)	FALSE
PRICE	NUMBER	FALSE
CREATED_DATE	DATE	FALSE
STATUS	VARCHAR(10)	FALSE
VIEWS	NUMBER	FALSE
USED_GOODS_REPLY ���̺��� ������ ������ REPLY_ID, BOARD_ID, WRITER_ID, CONTENTS, CREATED_DATE�� ���� ��� ID, �Խñ� ID, �ۼ��� ID, ��� ����, �ۼ����� �ǹ��մϴ�.

Column name	Type	Nullable
REPLY_ID	VARCHAR(10)	FALSE
BOARD_ID	VARCHAR(5)	FALSE
WRITER_ID	VARCHAR(50)	FALSE
CONTENTS	VARCHAR(1000)	TRUE
CREATED_DATE	DATE	FALSE
����
USED_GOODS_BOARD�� USED_GOODS_REPLY ���̺��� 2022�� 10���� �ۼ��� �Խñ� ����, �Խñ� ID, ��� ID, ��� �ۼ��� ID, ��� ����, ��� �ۼ����� ��ȸ�ϴ� SQL���� �ۼ����ּ���. ����� ��� �ۼ����� �������� �������� �������ֽð�, ��� �ۼ����� ���ٸ� �Խñ� ������ �������� �������� �������ּ���.

����
USED_GOODS_BOARD ���̺��� ������ ����

BOARD_ID	WRITER_ID	TITLE	CONTENTS	PRICE	CREATED_DATE	STATUS	VIEWS
B0001	kwag98	�ݷ��� �躯�е� �˴ϴ�	���� ������ �Ǹ��մϴ�. ���� �̰��� ����ǰ�Դϴ�.	12000	2022-10-01	DONE	250
B0002	lee871201	������ ��������	���� ������� �����Դϴ�.	3000	2022-10-02	DONE	121
B0003	goung12	������ ����	����� ��ġ�� �ؼ� �˴ϴ�.	9000	2022-10-02	SALE	212
B0004	keel1990	��� �Ͱ���	�ż��谭�������� ����. ��ǰ �ƴҽ� ���ۼ�Ʈ ȯ��	130000	2022-10-02	SALE	199
B0005	haphli01	����Ŭ���� �Ⱦƿ�	������� 2025���������	10000	2022-10-02	SALE	121
USED_GOODS_REPLY ���̺��� ������ ���� ��

REPLY_ID	BOARD_ID	WRITER_ID	CONTENTS	CREATED_DATE
R000000001	B0001	s2s2123	�����ϰڽ��ϴ�. ���� �帳�ϴ�.	2022-10-02
R000000002	B0002	hoho1112	���� �ּ���.	2022-10-03
R000000003	B0006	hwahwa2	��ϴ�. �����ּ���.	2022-10-03
R000000004	B0007	hong02	������	2022-10-06
R000000005	B0009	hanju23	���ſϷ�	2022-10-07
SQL�� �����ϸ� ������ ���� ��µǾ�� �մϴ�.

TITLE	BOARD_ID	REPLY_ID	WRITER_ID	CONTENTS	CREATED_DATE
�ݷ��� �躯�е� �˴ϴ�	B0001	R000000001	s2s2123	�����ϰڽ��ϴ�. ���� �帳�ϴ�.	2022-10-02
������ ��������	B0002	R000000002	hoho1112	���� �ּ���.	2022-10-03
���ǻ���
CREATED_DATE�� ������ ������ ���˰� ��ġ�ؾ� ����ó�� �˴ϴ�.