�̸��� el�� ���� ���� ã��
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
��ȣ�ҿ� ���ư��� �ҸӴϰ� �⸣�� ���� ã�� ����� ã�ƿԽ��ϴ�. �� ����� ���ϱ� �ҸӴϰ� �⸣�� ���� �̸��� 'el'�� ���ٰ� �մϴ�. ���� ��ȣ�ҿ� ���� ���� �̸� ��, �̸��� "EL"�� ���� ���� ���̵�� �̸��� ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� ����� �̸� ������ ��ȸ���ּ���. ��, �̸��� ��ҹ��ڴ� �������� �ʽ��ϴ�.

����
���� ��� ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A355753	Dog	2015-09-10 13:14:00	Normal	Elijah	Neutered Male
A352872	Dog	2015-07-09 17:51:00	Aged	Peanutbutter	Neutered Male
A353259	Dog	2016-05-08 12:57:00	Injured	Bj	Neutered Male
A373219	Cat	2014-07-29 11:43:00	Normal	Ella	Spayed Female
A382192	Dog	2015-03-13 13:14:00	Normal	Maxwell 2	Intact Male
�̸��� 'el'�� ���� ������ Elijah, Ella, Maxwell 2�Դϴ�.
�� ��, ���� Elijah, Maxwell 2�Դϴ�.
���� SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_ID	NAME
A355753	Elijah
A382192	Maxwell 2
�� ������ Kaggle�� "Austin Animal Center Shelter Intakes and Outcomes"���� �����ϴ� �����͸� ����Ͽ����� ODbL�� ������ �޽��ϴ�.