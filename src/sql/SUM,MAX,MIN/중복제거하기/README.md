�ߺ� �����ϱ�
���� ����
ANIMAL_INS ���̺��� ���� ��ȣ�ҿ� ���� ������ ������ ���� ���̺��Դϴ�. ANIMAL_INS ���̺� ������ ������ ������, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE�� ���� ������ ���̵�, ���� ��, ��ȣ ������, ��ȣ ���� �� ����, �̸�, ���� �� �߼�ȭ ���θ� ��Ÿ���ϴ�.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
���� ��ȣ�ҿ� ���� ������ �̸��� �� ������ ��ȸ�ϴ� SQL ���� �ۼ����ּ���. �̶� �̸��� NULL�� ���� �������� ������ �ߺ��Ǵ� �̸��� �ϳ��� Ĩ�ϴ�.

����
���� ��� ANIMAL_INS ���̺��� ������ ���ٸ�

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A562649	Dog	2014-03-20 18:06:00	Sick	NULL	Spayed Female
A412626	Dog	2016-03-13 11:17:00	Normal	*Sam	Neutered Male
A563492	Dog	2014-10-24 14:45:00	Normal	*Sam	Neutered Male
A513956	Dog	2017-06-14 11:54:00	Normal	*Sweetie	Spayed Female
��ȣ�ҿ� ���� ������ �̸��� NULL(����), *Sam, *Sam, *Sweetie�Դϴ�. �� �� NULL�� �ߺ��Ǵ� �̸��� ����ϸ�, ��ȣ�ҿ� ���� ���� �̸��� ���� 2�Դϴ�. ���� SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

count
2
�� �÷� �̸�(�� ���������� count)�� ��ġ���� �ʾƵ� �˴ϴ�.

