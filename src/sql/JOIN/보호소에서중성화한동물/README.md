��ȣ�ҿ��� �߼�ȭ�� ����
���� ����
ANIMAL_INS ���̺��� ���� ��ȣ�ҿ� ���� ������ ������ ���� ���̺��Դϴ�. ANIMAL_INS ���̺� ������ ������ ������, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE�� ���� ������ ���̵�, ���� ��, ��ȣ ������, ��ȣ ���� �� ����, �̸�, ���� �� �߼�ȭ ���θ� ��Ÿ���ϴ�.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
ANIMAL_OUTS ���̺��� ���� ��ȣ�ҿ��� �Ծ� ���� ������ ������ ���� ���̺��Դϴ�. ANIMAL_OUTS ���̺� ������ ������ ������, ANIMAL_ID, ANIMAL_TYPE, DATETIME, NAME, SEX_UPON_OUTCOME�� ���� ������ ���̵�, ���� ��, �Ծ���, �̸�, ���� �� �߼�ȭ ���θ� ��Ÿ���ϴ�. ANIMAL_OUTS ���̺��� ANIMAL_ID�� ANIMAL_INS�� ANIMAL_ID�� �ܷ� Ű�Դϴ�.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_OUTCOME	VARCHAR(N)	FALSE
��ȣ�ҿ��� �߼�ȭ ������ ��ģ ���� ������ �˾ƺ��� �մϴ�. ��ȣ�ҿ� ���� ��ÿ��� �߼�ȭ1���� �ʾ�����, ��ȣ�Ҹ� ���� ��ÿ��� �߼�ȭ�� ������ ���̵�� ���� ��, �̸��� ��ȸ�ϴ� ���̵� ������ ��ȸ�ϴ� SQL ���� �ۼ����ּ���.

����
���� ���, ANIMAL_INS ���̺�� ANIMAL_OUTS ���̺��� ������ ���ٸ�

ANIMAL_INS

ANIMAL_ID	ANIMAL_TYPE	DATETIME	INTAKE_CONDITION	NAME	SEX_UPON_INTAKE
A367438	Dog	2015-09-10 16:01:00	Normal	Cookie	Spayed Female
A382192	Dog	2015-03-13 13:14:00	Normal	Maxwell 2	Intact Male
A405494	Dog	2014-05-16 14:17:00	Normal	Kaila	Spayed Female
A410330	Dog	2016-09-11 14:09:00	Sick	Chewy	Intact Female
ANIMAL_OUTS

ANIMAL_ID	ANIMAL_TYPE	DATETIME	NAME	SEX_UPON_OUTCOME
A367438	Dog	2015-09-12 13:30:00	Cookie	Spayed Female
A382192	Dog	2015-03-16 13:46:00	Maxwell 2	Neutered Male
A405494	Dog	2014-05-20 11:44:00	Kaila	Spayed Female
A410330	Dog	2016-09-13 13:46:00	Chewy	Spayed Female
Cookie�� ��ȣ�ҿ� ���� ��ÿ� �̹� �߼�ȭ�Ǿ��־����ϴ�.
Maxwell 2�� ��ȣ�ҿ� ���� �� �߼�ȭ�Ǿ����ϴ�.
Kaila�� ��ȣ�ҿ� ���� ��ÿ� �̹� �߼�ȭ�Ǿ��־����ϴ�.
Chewy�� ��ȣ�ҿ� ���� �� �߼�ȭ�Ǿ����ϴ�.
���� SQL���� �����ϸ� ������ ���� ���;� �մϴ�.

ANIMAL_ID	ANIMAL_TYPE	NAME
A382192	Dog	Maxwell 2
A410330	Dog	Chewy
�� ������ Kaggle�� "Austin Animal Center Shelter Intakes and Outcomes"���� �����ϴ� �����͸� ����Ͽ����� ODbL�� ������ �޽��ϴ�.

�߼�ȭ�� ��ġ�� ���� ������ ���� �� �߼�ȭ ���ο� Intact, �߼�ȭ�� ��ģ ������ Spayed �Ǵ� Neutered��� ǥ�õǾ��ֽ��ϴ�. ?