SELECT ORDER_ID, PRODUCT_ID, to_char(OUT_DATE, 'yyyy-mm-dd'),
        CASE 
            WHEN to_number(to_char(OUT_DATE, 'yyyymmdd')) <= '20220501' THEN '���Ϸ�'
            WHEN to_number(to_char(OUT_DATE, 'yyyymmdd')) > '20220501' THEN '�����'
            ELSE '������'
        END
        AS �����
FROM FOOD_ORDER 
    
    ORDER BY ORDER_ID