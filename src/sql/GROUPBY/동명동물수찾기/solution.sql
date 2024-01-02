-- 코드를 입력하세요
SELECT name, count(name)

FROM ANIMAL_INS 

    WHERE name is not null 

        GROUP BY name

        HAVING count(name) > 1

        ORDER BY name