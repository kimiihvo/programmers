���￡ ��ġ�� �Ĵ� ��� ����ϱ�
���� ����
������ �Ĵ��� ������ ���� REST_INFO ���̺�� �Ĵ��� ���� ������ ���� REST_REVIEW ���̺��Դϴ�. REST_INFO ���̺��� ������ ������ REST_ID, REST_NAME, FOOD_TYPE, VIEWS, FAVORITES, PARKING_LOT, ADDRESS, TEL�� �Ĵ� ID, �Ĵ� �̸�, ���� ����, ��ȸ��, ���ã���, ������ ����, �ּ�, ��ȭ��ȣ�� �ǹ��մϴ�.

Column name	Type	Nullable
REST_ID	VARCHAR(5)	FALSE
REST_NAME	VARCHAR(50)	FALSE
FOOD_TYPE	VARCHAR(20)	TRUE
VIEWS	NUMBER	TRUE
FAVORITES	NUMBER	TRUE
PARKING_LOT	VARCHAR(1)	TRUE
ADDRESS	VARCHAR(100)	TRUE
TEL	VARCHAR(100)	TRUE
REST_REVIEW ���̺��� ������ ������ REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT,REVIEW_DATE�� ���� ���� ID, �Ĵ� ID, ȸ�� ID, ����, ���� �ؽ�Ʈ, ���� �ۼ����� �ǹ��մϴ�.

Column name	Type	Nullable
REVIEW_ID	VARCHAR(10)	FALSE
REST_ID	VARCHAR(10)	TRUE
MEMBER_ID	VARCHAR(100)	TRUE
REVIEW_SCORE	NUMBER	TRUE
REVIEW_TEXT	VARCHAR(1000)	TRUE
REVIEW_DATE	DATE	TRUE
����
REST_INFO�� REST_REVIEW ���̺��� ���￡ ��ġ�� �Ĵ���� �Ĵ� ID, �Ĵ� �̸�, ���� ����, ���ã���, �ּ�, ���� ��� ������ ��ȸ�ϴ� SQL���� �ۼ����ּ���. �̶� ���� ��������� �Ҽ��� �� ��° �ڸ����� �ݿø� ���ֽð� ����� ��������� �������� �������� �������ֽð�, ��������� ���ٸ� ���ã����� �������� �������� �������ּ���.

����
REST_INFO ���̺��� ������ ����

REST_ID	REST_NAME	FOOD_TYPE	VIEWS	FAVORITES	PARKING_LOT	ADDRESS	TEL
00028	���δ��	�ѽ�	52310	10	N	��⵵ ���ν� ó�α� ������ ó�μ��� 309	031-235-1235
00039	���ֽĴ�	�ѽ�	23001	20	N	��⵵ ��õ�� �����8���� 60	031-235-6423
00035	���̽Ĵ�	�Ͻ�	532123	80	N	����Ư���� ������ ���ΰ�����76����	02-135-1266
REST_REVIEW ���̺��� ������ ���� ��

REVIEW_ID	REST_ID	MEMBER_ID	REVIEW_SCORE	REVIEW_TEXT	REVIEW_DATE
R000000065	00028	soobin97@naver.com	5	���� �������� ������� ���̳��� ���	2022-04-12
R000000066	00039	yelin1130@gmail.com	5	��ġ� �ְ��ϴ�.	2022-02-12
R000000067	00028	yelin1130@gmail.com	5	���� ���Ƽ� ���ƿ�	2022-02-22
R000000068	00035	ksyi0316@gmail.com	5	����ȸ�� �����ݴϴ�.	2022-02-15
R000000069	00035	yoonsy95@naver.com	4	�񸰳��� ���������.	2022-04-16
SQL�� �����ϸ� ������ ���� ��µǾ�� �մϴ�.

REST_ID	REST_NAME	FOOD_TYPE	FAVORITES	ADDRESS	SCORE
00035	���̽Ĵ�	�Ͻ�	80	����Ư���� ������ ���ΰ�����76����	4.50