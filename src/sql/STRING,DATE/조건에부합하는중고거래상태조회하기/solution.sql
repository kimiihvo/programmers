
SELECT BOARD_ID, 
        WRITER_ID, 
        TITLE, 
        PRICE,
        CASE STATUS
        WHEN 'SALE' THEN '판매중'
        WHEN 'RESERVED' THEN '예약중'
        WHEN 'DONE' THEN '거래완료'
        END as STATUS
FROM USED_GOODS_BOARD 
        WHERE to_char(CREATED_DATE, 'yyyy-mm-dd') = '2022-10-05'
        ORDER BY BOARD_ID desc