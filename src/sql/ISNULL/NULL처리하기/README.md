NULL ó���ϱ�
���� ����
ANIMAL_INS ���̺��� ���� ��ȣ�ҿ� ���� ������ ������ ���� ���̺��Դϴ�. ANIMAL_INS ���̺� ������ ������ ������, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE�� ���� ������ ���̵�, ���� ��, ��ȣ ������, ��ȣ ���� �� ����, �̸�, ���� �� �߼�ȭ ���θ� ��Ÿ���ϴ�.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
�Ծ� �Խ��ǿ� ���� ������ �Խ��Ϸ� �մϴ�. ������ ���� ��, �̸�, ���� �� �߼�ȭ ���θ� ���̵� ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� ���α׷����� �𸣴� ������� NULL�̶�� ��ȣ�� �𸣱� ������, �̸��� ���� ������ �̸��� "No name"���� ǥ���� �ּ���.

����
���� ��� ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A350276	Cat	2017-08-13 13:50:00	Normal	Jewel	Spayed Female
A350375	Cat	2017-03-06 15:01:00	Normal	Meo	Neutered Male
A368930	Dog	2014-06-08 13:20:00	Normal	NULL	Spayed Female
������ ���� ���� �̸��� ���� ������, �� ���� �̸��� "No name"���� ǥ���մϴ�. ���� SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_TYPE	NAME	SEX_UPON_INTAKE
Cat	Jewel	Spayed Female
Cat	Meo	Neutered Male
Dog	No name	Spayed Female
�� �÷� �̸��� ��ġ���� �ʾƵ� �˴ϴ�.

�� ������ Kaggle�� "Austin Animal Center Shelter Intakes and Outcomes"���� �����ϴ� �����͸� ����Ͽ����� ODbL�� ������ �޽��ϴ�.