-- �ڵ带 �Է��ϼ���
SELECT name, count(name)

FROM ANIMAL_INS 

    WHERE name is not null 

        GROUP BY name

        HAVING count(name) > 1

        ORDER BY name