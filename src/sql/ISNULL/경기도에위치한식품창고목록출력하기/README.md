��⵵�� ��ġ�� ��ǰâ�� ��� ����ϱ�
���� ����
������ ��ǰâ���� ������ ���� FOOD_WAREHOUSE ���̺��Դϴ�. FOOD_WAREHOUSE ���̺��� ������ ������ WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, TLNO, FREEZER_YN�� â�� ID, â�� �̸�, â�� �ּ�, ��ȭ��ȣ, �õ��ü� ���θ� �ǹ��մϴ�.

Column name	Type	Nullable
WAREHOUSE_ID	VARCHAR(10)	FALSE
WAREHOUSE_NAME	VARCHAR(20)	FALSE
ADDRESS	VARCHAR(100)	TRUE
TLNO	VARCHAR(20)	TRUE
FREEZER_YN	VARCHAR(1)	TRUE
����
FOOD_WAREHOUSE ���̺��� ��⵵�� ��ġ�� â���� ID, �̸�, �ּ�, �õ��ü� ���θ� ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� �õ��ü� ���ΰ� NULL�� ���, 'N'���� ��½��� �ֽð� ����� â�� ID�� �������� �������� �������ּ���.

����
FOOD_WAREHOUSE ���̺��� ������ ���� ��

WAREHOUSE_ID	WAREHOUSE_NAME	ADDRESS	TLNO	FREEZER_YN
WH0001	â��_���1	��⵵ �Ȼ�� ��ϱ� ���� 141	031-152-1332	Y
WH0002	â��_���1	��û�ϵ� ��õ�� ��õ�� �����̷� 110	043-623-9900	Y
WH0003	â��_���2	��⵵ ��õ�� ����� ����� 811	031-221-7241	NULL
WH0004	â��_���3	��⵵ ������ ����� �����߾ӷ�205����	031-671-1900	N
WH0005	â��_�泲1	��û���� õ�Ƚ� ������ ������ �Ŵ���1�� 9	041-876-5421	Y
SQL�� �����ϸ� ������ ���� ��µǾ�� �մϴ�.

WAREHOUSE_ID	WAREHOUSE_NAME	ADDRESS	FREEZER_YN
WH0001	â��_���1	��⵵ �Ȼ�� ��ϱ� ���� 141	Y
WH0003	â��_���2	��⵵ ��õ�� ����� ����� 811	N
WH0004	â��_���3	��⵵ ������ ����� �����߾ӷ�205����	N