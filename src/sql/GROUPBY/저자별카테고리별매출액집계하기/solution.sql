WITH jan AS (
    SELECT *
    FROM BOOK_SALES 
        WHERE to_char(SALES_DATE, 'yyyy-mm') = '2022-01'
)

SELECT a.AUTHOR_ID, AUTHOR_NAME, CATEGORY , SUM(sales*b.price)
FROM AUTHOR a 
    INNER JOIN BOOK b on a.AUTHOR_ID = b.AUTHOR_ID
    INNER JOIN jan on jan.BOOK_ID = b.BOOK_ID
    
    GROUP BY a.AUTHOR_ID, AUTHOR_NAME, CATEGORY 
    ORDER BY a.AUTHOR_ID asc , category desc