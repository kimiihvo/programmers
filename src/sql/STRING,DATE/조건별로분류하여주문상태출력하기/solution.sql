SELECT ORDER_ID, PRODUCT_ID, to_char(OUT_DATE, 'yyyy-mm-dd'),
        CASE 
            WHEN to_number(to_char(OUT_DATE, 'yyyymmdd')) <= '20220501' THEN '출고완료'
            WHEN to_number(to_char(OUT_DATE, 'yyyymmdd')) > '20220501' THEN '출고대기'
            ELSE '출고미정'
        END
        AS 출고여부
FROM FOOD_ORDER 
    
    ORDER BY ORDER_ID