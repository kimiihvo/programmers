SELECT catecory, COUNT(catecory)
FROM (SELECT SUBSTR(PRODUCT_CODE, 1,2) as catecory 
        FROM PRODUCT)
GROUP BY catecory
ORDER BY catecory