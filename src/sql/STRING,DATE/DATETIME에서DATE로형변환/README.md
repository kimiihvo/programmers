DATETIME���� DATE�� �� ��ȯ
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
ANIMAL_INS ���̺� ��ϵ� ��� ���ڵ忡 ����, �� ������ ���̵�� �̸�, ���� ��¥1�� ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� ����� ���̵� ������ ��ȸ�ؾ� �մϴ�.

����
���� ���, ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_INS

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A349996	Cat	2018-01-22 14:32:00	Normal	Sugar	Neutered Male
A350276	Cat	2017-08-13 13:50:00	Normal	Jewel	Spayed Female
A350375	Cat	2017-03-06 15:01:00	Normal	Meo	Neutered Male
A352555	Dog	2014-08-08 04:20:00	Normal	Harley	Spayed Female
A352713	Cat	2017-04-13 16:29:00	Normal	Gia	Spayed Female
SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_ID	NAME	��¥
A349996	Sugar	2018-01-22
A350276	Jewel	2017-08-13
A350375	Meo	2017-03-06
A352555	Harley	2014-08-08
A352713	Gia	2017-04-13
�� ������ Kaggle�� "Austin Animal Center Shelter Intakes and Outcomes"���� �����ϴ� �����͸� ����Ͽ����� ODbL�� ������ �޽��ϴ�.

�ð�(��-��-��)�� ������ ��¥(��-��-��)�� �����ּ���. ?