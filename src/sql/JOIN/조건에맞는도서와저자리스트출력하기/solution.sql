SELECT BOOK_ID, AUTHOR_NAME, to_char(PUBLISHED_DATE, 'yyyy-mm-dd') PUBLISHED_DATE

FROM BOOK b, AUTHOR a

    WHERE b.AUTHOR_ID = a.AUTHOR_ID

    AND CATEGORY = '����'

    ORDER BY PUBLISHED_DATE