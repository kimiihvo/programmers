���� �������� �����ϱ�
���� ����
ANIMAL_INS ���̺��� ���� ��ȣ�ҿ� ���� ������ ������ ���� ���̺��Դϴ�. ANIMAL_INS ���̺� ������ ������ ������, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE�� ���� ������ ���̵�, ���� ��, ��ȣ ������, ��ȣ ���� �� ����, �̸�, ���� �� �߼�ȭ ���θ� ��Ÿ���ϴ�.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
���� ��ȣ�ҿ� ���� ��� ������ ���̵�� �̸�, ��ȣ �������� �̸� ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���. ��, �̸��� ���� ���� �߿����� ��ȣ�� ���߿� ������ ������ ���� ������� �մϴ�.

����
���� ���, ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A349996	Cat	2018-01-22 14:32:00	Normal	Sugar	Neutered Male
A350276	Cat	2017-08-13 13:50:00	Normal	Jewel	Spayed Female
A396810	Dog	2016-08-22 16:13:00	Injured	Raven	Spayed Female
A410668	Cat	2015-11-19 13:41:00	Normal	Raven	Spayed Female
�̸��� ���� ������ �����ϸ� ������ ������, 'Jewel', 'Raven', 'Sugar'
'Raven'�̶�� �̸��� ���� ���� ����̰� �����Ƿ�, �� �߿����� ��ȣ�� ���߿� ������ ���� ���� ��ȸ�մϴ�.
���� SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_ID	NAME	DATETIME
A350276	Jewel	2017-08-13 13:50:00
A396810	Raven	2016-08-22 16:13:00
A410668	Raven	2015-11-19 13:41:00
A349996	Sugar	2018-01-22 14:32:00
�� ������ Kaggle�� "Austin Animal Center Shelter Intakes and Outcomes"���� �����ϴ� �����͸� ����Ͽ����� ODbL�� ������ �޽��ϴ�.