SELECT HISTORY_ID,
        CAR_ID,
        to_char(START_DATE, 'yyyy-mm-dd') as START_DATE,
        to_char(END_DATE, 'yyyy-mm-dd') as END_DATE,
        
        CASE WHEN 
            END_DATE - START_DATE +1 >= 30 THEN '��� �뿩'
            ELSE '�ܱ� �뿩'
        END as RENT_TYPE
        
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
    -- �뿩 �������� 2022-09
    WHERE to_char(START_DATE, 'yyyy-mm') ='2022-09'
    ORDER BY HISTORY_ID desc