SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH,'YYYY-MM-DD')
FROM MEMBER_PROFILE 
    WHERE TLNO IS NOT NULL 
    AND GENDER = 'W' 
    AND TO_CHAR(DATE_OF_BIRTH, 'MM') = '03'
        ORDER BY MEMBER_ID;