��ÿ� ���� ã��
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
���� ��ȣ�ҿ� ���� ���� �� �̸��� Lucy, Ella, Pickle, Rogan, Sabrina, Mitty�� ������ ���̵�� �̸�, ���� �� �߼�ȭ ���θ� ��ȸ�ϴ� SQL ���� �ۼ����ּ���.

����
�̶� ����� ���̵� ������ ��ȸ���ּ���. ���� ��� ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A373219	Cat	2014-07-29 11:43:00	Normal	Ella	Spayed Female
A377750	Dog	2017-10-25 17:17:00	Normal	Lucy	Spayed Female
A353259	Dog	2016-05-08 12:57:00	Injured	Bj	Neutered Male
A354540	Cat	2014-12-11 11:48:00	Normal	Tux	Neutered Male
A354597	Cat	2014-05-02 12:16:00	Normal	Ariel	Spayed Female
SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_ID	NAME	SEX_UPON_INTAKE
A373219	Ella	Spayed Female
A377750	Lucy	Spayed Female
�� ������ Kaggle�� "Austin Animal Center Shelter Intakes and Outcomes"���� �����ϴ� �����͸� ����Ͽ����� ODbL�� ������ �޽��ϴ�.