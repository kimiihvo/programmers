���Ϸ� ���� ���̽�ũ�� ����
���� ����
������ ���̽�ũ�� ������ ��ݱ� �ֹ� ������ ���� FIRST_HALF ���̺�� ���̽�ũ�� ���п� ���� ������ ���� ICECREAM_INFO ���̺��Դϴ�. FIRST_HALF ���̺� ������ ������ ������, SHIPMENT_ID, FLAVOR, TOTAL_ORDER �� ���� ���̽�ũ�� ���忡�� ���̽�ũ�� ���Ա����� ���� ��ȣ, ���̽�ũ�� ��, ��ݱ� ���̽�ũ�� ���ֹ����� ��Ÿ���ϴ�. FIRST_HALF ���̺��� �⺻ Ű�� FLAVOR�Դϴ�.

NAME	TYPE	NULLABLE
SHIPMENT_ID	INT(N)	FALSE
FLAVOR	VARCHAR(N)	FALSE
TOTAL_ORDER	INT(N)	FALSE
ICECREAM_INFO ���̺� ������ ������ ������, FLAVOR, INGREDITENT_TYPE �� ���� ���̽�ũ�� ��, ���̽�ũ���� ���� Ÿ���� ��Ÿ���ϴ�. INGREDIENT_TYPE���� ���̽�ũ���� �� ������ �����̸� sugar_based��� �Էµǰ�, ���̽�ũ���� �� ������ �����̸� fruit_based��� �Էµ˴ϴ�. ICECREAM_INFO�� �⺻ Ű�� FLAVOR�Դϴ�. ICECREAM_INFO���̺��� FLAVOR�� FIRST_HALF ���̺��� FLAVOR�� �ܷ� Ű�Դϴ�.

NAME	TYPE	NULLABLE
FLAVOR	VARCHAR(N)	FALSE
INGREDIENT_TYPE	VARCHAR(N)	FALSE
����
��ݱ� ���̽�ũ�� ���ֹ����� 3,000���� �����鼭 ���̽�ũ���� �� ������ ������ ���̽�ũ���� ���� ���ֹ����� ū ������� ��ȸ�ϴ� SQL ���� �ۼ����ּ���.

����
���� ��� FIRST_HALF ���̺��� ������ ����

SHIPMENT_ID	FLAVOR	TOTAL_ORDER
101	chocolate	3200
102	vanilla	2800
103	mint_chocolate	1700
104	caramel	2600
105	white_chocolate	3100
106	peach	2450
107	watermelon	2150
108	mango	2900
109	strawberry	3100
110	melon	3150
111	orange	2900
112	pineapple	2900
ICECREAM_INFO ���̺��� ������ ���ٸ�

FLAVOR	INGREDIENT_TYPE
chocolate	sugar_based
vanilla	sugar_based
mint_chocolate	sugar_based
caramel	sugar_based
white_chocolate	sugar_based
peach	fruit_based
watermelon	fruit_based
mango	fruit_based
strawberry	fruit_based
melon	fruit_based
orange	fruit_based
pineapple	fruit_based
��ݱ� ���̽�ũ�� ���ֹ����� 3,000���� ���� ���̽�ũ�� ���� chocolate, strawberry, melon, white_chocolate�Դϴ�. �� �߿� ���̽�ũ���� �� ������ ������ ���̽�ũ�� ���� strawberry�� melon�̰� ���ֹ����� ū ������� ���̽�ũ�� ���� ��ȸ�ϸ� melon, strawberry ������ ��ȸ�Ǿ�� �մϴ�. ���� SQL ���� �����ϸ� ������ ���� ���;� �մϴ�.

FLAVOR
melon
strawberry