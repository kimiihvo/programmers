� ���� ã��
���� ����
ANIMAL_INS ���̺��� ���� ��ȣ�ҿ� ���� ������ ������ ���� ���̺��Դϴ�. ANIMAL_INS ���̺� ������ ������ ������, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE�� ���� ������ ���̵�, ���� ��, ��ȣ ������, ��ȣ ���� �� ����, �̸�, ���� �� �߼�ȭ ���θ� ��Ÿ���ϴ�.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
���� ��ȣ�ҿ� ���� ���� �� ���� ����1�� ���̵�� �̸��� ��ȸ�ϴ� SQL ���� �ۼ����ּ���. �̶� ����� ���̵� ������ ��ȸ���ּ���.

����
���� ��� ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A365172	Dog	2014-08-26 12:53:00	Normal	Diablo	Neutered Male
A367012	Dog	2015-09-16 09:06:00	Sick	Miller	Neutered Male
A365302	Dog	2017-01-08 16:34:00	Aged	Minnie	Spayed Female
A381217	Dog	2017-07-08 09:41:00	Sick	Cherokee	Neutered Male
�� �� ���� ������ Diablo, Miller, Cherokee�Դϴ�. ���� SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_ID	NAME
A365172	Diablo
A367012	Miller
A381217	Cherokee
�� ������ Kaggle�� "Austin Animal Center Shelter Intakes and Outcomes"���� �����ϴ� �����͸� ����Ͽ����� ODbL�� ������ �޽��ϴ�.

INTAKE_CONDITION�� Aged�� �ƴ� ��츦 ���� ?