3���� �¾ ���� ȸ�� ��� ����ϱ�
���� ����
������ �Ĵ� ���� ����Ʈ�� ȸ�� ������ ���� MEMBER_PROFILE ���̺��Դϴ�. MEMBER_PROFILE ���̺��� ������ ������ MEMBER_ID, MEMBER_NAME, TLNO, GENDER, DATE_OF_BIRTH�� ȸ�� ID, ȸ�� �̸�, ȸ�� ����ó, ����, ��������� �ǹ��մϴ�.

Column name	Type	Nullable
MEMBER_ID	VARCHAR(100)	FALSE
MEMBER_NAME	VARCHAR(50)	FALSE
TLNO	VARCHAR(50)	TRUE
GENDER	VARCHAR(1)	TRUE
DATE_OF_BIRTH	DATE	TRUE
����
MEMBER_PROFILE ���̺��� ������ 3���� ���� ȸ���� ID, �̸�, ����, ��������� ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� ��ȭ��ȣ�� NULL�� ���� ��´�󿡼� ���ܽ��� �ֽð�, ����� ȸ��ID�� �������� �������� �������ּ���.

����
MEMBER_PROFILE ���̺��� ������ ���� ��

MEMBER_ID	MEMBER_NAME	TLNO	GENDER	DATE_OF_BIRTH
jiho92@naver.com	����ȣ	01076432111	W	1992-02-12
jiyoon22@hotmail.com	������	01032324117	W	1992-02-22
jihoon93@hanmail.net	������	01023258688	M	1993-02-23
seoyeons@naver.com	�ڼ���	01076482209	W	1993-03-16
yoonsy94@gmail.com	������	NULL	W	1994-03-19
SQL�� �����ϸ� ������ ���� ��µǾ�� �մϴ�.

MEMBER_ID	MEMBER_NAME	GENDER	DATE_OF_BIRTH
seoyeons@naver.com	�ڼ���	W	1993-03-16
���ǻ���
DATE_OF_BIRTH�� ����Ʈ ������ ���ÿ� �����ؾ� ����ó�� �˴ϴ�.