�߼�ȭ ���� �ľ��ϱ�
���� ����
���� ����
ANIMAL_INS ���̺��� ���� ��ȣ�ҿ� ���� ������ ������ ���� ���̺��Դϴ�. ANIMAL_INS ���̺� ������ ������ ������, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE�� ���� ������ ���̵�, ���� ��, ��ȣ ������, ��ȣ ���� �� ����, �̸�, ���� �� �߼�ȭ ���θ� ��Ÿ���ϴ�.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
��ȣ���� ������ �߼�ȭ�Ǿ����� �ƴ��� �ľ��Ϸ� �մϴ�. �߼�ȭ�� ������ SEX_UPON_INTAKE �÷��� 'Neutered' �Ǵ� 'Spayed'��� �ܾ ����ֽ��ϴ�. ������ ���̵�� �̸�, �߼�ȭ ���θ� ���̵� ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� �߼�ȭ�� �Ǿ��ִٸ� 'O', �ƴ϶�� 'X'��� ǥ�����ּ���.

����
���� ��� ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A355753	Dog	2015-09-10 13:14:00	Normal	Elijah	Neutered Male
A373219	Cat	2014-07-29 11:43:00	Normal	Ella	Spayed Female
A382192	Dog	2015-03-13 13:14:00	Normal	Maxwell 2	Intact Male
�߼�ȭ�� ����: Elijah, Ella
�߼�ȭ���� ���� ����: Maxwell 2
���� SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_ID	NAME	�߼�ȭ
A355753	Elijah	O
A373219	Ella	O
A382192	Maxwell 2	X
�� �÷� �̸��� ��ġ���� �ʾƵ� �˴ϴ�.

