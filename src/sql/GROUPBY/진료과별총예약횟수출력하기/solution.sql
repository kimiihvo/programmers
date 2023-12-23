
SELECT MCDP_CD as 진료과코드, count(*) as "5월예약건수" 
FROM APPOINTMENT  

WHERE to_char(APNT_YMD,'yyyy-mm') = '2022-05' 

GROUP BY MCDP_CD

ORDER BY count(*), MCDP_CD
