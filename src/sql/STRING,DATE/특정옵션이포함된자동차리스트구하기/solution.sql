SELECT CAR_ID,
        CAR_TYPE,
        DAILY_FEE,
        OPTIONS
        

FROM CAR_RENTAL_COMPANY_CAR 

    -- WHERE OPTIONS LIKE '%�׺���̼�%'
    WHERE INSTR(OPTIONS, '�׺���̼�') > 0
    ORDER BY CAR_ID desc