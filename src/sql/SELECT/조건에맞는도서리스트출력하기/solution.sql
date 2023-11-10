SELECT BOOK_ID,to_char(PUBLISHED_DATE, 'yyyy-mm-dd')

FROM BOOK 

    WHERE CATEGORY = '¿ŒπÆ' 
    AND to_char(PUBLISHED_DATE, 'yyyy') = '2021'

    ORDER BY PUBLISHED_DATE;