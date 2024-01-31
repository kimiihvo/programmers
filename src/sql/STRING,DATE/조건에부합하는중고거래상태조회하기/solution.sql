
SELECT BOARD_ID, 
        WRITER_ID, 
        TITLE, 
        PRICE,
        CASE STATUS
        WHEN 'SALE' THEN '�Ǹ���'
        WHEN 'RESERVED' THEN '������'
        WHEN 'DONE' THEN '�ŷ��Ϸ�'
        END as STATUS
FROM USED_GOODS_BOARD 
        WHERE to_char(CREATED_DATE, 'yyyy-mm-dd') = '2022-10-05'
        ORDER BY BOARD_ID desc