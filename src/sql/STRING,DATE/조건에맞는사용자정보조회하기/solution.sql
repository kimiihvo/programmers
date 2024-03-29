SELECT USER_ID, NICKNAME
        ,CITY ||' '||STREET_ADDRESS1||' '||STREET_ADDRESS2 as 전체주소
        ,REGEXP_REPLACE(TLNO, '(.{3})(.+)(.{4})', '\1-\2-\3') as 전화번호
FROM USED_GOODS_BOARD b
        INNER JOIN USED_GOODS_USER u ON b.WRITER_ID = u.USER_ID
        GROUP BY USER_ID, NICKNAME,CITY,STREET_ADDRESS1,STREET_ADDRESS2,TLNO
        HAVING count(WRITER_ID) > 2
        ORDER BY USER_ID desc